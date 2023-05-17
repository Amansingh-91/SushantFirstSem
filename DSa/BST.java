class BST{

    Node root;
    public BST(){
        root= null;
    }
    static class Node{
        int data;
        Node left;
        Node right;
        public Node(int data){
            this.data = data;
            left = null;
            right = null;

        }
    }
    public static Node insert(Node root,int data){
        if(root == null){
            root = new Node(data);
        }
        else if(root.data > data){
            root.left = insert(root.left, data);
        }
        else{
            root.right = insert(root.right, data);
        }
        return root;
    }
    public static Node delete(Node root,int key){
        if(root == null){
            return root;
        }
        else if(root.data > key){
            root.left = delete(root.left, key);
        }
        else if(root.data < key){
            root.right = delete(root.right, key);
        }
        else{
            if(root.left == null){
                root = root.right;
            }
            else if(root.right == null){
                root = root.left;

            }
            else{
                int min = minval(root.right);
                root.data = min;
                root.right = delete(root.right, min);
            }

        }
        return root;
    }
    public static int minval(Node root){
        int min = root.data;
        Node temp = root;
        while (temp.left != null) {
            temp = temp.left;
            min = temp.data;
        }
        return min;
    }
    public static void Inorder(Node root){
        if(root == null){
            return;
        }
        Inorder(root.left);
        System.out.print(root.data + " ");
        Inorder(root.right);
    }
    public void printNodes(Node node){

        if (node == null)
            return;
        if(node.data==0){
            System.out.println("Division by zero is undefined");
            return;
        }
        printNodes(node.left);
    
        if(node.data % root.data == 0){
            System.out.print(node.data + " ");
        }
        printNodes(node.right);
    }
    public static void main(String[] args) {
        BST b = new BST();
        b.root = insert(b.root, 20);
        b.root = insert(b.root, 10);
        b.root = insert(b.root, 30);
        b.root = insert(b.root, 12);
        b.root = insert(b.root, 5);
        b.root = insert(b.root, 25);
        b.root = insert(b.root, 40);
        Inorder(b.root);
        System.out.println();
        b.printNodes(b.root);
        // b.root = delete(b.root, 5);
        // Inorder(b.root);
    }
}