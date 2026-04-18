import java.util.*;
class Node{
    int data;
    Node next;
    Node(int data){
        this.data = data;
        next = null;
    }
}
class LinkedListImplementation{
	Node head,tail;
	int size;
	LinkedListImplementation(){
		size = 0;
		head=tail=null;
	}
    public boolean isEmpty(){
        return size==0;
    }
    public int getSize(){
        return size;
    }
    public void addAtIndex(int data, int index){
        Node n = new Node(data);
        if(index>0 && index>size){
            System.out.println("Invalid index");
            return;
        }
        if(index==0){
            Node n = new Node(data);
            if(isEmpty()) {
                head=tail=n;
            }else {
                n.next = head;
                head = n;
            }
            size++;
	    }
        if(index==size){
            Node n = new Node(data);
            if(isEmpty()){
                head=tail=n;
            }else{
                tail.next=n;
                tail=n;
            }
            size++;
        }
    }  
}
public class LinkedList {
public static void main(String[] args) {
	   LinkedListImplementation s1 = new LinkedListImplementation();

    }
}

