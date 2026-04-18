class Node:
    def __init__(self,data):
        self.prev=None
        self.data=data
        self.next=None
class Linkedlist:
    def __init__(self,head,temp,):
        self.head=None
        self.temp=None
    def create(self):
        size=int(input("Enter the size:"))
        for i in range(size):
            data=int(input("Enter the value:"))
            newnode=Node(data)
            newnode.prev=None
            newnode.next=None
            if self.head==None:
                self.head = newnode
                self.temp = newnode
            else:
                self.temp.next=newnode
                newnode.prev=self.temp
                self.temp=self.temp.next
    def display(self):
        self.temp = self.head
        print("Display the elements in the list:")
        while self.temp != None:
            print(self.temp.data)
            self.temp = self.temp.next
    def insertatfront(self):
        self.temp = self.head
        newnode = Node(int(input("\nenter the element to insert at front: ")))
        newnode.next = self.head
        newnode.prev=None
        self.head.prev = newnode
        self.head=newnode
    def insertatmiddle(self):
        newnode = Node(int(input("\nenter the element to insert at middle: ")))
        pos = int(input("\nEnter the position:"))
        i = 1
        self.temp=self.head
        while i < pos:
            self.temp = self.temp.next
            i = i + 1
        newnode.next = self.temp.next
        newnode.prev=self.temp
        self.temp.next = newnode
        newnode.next.prev = newnode
    def insertatend(self):
        self.temp = self.head
        newnode = Node(int(input("\nenter the element: ")))
        while self.temp.next != None:
            self.temp = self.temp.next
        self.temp.next = newnode
        newnode.prev = self.temp
        newnode.next = None

    
        

obj=Linkedlist(None,None)
obj.create()
obj.insertatfront()
obj.insertatmiddle()
obj.insertatend()

    

                
            
