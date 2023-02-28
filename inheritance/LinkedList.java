package javaTut.inheritance;

class LinkedList{
    static class Node{
        int key;
        Node next;
    
        Node(int key){
            this.key =  key;
            this.next =  null;
        }
    }
    Node head;
    public void insertInBegin(int key){
        // node creation
        Node newNode = new Node(key);

        if(this.head == null){
            this.head = newNode;
        }
        else{
            newNode.next =  this.head;
            this.head =  newNode;
        }


    }

    public void deleteInBegin(){
        

        if(this.head == null){
            System.out.println("Underflow Condition");
        }
        else{
            Node temp = this.head;
            this.head = this.head.next;
            temp.next =  null;
        }

        

    }
    public void printLL() {
            if(this.head == null){
                System.out.println("Head -> X");
            }
            else{
                Node temp = this.head;
                System.out.print("Head -> ");
                while(temp != null){
                    System.out.print(temp.key + " -> ");
                    temp =  temp.next;
                }
                System.out.print("X");
                System.out.println();
            }
    }

    public static void main(String[] args) {
        LinkedList obj =  new LinkedList();
        obj.printLL();
        obj.insertInBegin(15);
        obj.insertInBegin(12);
        obj.insertInBegin(11);
        obj.printLL();
        System.out.println("*****************************************");
        obj.deleteInBegin();
        obj.printLL();
        obj.deleteInBegin();
        obj.printLL();
        obj.deleteInBegin();
        obj.printLL();
        obj.deleteInBegin();
        obj.printLL();

    }

}
