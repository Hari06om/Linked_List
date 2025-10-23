public class reverse {
    public class Node{
        int data;
        Node next;
        public  Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    public static Node head;
    public static Node tail;


    public void add(int data){
        Node newNode= new Node(data);
        if(head == null ){
            head = tail = newNode;
            return;

        }

        tail.next = newNode;
        tail = newNode;

    }

    public static void print(){
        Node temp = head ;
        while(temp!= null){
            System.out.print(temp.data + "-> ");
            temp = temp.next;
        }
        System.out.print("null");
    }

    public  void rev(){
        Node prev=null;
        Node curr = tail=head;
        Node next;

        while(curr!=null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        head = prev;

    }
    public static void main(String args[]){
        reverse ll = new reverse();
        ll.add(1);
        ll.add(2);
        ll.add(3);
        ll.add(4);
        ll.add(5);
        ll.add(6);
         print();
         System.out.println();
         ll.rev();
         System.out.println();
         print();
    }
}
