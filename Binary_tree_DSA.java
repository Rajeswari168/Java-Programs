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
class BT {
    Node root;
    public void insert(int data) {
        Node newnode = new Node(data);
        if (root == null) {
            root = newnode;
            return;
        }
        Node[] queue = new Node[100];
        int front = 0, rear = 0;
        queue[rear++] = root;
        while (front < rear) {
            Node temp = queue[front++];
            if (temp.left == null) {
                temp.left = newnode;
                return;
            } else {
                queue[rear++] = temp.left;
            }
            if (temp.right == null) {
                temp.right = newnode;
                return;
            } else {
                queue[rear++] = temp.right;
            }
        }
    }
    public void inorder(Node root){
        if(root!=null){
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
public class Main {
    public static void main(String[] args) {
        BT tree = new BT();
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        for (int i = 0; i < n; i++) {
            int value = scanner.nextInt();
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
