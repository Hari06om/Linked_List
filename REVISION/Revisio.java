public class Revisio{

    public class Node{
        int data;
        Node next;
        public Node(int data){
            this.data = data;
            this.next=null;
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
    
    public static void print(){
        Node temp = head ;
        while(temp!= null){
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.print("null");
    }

    public void zigzag(){
        //find mid 
        Node slow = head;
        Node fast = head.next;
        while(fast!= null && fast.next != null ){
            slow = slow.next;
            fast = fast.next;
        } 
        Node mid = slow ;

        //revere 2nd half
        Node curr = mid.next;
        mid.next = null;
        Node prev = null;
        Node next;

        while(curr!= null){
            next = curr.next;
            curr.next = prev ;
            prev = curr;
            curr = next;
        }

        Node left = head;
        Node right = prev;

        Node nextl ,nextr;

        while(left != null && right != null){
            nextl = left.next ;
            left.next = right;
            nextr = right.next;
            right.next  = nextl;

            left = nextl;
            right = nextr;

        }
    }
    
    public static void main(String args[]){
        Revisio ll = new Revisio();
        ll.addinfirst(1);
        ll.addinfirst(2);
        ll.addinfirst(3);
        ll.addinfirst(4);
        ll.addinfirst(5);
        ll.addinfirst(6);
        print();    
        System.out.println();
        ll.zigzag();
        print();
    }
}