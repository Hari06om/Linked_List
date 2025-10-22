public class addinfirst {
    public class Node{
        int data;
        Node next;
        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    public static Node head;
    public static Node tail;

    public void addinfirst(int data){
        Node newNode = new Node(data);
        if(head == null){
            head = tail = newNode;
            return;
        }
        tail.next = newNode;
        tail = newNode;
    }
   public static void main(String[] args){
     addinfirst ll = new addinfirst();
        ll.addinfirst(1);
        ll.addinfirst(2);
        ll.addinfirst(3);
        ll.addinfirst(4);
        ll.addinfirst(5);
        ll.addinfirst(6);
        //print linked list
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
        System.out.println("Head: " + head.data);
        System.out.println("Tail: " + tail.data);

   } 
}
