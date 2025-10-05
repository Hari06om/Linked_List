public class AddinfirstNode {
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
    public static void addFirst(int data){
        
        //step1: create a new node
        Node newNode = new Node(data);
        if(head == null){
            head =tail=newNode; //if list is empty, new node will be both head and tail
            return;
        }
        
        //step2: NewNode will be the new head
        newNode.next = head; //link the new node to the current head
        
        //step3: update head to point to the new node
        head = newNode;
    }

    

    public static void main(String args[]){
        AddinfirstNode ll = new AddinfirstNode();
        ll.addFirst(85);
        ll.addFirst(30);
        ll.addFirst(50);
        System.out.println("Linked List:");
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp = temp.next;
        }
        System.out.println();
    }
}
