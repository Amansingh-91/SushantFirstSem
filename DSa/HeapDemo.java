public class HeapDemo {
    int arr[];
    int maxSize;
    int heapSize;
    HeapDemo(int maxSize){
        this.maxSize = maxSize;
        arr = new int[maxSize];
        heapSize =0;
    }

    public int parent(int i){
        return (i-1)/2;
    }
    public int leftChild(int i){
        return 2 * i +1;
    }
    public int rightChild(int i){
        return 2 * i +2;
    }
    public void insert(int key){
        if(maxSize != heapSize){
            if(heapSize == 0){
                arr[0] = key;
                heapSize++;
            }
            else{
                
                arr[heapSize++] = key;
                // for (int i = heapSize -1; i >=0; i--) {
                //     maxHepify(i);
                // }
                int child = heapSize-1;
                int i = parent(child);
                while (i >=0 && arr[child] > arr[i] ) {
                    int temp = arr[child];
                    arr[child ] = arr[i];
                    arr[i]= temp;
                    child = i;
                    i = parent(child);
                    
                }
            }

        }

    }
    public void maxHepify(int i){
        int largest = i;
        int lchild = leftChild(i);
        int rChild = rightChild(i);
        if(lchild < heapSize  && arr[largest] < arr [lchild]){
            largest = lchild;
        }
        if(rChild < heapSize && arr[largest] < arr[rChild]){
            largest = rChild;
        }
        if(largest != i){
            int temp = arr[largest];
            arr[largest ] = arr[i];
            arr[i]= temp;
            maxHepify(largest);
        }

    }
    public int deleteMax(){
        if(heapSize == 0){
            System.out.println("underflow");
            return -1;
        }
        if(heapSize == 1){
            int del = arr[0];
            arr[0]  = -1;
            heapSize--;
            return del;
        }
        else{
            int del = arr[0];
            arr[0] = arr[heapSize -1];
            heapSize--;
            maxHepify(0);
            return del;
        }
    }
    public void printHeap(){
        for (int i = 0; i < heapSize; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        HeapDemo h = new HeapDemo(20);
        h.insert(15);
        h.printHeap();
        h.insert(25);
        h.printHeap();
        h.insert(30);
        h.insert(50);
        h.insert(8);
        h.insert(26);
        h.printHeap();
        System.out.println(h.deleteMax());
        h.printHeap();

    }

}
