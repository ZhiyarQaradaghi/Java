package ITS350.PracticeLinkedList;

public class SSList {

    private Node first; // < -- head
    private Node tail;
    int size;

    public void SSList() { // Tell the constructor that the first node is empty
        first = null;
    }

    public boolean isEmpty() { // Check if the linked list is empty, return true if it is and false otherwise
        return (first == null);
    }

    public static void main(String[] args) {
        SSList ob1 = new SSList();

        ob1.insertFirst(1);
        ob1.insertFirst(2);
        ob1.insertFirst(3);
        ob1.insertFirst(4);
        ob1.display();
        System.out.println("\n----Deleting First Node----\n");
        ob1.deletFirstNode();
        ob1.display();
        System.out.println("\n----Deleting Last Node----\n");
        ob1.deleteLastNode();
        ob1.display();

        System.out.println(ob1.isEmpty());
    }

    public void insertFirst(int data) {
        Node newNode = new Node(data);
        newNode.next = first;
        first = newNode;
        size++;
        

    }


    public Node deletFirstNode() {
        Node temp = first;
        first = first.next;
        size--;
        return temp;
        
    }

    public void deleteLastNode() {
        Node temp = first;
        if(first == null) {
            System.out.println("Empty list");
            return;
        }
        while (temp.next.next!=null) { // keep moving through the nodes until the node is pointing at null, meaning until it reaches the last node
            temp = temp.next; // we use .next.next to move 2 notes for each iteration, so that we stop one node before the last to safely delete it and later assign tail to the new last node
        }

        temp.next = null; // now temp.next is the last node, so we delete it by making it null
        tail = temp; // make the tail point to the new last node 
        size--;
        

    }

    public void display() {
        Node current = first;
        while (current!=null) {
            current.displayNode();
            current = current.next;
        }System.out.println("--> null");
    }


    
}
