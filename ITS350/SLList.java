package ITS350;

public class SLList {

    Node head;
    Node tail;
    int size;
    
    public static void main(String...args) {
        SLList list = new SLList();
        list.addFirst(10);
        list.addFirst(3);
        list.addLast(5);
        list.addLast(20);
        list.addFirst(1);
        list.display();
        list.deleteFirst();
        list.deleteLast();
        list.deleteLast();
        list.deleteLast();
        list.display();
    }

    void display() {

        if(head == null) {
            System.err.println("The List is Empty");
            return;
        } Node temp = head;
        while (temp!=null) {
            System.err.println(temp.data+" ");
            temp = temp.next;
        }System.out.println();

    }

    void addLast(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = tail = newNode;
        }else{
            tail.next = newNode;
            tail = newNode;
        }
    }
    

    void addFirst(int data) {
        Node newNode = new Node(data); // created an object of class node, and this object contains a copy of data and the pointer 
        if(head == null){
            head = tail = newNode; // this node will become the head of the linked list
        } else {
            newNode.next = head;
            head = newNode;
        }
        size++;
    }
    
    void deleteFirst() {
        if (head==null) {
            System.out.println("Empty");
            return;
        }
        head = head.next;
        size--;
    }
    
    // delete an element at the end of the list
    // you cannot say tail == null
    // delete at position
    // add at position
    // what if we have only one node, how do we delete

    void deleteLast() {

        if (head==null) {
            System.out.println("Empty");
            return;
        }
        Node temp = head;
        while (temp.next.next!=null) {
            temp = temp.next;

        }  
        
        temp.next = null;
        tail = temp;
        size--; 
    }

    void deleteAtPos() {

    }

    void addAtFirst() {
        
    }
}
