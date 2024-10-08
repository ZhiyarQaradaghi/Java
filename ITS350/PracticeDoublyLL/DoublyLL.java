package ITS350.PracticeDoublyLL;

public class DoublyLL {
    private Node first; // <-- head
    private Node last; // <-- tail
    int size;

    public void DoublyLL() {
        first = null;
        last = null;
    }

    public boolean checkListNull() {
        return (first == null);
    }

    public static void main(String[] args) {
        DoublyLL obj1 = new DoublyLL();

        obj1.insertFirst(5);
        obj1.insertFirst(0);
        obj1.insertFirst(0);
        obj1.insertFirst(1);
        obj1.insertFirst(0);
        obj1.insertFirst(0);
        obj1.insertFirst(5);
       
        
        obj1.display();

        

        obj1.display();
        obj1.displayReverse();
        obj1.checkIfPalindrome();

        

       
        System.out.println("\nThe list is empty : "+obj1.checkListNull()+"\n");
    }


    public void insertFirst(int data) {
        Node newNode = new Node(data);
        if (checkListNull()) {
            first = last = newNode;
        } else {
            first.prev = newNode;
            newNode.next = first;
            first = newNode;
            
        }
        size++;
    }

    
    public void display() {
        Node current = first;

        while (current != null) {
            current.displayList();
            current = current.next;
        }System.out.println("");
        System.out.println("Size of list : "+size+"\n");

    }

    public void displayReverse() {
        Node current = last;

        while (current!=null) {
            current.displayList();
            current = current.prev;
        }System.out.println("");
        System.out.println("(Reverse) Size of list : "+size+"\n");
    }

    public void insertLast(int data) {
        Node newNode = new Node(data);

        if (first == null) {
            first = last = newNode;
        } else {
            last.next = newNode;
            last.prev = newNode;
            last = newNode;
            
        }size++;
    }

    public void insertAtPosition(int data, int position) {
        Node temp = first;

        while (position != 1) {
            temp = temp.next;
            position--;
        }
        Node newNode = new Node(data);
        Node temp2 = temp.next;

        temp.next = newNode;
        temp2.prev = newNode;
        newNode.prev = temp;
        newNode.next = temp2;
        size++;
        
    }

    public void checkIfPalindrome() { 
        // Start from the first and the last nodes of the list
        Node firstPointer = first;
        Node lastPointer = last;
    
        // Loop until the pointers meet or cross each other
        while (firstPointer != null && lastPointer != null) {
            // Compare the data of the nodes
            if (firstPointer.data == lastPointer.data) {
                // Move the pointers to the next and the previous nodes
                firstPointer = firstPointer.next;
                lastPointer = lastPointer.prev;
            } else {
                // The data is not equal, the list is not a palindrome
                System.err.println("List is not palindrome");
                return;
            }
        }
        // The loop ended without returning false, the list is a palindrome
        System.out.println("List is palindrome");
    }
    

    public void deleteFirst() {
        if(first == null) {
            System.err.println("EMPTY LIST");
            return;
        }

        first = first.next; // set a new first
        first.prev = null; // then delete old first
        size--;
    }

    public void deleteLast() {
        if(first == null) {
            System.err.println("EMPTY LIST");
            return;
        }
        Node temp = first;
        while (temp.next.next != null) {
            temp = temp.next;
        }
        temp.next = null;
        last = temp.next;
    
        size--;

    }


    public Node deleteNode(Node del) // we need this function to complete deleteAtPos()
    {
        // if list is empty
        if (first == null || del == null)
            return null;
 
        // if the first node is to be deleted
        if (first == del)
            first = del.next;
 
        // if the node is not the last node, then change it to previous
        if (del.next != null)
            del.next.prev = del.prev;
 
        // if the node is not the first node, then change to next
        if (del.prev != null)
            del.prev.next = del.next;
 
        del = null;
 
        return first;
    }

    public void deleteAtPosition(int position)
    {
        // if position is null or if the list is invalid then return
        if (first == null || position <= 0)
            return;
 
        Node current = first;
        int i;
 
        
        // skip nodes until the end of the list or until the given position
        for (i = 1; current != null && i < position; i++)
        {
            current = current.next;
        }
         
        // if the current is more than the number of nodes then return
        if (current == null)
            return;
 
        // deleted the node that is pointed at by current
        deleteNode(current);
    }

    
}
