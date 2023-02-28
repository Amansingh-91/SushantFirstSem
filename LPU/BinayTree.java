package javaTut.LPU;

import java.util.LinkedList;
import java.util.Queue;

import javax.swing.RootPaneContainer;

public class BinayTree {
    static class Node{
        int data;
        Node left , right;
        Node(int data){
            this.data = data;
            this.left = this.right = null;
        }
    }

    Node root ;
    BinayTree(){
        root = null;
    }

    public void inorder(Node root){
        if(root != null){
            inorder(root.left);
            System.out.println("data = "+root.data);
            inorder(root.right);
        }
    }
    public void preorder(Node root){
        if(root != null){
            preorder(root.left);
            preorder(root.right);
            System.out.println("data = "+root.data);
            
        }
    }
    public void postorder(Node root){
        if(root != null){
            
            System.out.println("data = "+root.data);
            postorder(root.left);
            postorder(root.right);
        }
    }

    public void BFS(Node root){
        if(root != null){
            Queue<Node> q = new LinkedList<>();
            q.add(root);
            while(!q.isEmpty()){
                Node t = q.poll();
                System.out.println(t.data);
                if(t.left != null){
                    q.add(t.left);
                }
                if(t.right != null){
                    q.add(t.right);
                }

            } 
        }
    }

    public static void main(String[] args) {
        BinayTree t1 = new BinayTree();
        t1.root = new Node(2);
        t1.root.left = new Node(1);
        t1.root.right = new Node(3);
        t1.root.left.left = new Node(5);
        t1.root.right.right = new Node(7);
        t1.BFS(t1.root);
        
    }
}
