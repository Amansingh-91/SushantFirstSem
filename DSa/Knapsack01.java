class arrnapsack01 {

	// A utility function that returns
	// maximum of two integers
	static int max(int a, int b) { return (a > b) ? a : b; }

	// Returns the maximum value that can
	// be put in a knapsack of capacity capacity
	static int knapSack(int capacity, int wt[], int val[], int n)
	{
		int i, w;
		int arr[][] = new int[n + 1][capacity + 1];

		// Build table arr[][] in bottom up manner
		for (i = 0; i <= n; i++) {
			for (w = 0; w <= capacity; w++) {
				if (i == 0 || w == 0)
					{arr[i][w] = 0;}

				else if (wt[i - 1] <= w)
					arr[i][w]
						= max(val[i - 1]
								+ arr[i - 1][w - wt[i - 1]],
							arr[i - 1][w]);
				else
					arr[i][w] = arr[i - 1][w];
			}
		}

		return arr[n][capacity];
	}

	public static void main(String args[])
	{
		int profit[] = new int[] { 60, 100, 120 };
		int weight[] = new int[] { 10, 20, 30 };
		int capacity = 50;
		int n = profit.length;
		System.out.println(knapSack(capacity, weight, profit, n));
	}
}

