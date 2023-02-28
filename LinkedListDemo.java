package javaTut;



public class LinkedListDemo<T>{
    class Node{
        int key;
        Node next;
        public Node(int key){
            this.key =  key;
            this.next =  null;
        }
    }
    Node head;
    Node tail;
    public LinkedListDemo(){
        this.head =  null;
        this.tail =  null;
    }

    public void insertAtBegin(int key){
        Node newNode = new Node(key);
        if(this.head == null){
            this.head = newNode;
            this.tail =  newNode;
        }else{
            newNode.next =  this.head;
            this.head = newNode;
        }

    }

    public void deleteAtBegin(){
        
        if(this.head == null){
            System.out.println("underflow");
        }else{
            Node temp =  this.head;
            this.head =  temp.next;
            temp.next = null;
            if(this.head == null){
                this.tail = null;
            }
        }
        


    }


    public void insertAtEnd(int key){
        Node newNode = new Node(key);
        if(this.head == null){
            this.head = newNode;
            this.tail = newNode;
        }else{
        //     Node temp  = this.head;
            
        //     while(temp.next != null){
                
        //         temp =  temp.next;
        //     }
        //     temp.next =  newNode;
            this.tail.next = newNode;
            this.tail = newNode;
        }

    }

    public void deleteAtEnd(){
        
        if(this.head == null){
            System.out.println("underflow");
        }
        else if(this.head.next == null){
            this.head = null;
            this.tail =  null;
        }
        else{
            Node temp =  this.head;
            while(temp.next.next != null){
                temp = temp.next;
            }
            temp.next = null;
            this.tail = temp;
        }

    }

    public void printLL(){
        if(this.head == null){
            System.out.println("Head -> X");
        }else{
            Node temp  = this.head;
            System.out.print("Head -> ");
            while(temp != null){
                System.out.print(temp.key+" -> ");
                temp =  temp.next;
            }
            System.out.print("X");
            System.out.println();
        }
    }

    public static void main(String[] args) {
        LinkedListDemo obj = new LinkedListDemo();
        // 12,13,5,3,9,10
        obj.printLL();
        obj.insertAtBegin(12);
        obj.insertAtBegin(13);
        obj.insertAtBegin(5);
        obj.insertAtBegin(3);
        obj.insertAtBegin(9);
        obj.insertAtBegin(10);
        obj.printLL();
        System.out.println("********************************************");
        // 31, 42
        obj.insertAtEnd(31);
        obj.insertAtEnd(42);
        obj.printLL();
        System.out.println("********************************************");
        obj.deleteAtBegin();
        obj.printLL();
        obj.deleteAtEnd();
        obj.printLL();
        obj.insertAtEnd(55);
        obj.printLL();
        // Node newNode =  obj.new Node(82);
        // System.out.println(newNode);
        // LinkedListDemo obj1 = new LinkedListDemo();
        // System.out.println("new Linked List obj1");
        // obj1.insertAtBegin(11);
        // obj1.printLL();
        // obj1.deleteAtEnd();






    }
    

}


