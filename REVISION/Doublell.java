// Definition of a doubly linked list class
public class Doublell{
    // Inner class representing a node in the doubly linked list
    public class Node{
        int data;    // Stores the actual data in the node
        Node next;   // Reference to the next node
        Node prev;   // Reference to the previous node

        // Constructor to create a new node with given data
        public Node(int data){
            this.data = data;     // Initialize data
            this.next = null;     // Initially, next points to null
            this.prev = null;     // Initially, prev points to null
        }
    }

    // Static variables accessible to all instances of Doublell
    public static Node head;      // Points to the first node of the list
    public static Node tail;      // Points to the last node of the list
    public static int size;       // Keeps track of number of nodes in the list
    
    // Method to add a new node at the beginning of the list
    public void addfirst(int data){
        Node newNode = new Node(data);    // Create a new node with given data
        size++;                           // Increment the size of list
        if(head == null){                // If list is empty
            head = tail = newNode;        // Both head and tail point to new node
            return;
        }
        newNode.next = head;             // New node's next points to current head
        head.prev = newNode;             // Current head's prev points to new node
        head = newNode;                  // Update head to point to new node
    }

    // Method to print the linked list
    public void print(){
        Node temp = head;                // Start from the head
        while(temp!= null){             // Traverse until we reach end of list
            System.out.print(temp.data +"<->"); // Print current node's data
            temp = temp.next;            // Move to next node
        }
        System.out.println("null");      // Print null at the end
    }

    // Main method to test the doubly linked list implementation
    public static void main(String args[]){
        Doublell dll = new Doublell();   // Create new doubly linked list
        dll.addfirst(1);                 // Add nodes with values 1,2,3,4,5
        dll.addfirst(2);
        dll.addfirst(3);
        dll.addfirst(4);
        dll.addfirst(5);
        dll.print();                     // Print the list
        System.out.println(size);        // Print the size of list
    }
}
