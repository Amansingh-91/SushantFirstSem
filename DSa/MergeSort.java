package javaTut.DSa;

public class MergeSort {
    public static void mergeSort(int arr[],int temp[], int low, int high ){
        if(low < high){
            int mid =  (low + high) / 2;
            mergeSort(arr,temp, low, mid);
            mergeSort(arr, temp,mid+1, high);
            merge(arr, temp,low, mid,high);
        }
    }

    public static void merge(int arr[], int temp[],int low, int mid, int high){

        int i =low; int j = mid+1; int k =low;
        
        while(i<mid+1 && j <=high){
            if(arr[i] < arr[j]){
                temp[k] = arr[i];
                i++;
                k++;
            }
            else{
                temp[k] = arr[j];
                j++;
                k++;
            }
        }

        while(i < mid+1){
            temp[k] = arr[i];
            i++;
            k++;
        }
        while(j <= high){
            temp[k] = arr[j];
            j++;
            k++;
        }

        for (int l = low; l <= high; l++) {
            arr[l] = temp[l];
        }


    }

    public static int mergeSortCount(int arr[],int temp[], int low, int high ){
        int count = 0;
        if(low < high){
            int mid =  (low + high) / 2;
            count += mergeSortCount(arr,temp, low, mid);
            count += mergeSortCount(arr, temp,mid+1, high);
            count += mergeCount(arr, temp,low, mid,high);
        }
        return count;
    }

    public static int mergeCount(int arr[], int temp[],int low, int mid, int high){
        int count = 0;
        int i =low; int j = mid+1; int k =low;
        
        while(i<mid+1 && j <=high){
            if(arr[i] < arr[j]){
                temp[k] = arr[i];
                i++;
                k++;
            }
            else{
                temp[k] = arr[j];
                count += (mid +1) - (low + i);
                j++;
                k++;
            }
        }

        while(i < mid+1){
            temp[k] = arr[i];
            
            i++;
            k++;
        }
        while(j <= high){
            temp[k] = arr[j];
            j++;
            k++;
        }

        for (int l = low; l <= high; l++) {
            arr[l] = temp[l];
        }
        return count;

    }

    public static void main(String[] args) {
        int arr[] = {2, 4, 1, 3, 5};
        int count = mergeSortCount(arr, new int[arr.length], 0, 4);

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        System.out.println("count is : "+ count);
    }
}
