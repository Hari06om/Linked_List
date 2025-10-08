import java.util.*;
public class RemoveKey {
    // Node class representing each element in the linked list
    public static class Node {
        int data;
        Node next;
        
        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
    
    // Static head and tail pointers for the linked list
    private static Node head;
    private static Node tail;
    private static int size; // Track size of the linked list
    
    // Add a node to the end of the linked list
    public static void add(int data) {
        Node newNode = new Node(data);
        size++;
        
        if (head == null) {
            head = tail = newNode;
            return;
        }
        tail.next = newNode;
        tail = newNode;
    }
    
    // Print the linked list
    public static void print() {
        if (head == null) {
            System.out.println("Linked List is empty");
            return;
        }
        
        Node temp = head;
        System.out.print("List: ");
        while (temp != null) {
            System.out.print(temp.data + " => ");
            temp = temp.next;
        }
        System.out.println("null");
        System.out.println("Size: " + size);
    }
    
    // Get the size of the linked list
    public static int getSize() {
        return size;
    }
    
    // Check if list is empty
    public static boolean isEmpty() {
        return head == null;
    }
    public static void remove(int key){
        if(head == null){
            System.out.println("LL is empty");
            return;
        }
        //if only one node is present
        if(head.data == key){
            head = head.next;
            return;
        }
        Node temp = head;
        Node prev = null;
        while(temp != null && temp.data != key){
            prev = temp;
            temp = temp.next;
        }
        if(temp == null){
            System.out.println("Key not found");
            return;
        }
        prev.next = temp.next;
    }




    public static void main(String args[]){
        remove ll = new remove();
        ll.add(2);
        ll.add(3);
        ll.add(4);
        ll.add(5);
        ll.add(6);
        ll.add(7);
        print();

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the key to be removed:");
        int key = sc.nextInt();
        ll.remove(key);
        print();
        sc.close();

    }
}