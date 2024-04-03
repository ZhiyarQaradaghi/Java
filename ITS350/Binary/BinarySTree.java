package ITS350.Binary;

public class BinarySTree {
    Node root;
    int count;
    public void insert(int data) {
        Node node = new Node(data);
        if(root==null) {
            root = node;
        } else {
            Node current = root;
            Node parent;
            while (true) {
                parent = current;
                if (data<=current.data) {
                    current = current.leftChild;
                    if (current==null) {
                        parent.leftChild = node;
                        return;
                    }   
                } else {
                    current = current.rightChild;
                    if (current==null) {
                        parent.rightChild = node;
                        return;
                    }   
                }
            }
        }
    }

    // public void search(Node node, int data) {
    //     if () {
            
    //     }
    // }

    public static void main(String[] args) {
        BinarySTree tree = new BinarySTree();

        tree.insert(5);
        tree.insert(10);
        tree.insert(3);

    }
}
