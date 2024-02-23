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
        System.out.println("\n----Insert Node At End----\n");
        ob1.insertEnd(5);
        ob1.display();
        System.out.println("\n----Delete At Specific Position----\n");
        ob1.deleteSpecificNode(0);
        ob1.display();
        System.out.println("\n----INSERT At Specific Position----\n");
        ob1.insertAtPosition(6, 2);
        ob1.display();

        System.out.println(ob1.isEmpty());
    }

    public void insertFirst(int data) {
        Node newNode = new Node(data);
        newNode.next = first;
        first = newNode;
        size++;
        

    }

    public void insertEnd(int data) {
        Node newNode = new Node(data);
        Node temp = first; // create a temp node
        while (temp.next!=null) { // go to the last node that is pointing at null
            temp = temp.next;
        }

        temp.next = newNode; // now assign newNode to the last node (temp.next)
        size++;
    }

    public void insertAtPosition(int data, int position) {
        
        if (position < 0 || position > size) { // check position validity
            System.err.println("Position is INVALID : "+position)
        }
       
        Node newNode = new Node(data);
      
        if (first == null) { // if the list is empty, then set the first node to new node and increase size to 1
          
            first = newNode;
            size++;
            return;
        }
       
        if (position == 0) { // if the position is 0, then we just write the code for addFirst()
            newNode.next = first;
            first = newNode;
            size++;
            return;
        }
      
        Node temp = first;
        // keep going until we reach end of list or the position
        while (temp != null && position > 1) {
            
            temp = temp.next; // keep moving the temp node to the next
            
        }
     
        if (temp != null) {
           
            Node temp2 = temp.next; // create another node to save the next node of temp
        
            temp.next = newNode; // we will insert the newNode with the data to next temp, so we lose the original temp next thats why we needed temp2
            
            newNode.next = temp2; // link the temp2 to newNode.next to make it point to null
           
            size++;
        }
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

    public void deleteSpecificNode(int position) {
        if (first == null) {
            System.err.println("EMPTY");
            return;
        }
        Node temp = first;

        if (position == 0) {
            first = first.next;
            return;
        }

        for (int i = 0; temp!=null && i < position - 1; i++) {
            temp = temp.next;
        }

        if (temp == null || temp.next == null) {
            System.err.println("Position entered is beyond the number of nodes");
            return;
        }

        Node newNode = temp.next.next;

        temp.next = newNode;

        size--;

    }



    public void display() { // remember we cannot display reverse in singly ll because we can only move in one direction
        Node current = first;
        while (current!=null) {
            current.displayNode();
            current = current.next;
        }System.out.println("--> null");
    }

   


    
}
