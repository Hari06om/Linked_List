public class PrintLinkedList {
    public static class Node{
        int data;
        Node next;

        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    public static Node head;
    public static Node tail;

    // Method to print linked list
     public void print() {
        Node temp = head;
        if (temp == null) {
            System.out.println("List is empty.");
            return;
        }
        while (temp != null) {
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.println("null");
    }
    // Method to add elements to the end of linked list
    public static void addlast(int data){
        
        //step1: create a new node
        Node newNode = new Node(data);
        if(head == null){
            head =tail=newNode; //if list is empty, new node will be both head and tail
            return;
        }
        
        //step2: NewNode will be the new head
        tail.next = newNode; //link the new node to the current head
        
        //step3: update head to point to the new node
        tail = newNode;
    }
    public static void main(String args[]){
        PrintLinkedList ll = new PrintLinkedList();
        ll.addlast(1);
        ll.addlast(2);
        ll.addlast(3);
        ll.addlast(4);
        ll.print(); //Printing the linked list should give output: 1 -> 2 -> 3 -> 4 -> null

    }
}
