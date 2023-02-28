package javaTut.LPU;

class LinkedListDemo{
    static class Node{
        int key;
        Node next;
        
        Node(int data){
            
            key = data;
            next = null;
        }
    }

    Node head ;
    LinkedListDemo(){
        head = null;
    }

    public void insertInBegin(int data){
        Node  newNode = new Node(data);
        if(head == null){
            head = newNode;
        }
        else{
            newNode.next = head;
            head = newNode;
        }
    }

    public void insertInEnd(int data){
        Node  newNode = new Node(data);
        if(head == null){
            head = newNode;
        }
        else{
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newNode;
        }
    }

    public void deleteInBegin(){
        
        if(head == null){
            System.out.println("Underflow Condition");
        }
        else{
           Node temp =  head;
           head = temp.next;
           temp.next = null;
        }
    }

    public void deleteInEnd(){
        
        if(head == null){
            System.out.println("Underflow Condition");
        }
        else if(head.next == null){
            head = null;
        }
        else{
           Node temp =  head;
           while (temp.next.next != null) {
                temp = temp.next; 
           }
           temp.next = null;
        }
    }
    
    public void printLL(){
            if(head == null){
                System.out.println("Head -> X");
            }
            else{
                Node temp = head;
                System.out.print("Head ->");
                while (temp != null) {
                    System.out.print(" " + temp.key + " ->");
                    temp = temp.next;
                }
                System.out.print(" X");
                System.out.println();
            }


    }
    public boolean detectLoop(){
        Node fast = head;
        Node slow = head;

        
            while (slow != null && fast != null && fast.next != null) {
                slow = slow.next;
                fast = fast.next.next;
                
                
                if(fast == slow){
                    return true;
                }
            }
        
       
        return false;

    }
    public void createLoop(int n){
        int count =0;
        Node key = null;
        Node tail = null;
        Node Temp = head;
        while (Temp != null) {
           count++;
           if(count == n){
            key = Temp;
           } 
           if(Temp.next == null){
            tail = Temp;
           }
           Temp = Temp.next;
        }
        if(key == null){
            tail.next = head;
        }
        else{
            tail.next = key;
        }
    }
    public static void main(String[] args) {
        LinkedListDemo obj = new LinkedListDemo();
        obj.printLL();
        obj.insertInBegin(15);
        obj.insertInBegin(12);
        obj.insertInBegin(11);
        obj.printLL();
        LinkedListDemo obj1 = new LinkedListDemo();
        obj1.printLL();
        obj1.insertInBegin(15);
        obj1.insertInBegin(13);
        obj1.insertInBegin(119);
        obj1.printLL();
        obj1.createLoop(2);

        System.out.println(obj.detectLoop());
        System.out.println(obj1.detectLoop());
    }

}


