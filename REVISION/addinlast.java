public class addinlast {
    public class Node{
        int data;
        Node next;
        public Node(int data){
            this.data = data;
            this.next= null;
        }
    }

    public static Node head;
    public static Node tail;

    public void addlast(int data){

        Node newNode = new Node(data);

        if(head == null){
            head = tail = newNode;
            return;
        }

        newNode.next = head;

        head = newNode;

    }
    public static void main(String[] args){
        addinlast ll = new addinlast();
        ll.addlast(1);
        ll.addlast(2);
        ll.addlast(3);
        ll.addlast(4);
        ll.addlast(5);
        ll.addlast(6);

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
