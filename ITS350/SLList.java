package ITS350;

public class SLList {

    Node head;
    Node tail;
    int size;

    

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
    
}
