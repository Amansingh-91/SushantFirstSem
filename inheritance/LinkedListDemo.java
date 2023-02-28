package javaTut.inheritance;

public class LinkedListDemo<T> {
    class Node{
        T data;
        Node next;
        // Node<T> prev;
        public Node(T data){
            this.data =  data;
            this.next = null;
            // this.prev =  null;
        }
    }
    Node head;
    Node tail;
    public LinkedListDemo(){
        head = null;
    }

    public void insertInBegin(T data){
        Node newNode = new Node(data);
        if(this.head == null){
            this.head = newNode;
            this.tail =  newNode;
        }
        else{
            newNode.next = head;
            head =  newNode;
        }

    }

    public void deleteInBegin(){
        
        if(this.head == null){
            System.out.println("Underflow");
        }
        else{
            Node temp =  head;
            head =  temp.next;
            temp.next = null;
            if(this.head == null){
                this.tail = null;
            }
        }

    }

    public void insertInEnd(T data){
        Node newNode = new Node(data);
        if(this.head == null){
            this.head = newNode;
            this.tail = newNode;
        }
        else{
            // Node temp =  head;
            // while(temp.next != null){
            //     temp = temp.next;
            // }
            // temp.next = newNode;
            this.tail.next = newNode;
            this.tail =  newNode;
        }

    }

    public void deleteInEnd(){
       
        if(this.head == null){
            System.out.println("Underflow");
        }
        else if(this.head.next == null){
            this.head =  null;
            this.tail = null;
        }
        else{
            Node temp =  head;
            while(temp.next.next != null){
                temp = temp.next;
            }
            temp.next = null;
            this.tail = temp;
        }

    }

    public void printLL(){
        if(head == null){
            System.out.println("Head -> X");
            return;
        }
        System.out.print("Head -> ");
        Node temp =  head;
        while(temp != null){
            System.out.print(temp.data+" -> ");
            temp =  temp.next;
        }
        System.out.print("X");
        System.out.println();


    }


    public static void main(String[] args) {
        LinkedListDemo<Integer> ll = new LinkedListDemo<>();
        ll.printLL();
        ll.insertInBegin(12);
        ll.insertInBegin(13);
        ll.printLL();
        ll.insertInEnd(5);
        ll.printLL();

        ll.deleteInBegin();
        ll.printLL();
        ll.deleteInEnd();
        ll.printLL();
        ll.deleteInEnd();
        ll.printLL();

    }

}

