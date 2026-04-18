import java.util.*;

class Node{
    int data;
    Node next;

    Node(int data){
        this.data = data;
        this.next = null;
    }
}

class Queue{
    Node front;
    Node rear;

    public void enqueue(int data){
        Node newNode = new Node(data);
        if(front == null){
            front = rear = newNode;
        }
        else{
            rear.next = newNode;
            rear = newNode;
        }
    }

    public void dequeue(){
        if(front == null){
            System.out.println("Queue is empty");
        }
        else{
            System.out.println("Deleted element: " + front.data);
            front = front.next;
            if(front == null){
                rear = null;
            }
        }
    }

    public void display(){
        if(front == null){
            System.out.println("Queue is empty");
        }
        else{
            Node temp = front;
            while(temp != null){
                System.out.print(temp.data + " ");
                temp = temp.next;
            }
        }
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Queue q = new Queue();

        int n = sc.nextInt();

        for(int i=0;i<n;i++){
            int val = sc.nextInt();
            q.enqueue(val);
        }

        q.dequeue();
        q.display();
    }
}
