import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class BinaryTree<T>{
    Node<T> root; 
    static class Node<Q>{
        Q data;
        Node<Q> left;
        Node<Q> right;

        public Node(Q data){
            this.data = data;
            left = null;
            right = null;
        }
    }
    public BinaryTree(){
        this.root =  null;
    } 

    public static void Inorder(Node root){
        if(root == null){
            return;
        }
        Inorder(root.left);
        System.out.print(root.data + " ");
        Inorder(root.right);
    }
    public static void Preorder(Node root){
        if(root == null){
            return;
        }
        System.out.print(root.data + " ");
        Preorder(root.left);
        Preorder(root.right);
    }
    public static void Postorder(Node root){
        if(root == null){
            return;
        }
        Postorder(root.left);
        Postorder(root.right);
        System.out.print(root.data + " ");
    }

    public static void levelOrder(Node root){
        if(root != null){
            Queue<Node> queue = new LinkedList<>();
            queue.add(root);
            while (!queue.isEmpty()) {
                Node temp = queue.poll();
                System.out.print(temp.data+" ");
                if(temp.left != null){
                    queue.add(temp.left);

                }
                if(temp.right != null){
                    queue.add(temp.right); 
                }
            }
            System.out.println();
        }




    }

    public static int height(Node root){
        if(root == null){
            return 0;

        }
        int left = height(root.left);
        int right =  height(root.right);
        if(left > right){
            return left +1;

        }
        else{
            return right +1;
        }
    }
    public static void zigZag(Node root){
        if(root != null){
            Stack<Node> s1 = new Stack<>();
            Stack<Node> s2 = new Stack<>();
            boolean ltr = true;
            s1.push(root);

            while (!s1.isEmpty()) {
                Node temp = s1.pop();
                System.out.print(temp.data + " ");
                if(ltr){
                    if(temp.left != null){
                        s2.push(temp.left);
                    }
                    if(temp.right != null){
                        s2.push(temp.right);
                    }
                }
                else{
                    if(temp.right != null){
                        s2.push(temp.right);
                    }
                    if(temp.left != null){
                        s2.push(temp.left);
                    }
                }

                if(s1.isEmpty()){
                    ltr = !ltr;
                    Stack<Node> temp1 = s1;
                    s1 = s2;
                    s2 = temp1;
                }
            }
            System.out.println();

        }
    }
    public static void main(String[] args) {
        BinaryTree<Integer> bt = new BinaryTree<>();
        bt.root = new Node<Integer>(12);
        bt.root.left  = new Node<Integer>(13);
        bt.root.left.right  = new Node<Integer>(15);
        bt.root.right  = new Node<Integer>(18);
        bt.root.right.left  = new Node<Integer>(21);
        System.out.print("Inorder => ");
        Inorder(bt.root);
        System.out.println();
        System.out.print("Preorder => ");
        Preorder(bt.root);
        System.out.println();
        System.out.print("Postorder => ");
        Postorder(bt.root);
        System.out.println();
        

        System.out.print("Level order => ");
        levelOrder(bt.root);

        System.out.print("spiral order => ");
        zigZag(bt.root);


    }
}