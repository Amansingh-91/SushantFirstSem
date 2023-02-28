package javaTut.LPU;

class BST{
    static class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data =  data;
            this.left = null;
            this.right = null;
        }
    }
    Node root;
    BST(){
        root = null;
    }
    public Node Insert(Node root,int data){
        if(root == null){
            root = new Node(data);
        }
        else{
            if(root.data > data){
                root.left = Insert(root.left, data);
            }
            else{
                root.right = Insert( root.right, data);
            }
        }
        return root;
    }

    public Node Delete(Node root,int key){

        if(root == null){
            return null;
        }
        if( root.data > key){
            root.left = Delete(root.left, key);
        }
        else if(root.data < key){
            root.right = Delete(root.right, key);
        }
        else{

            if(root.left == null){
                root = root.right;
            }
            else if( root.right == null){
                root = root.left;
            }
            else{
                int min = minVal(root.right);
                root.data =  min;
                root.right = Delete(root.right, min);
            }

        }
        return root;

    }
    public int minVal(Node root){
        int min = root.data;
        Node temp = root;
        while( temp.left != null){
            min = temp.left.data;
            temp = temp.left;
        }
        return min;
    }

    public int searchData(Node root, int key){
        if(root == null){
            return -1;
        }
        else{
            if(root.data == key){
                return key;
            }
            else if(root.data > key){
                return searchData(root.left, key);
            }
            else{
                return searchData(root.right, key);
            }
        }
    }

    public void printZigZag(Node root,int level, boolean ltr){

        if(root != null){
            if(level == 1){
                System.out.print(root.data + "  ");
            }
            else if(ltr){
                printZigZag(root.left, level-1, ltr);
                printZigZag(root.right, level-1, ltr);
            }
            else{
                printZigZag(root.right, level-1, ltr);
                printZigZag(root.left, level-1, ltr);
            }
            
        }

    }
    public int height(Node root){
        int h = 0;
        if(root != null){
            int left = height(root.left);
            int right = height(root.right);
            if(left > right){
                h = 1 + left;
            }
            else{
                h = 1 + right;
            }
        }
        return h;
    }
    public void printZigZagDummy(Node root){
        int height = height(root);
        for (int i = 1; i <= height; i++) {
            if(i % 2 == 0){
                printZigZag(root, i, false);
            }
            else{
                printZigZag(root, i, true);
            }
        }
        System.out.println();
    }
    public void preorder(Node root){
        if(root != null){
            System.out.println(root.data);
            preorder(root.left);
            preorder(root.right);
        }
    }
    public void inorder(Node root){
        if(root != null){
            inorder(root.left);
            System.out.print(root.data);
            
            inorder(root.right);
        }
        
    }
    public static void main(String[] args) {
        BST b1 =  new BST();
        b1.root =b1.Insert(b1.root, 10);
        b1.root =b1.Insert(b1.root, 5);
        b1.root =b1.Insert(b1.root, 15);

        b1.root =b1.Insert(b1.root, 13);
        b1.root =b1.Insert(b1.root, 3);
        b1.root =b1.Insert(b1.root, 16);
        b1.root =b1.Insert(b1.root, 6);

        b1.inorder(b1.root);
        System.out.println();
        b1.printZigZagDummy(b1.root);


    }
}