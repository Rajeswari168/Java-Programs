import java.util.*;
class Node {
    int data;
    Node left;
    Node right;
    Node(int data) {
        this.data = data;
        this.left = null;
        this.right = null;
    }
}
class BST {
    Node root;
    Node temp;
    public void insert(int data){
        Node newnode=new Node(data);
        if(root==null){
            root=newnode;
            return;
        }
        else{
            temp=root;
            while(true){
                if(temp.data > data){
                    if(temp.left==null){
                        temp.left=newnode;
                        break;
                    }else{
                        temp=temp.left;
                    }
                }
                else{
                    if(temp.right==null){
                        temp.right=newnode;
                        break;
                    }else{
                        temp=temp.right;
                    }
                }
            }
        }
    }
    public void inorder(Node root) {
        if (root != null) {
            inorder(root.left);
            System.out.print(root.data + " ");
            inorder(root.right);
        }
    }
    public void preorder(Node root){
        if(root!=null){
            System.out.print(root.data + " ");
            preorder(root.left);
            preorder(root.right);
        }
    }
    public void postorder(Node root){
        if(root!=null){
            postorder(root.left);
            postorder(root.right);
            System.out.print(root.data + " ");
        }
    }
}
public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BST tree = new BST();
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            int value = sc.nextInt();
            tree.insert(value);
        }
        tree.inorder(tree.root);
        System.out.println();
        tree.preorder(tree.root);
        System.out.println();
        tree.postorder(tree.root);
        System.out.println();
    }
}
