public class CoinExchange {
    public static int totalNumberOfWays(int coins[], int amount){
        int ways = 0;
        int table[][] = new int[coins.length + 1][amount +1];
        for (int i = 0; i < table[0].length; i++) {
            table[0][i] = 0;
        }
        for (int i = 0; i < table.length; i++) {
            table[i][0] = 1;
        }
        for (int i = 1; i < table.length; i++) {
            for (int j = 1; j < table[0].length; j++) {
                if(coins[i-1] > j){
                    table[i][j] = table[i-1][j];
                }
                else{
                    table[i][j] = table[i-1][j]+table[i][j-coins[i-1]];
                }
            }
        }
        ways = table[coins.length][amount];
        
        return ways;
    }
    public static int minCoins(int coins[], int amount){
        
        int table[][] = new int[coins.length + 1][amount +1];
        for (int i = 0; i < table[0].length; i++) {
            table[0][i] = Integer.MAX_VALUE;
        }
        for (int i = 0; i < table.length; i++) {
            table[i][0] = 0;
        }
        
        for (int i = 1; i < table.length; i++) {
            for (int j = 1; j < table[0].length; j++) {
                if(coins[i-1] > j){
                    table[i][j] = table[i-1][j];
                }
                else{
                    if(table[i][j-coins[i-1]] != Integer.MAX_VALUE){
                        table[i][j] = Math.min(table[i-1][j],1+table[i][j-coins[i-1]] );
                    }
                    else{
                        table[i][j] = table[i-1][j];
                    }
                    
                    
                }
            }
        }
        // for (int i = 0; i < table.length; i++) {
        //     for (int j = 0; j < table[0].length; j++) {
        //         System.out.print(table[i][j]+" ");
        //     }
        //     System.out.println();
        // }
        
        return table[coins.length][amount];
    }
    public static void main(String[] args) {
        int amount =7;
        int coins[] = {1,2,3,5};
        System.out.println(totalNumberOfWays(coins, amount));
        System.out.println(minCoins(coins, amount));
    }
}
