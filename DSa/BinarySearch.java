package javaTut.DSa;

class BinarySearch{
    public static int binarySearch(int arr[],int key){
        int low =0;
        int high = arr.length -1;
        while(low <= high){
            int mid = (low+high)/2;
            if(arr[mid] == key){
                return mid;
            }
            else if(arr[mid] > key){
                high = mid -1;
            }
            else{
                low = mid +1;
            }
        }
        return -1;
    }
    public static int binarySearchCountUnsuccessfull(int arr[],int key){
        int low =0;
        int high = arr.length -1;
        int count =0;
        while(low <= high){
            int mid = (low+high)/2;
            if(arr[mid] == key){
                return count;
            }
            else if(arr[mid] > key){
                high = mid -1;
                count++;
            }
            else{
                count++;
                low = mid +1;
            }
        }
        return count;
    }

    public static int binarySearchCount(int arr[],int key){
        int low =0;
        int high = arr.length -1;
        int count =0;
        while(low <= high){
            int mid = (low+high)/2;
            count++;
            if(arr[mid] == key){
                break ;
            }
            else if(arr[mid] > key){
                high = mid -1;
               
            }
            else{
                low = mid +1;
                
            }
        }
        return count;
    }
    

    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,7,8,9,10};
        int index = binarySearch(arr, 7);
        if(index > -1){
            System.out.println("element present at index"+ index);
        }
        else{
            System.out.println("element not present in array");
        }
        System.out.println(binarySearchCount(arr, 10));
    }
}