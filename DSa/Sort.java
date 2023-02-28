package javaTut.DSa;

public class Sort {
    public static void quickSort(int arr[], int low, int high){
       if(low < high){
            int pivot =  partation(arr, low, high);
            quickSort(arr, low, pivot-1);
            quickSort(arr, pivot + 1, high);
       }
    }
    public static int partation(int arr[], int low, int high){
       int pivotele =  arr[high];
       int j = low -1;
       
       for (int i = low; i < high; i++) {
            if(pivotele > arr[i]){
                j++;
                int temp =  arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
       }
        j++;
        int temp =  arr[high];
        arr[high] = arr[j];
        arr[j] = temp;

        return j;
    }


    public static void bubbleSort(int arr[]){
        
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = 0; j < arr.length-1-i; j++) {
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j + 1] = temp;
                }
            }
        }

    }
    public static void bubbleSortOpt(int arr[]){

        for (int i = 0; i < arr.length-1; i++) {
            boolean flag = false;
            for (int j = 0; j < arr.length -i-1; j++) {
                if(arr[j] > arr[j+1]){
                    int temp =  arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    flag = true;
                }
            }
            if(flag == false){
                break;
            }
        }
    }
    public static void selectionSort(int arr[]){
        for (int i = 0; i < arr.length-1; i++) {
            
            int key = arr[i];
            int minIndex = i;
            for (int j = i+1; j < arr.length; j++) {
                if(key > arr[j]){
                    key = arr[j];
                    minIndex = j;
                }
            }
            arr[minIndex ] = arr[i];
            arr[i] = key;
        }
    }
    public static void insertionSort(int arr[]){
        for (int i = 1; i < arr.length-1; i++) {
            int j = i-1;
            int key = arr[i];
            while(j >= 0 && key < arr[j]){
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = key;
        }
    }
    public static int[] insertionSort(int arr1[],int arr2[]){
        int n1 = arr1.length;
        int n2 = arr2.length;
        int arr[] = new int[n1+n2];
        for (int i = 0; i < arr1.length; i++) {
            arr[i] = arr1[i];
        }
        int k = 0;
        for (int i = n1; i < arr.length; i++) {
            int j = i-1;
            int key = arr2[k++];
            while(j >= 0 && key < arr[j]){
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = key;
        }
        return arr;
    }


    public static void mergeSort(int arr[], int low, int high ){
        if(low < high){
            int mid = (low + high) /2; 
            mergeSort(arr, low, mid);
            mergeSort(arr, mid + 1, high);
            merge(arr, low, mid, high);
        }
    }

    public static void merge(int arr[], int low, int mid, int high){
        int n1 = mid - low +1;
        int n2 = high - mid;

        int left[] = new int[n1];
        int right[] =  new int[n2];

        for (int i = 0; i < n1; i++) {
            left[i] = arr[i + low];
        }
        for (int i = 0; i < n2; i++) {
            right[i] =  arr[mid+1+i];
        }

        int i = 0; int j = 0 ; int k = 0;
        int res[] =  new int[n1+n2];

        while (i <n1 && j < n2) {
            if(left[i] < right[j]){
                res[k] =  left[i];
                i++;
                k++;
            }
            else{
                res[k] = right[j];
                j++;
                k++;
            }
        }

        while(i < n1){
            res[k] =  left[i];
            i++;
            k++;
        }

        while(j < n2){
            res[k] =  right[j];
            j++;
            k++;
        }

        for (int l = 0; l < res.length; l++) {
            arr[low + l ] =  res[l];
        }

    }
    public static void main(String[] args) {
        int arr[] = {5,4,3,2,1};
        // int arr1[] = {1,3,5};
        // int arr2[] = {2,4,7};
        // bubbleSort(arr);
        // bubbleSortOpt(arr);
        // int arr[] = insertionSort(arr1, arr2);
        quickSort(arr, 0, 4);
        // mergeSort(arr, 0, 4);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
