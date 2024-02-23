package ITS350.PracticeLinkedList;

public class SSList {

    private Node first;

    public void SSList() { // Tell the constructor that the first node is empty
        first = null;
    }

    public boolean isEmpty() { // Check if the linked list is empty, return true if it is and false otherwise
        return (first == null);
    }

    public static void main(String[] args) {
        SSList ob1 = new SSList();

        ob1.insertFirst(1);
        ob1.insertFirst(8);
        ob1.display();
        

        System.out.println(ob1.isEmpty());
    }

    public void insertFirst(int data) {
        Node newNode = new Node(data);
        newNode.next = first;
        first = newNode;
        

    }
    public Node deletNode() {
        Node temp = first;
        first = first.next;
        return temp;
    }

    public void display() {
        Node current = first;
        while (current!=null) {
            current.displayNode();
            current = current.next;
        }System.out.println("--> null");
    }
    
}
