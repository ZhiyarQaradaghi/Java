package ITS350.PracticeDoublyLL;

public class Node {
    int data;
    Node next;
    Node prev;   

    public Node(int data) {
        next = null;
        prev = null;
        this.data = data;
    }

    public void displayList() {
        
            System.out.println("Node has value : "+data);
        
    }
}
