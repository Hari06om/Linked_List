public class deteced {
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
 
    public boolean iscycle(){
        Node slow = head;
        Node fast = head;
            
        while(fast !=null && fast.next != null){
            slow  = slow.next;
            fast = fast.next.next;
            if(slow == fast){
                return true;
            }
        }
        return false;
    }


    public static void main(String args[]){
        deteced ll = new deteced();
        ll.add(1);
        ll.add(2);
        ll.add(3);
        ll.add(5);
        ll.add(4);
        ll.add(1);
         print();
         System.out.println();
         System.out.println(ll.iscycle());
     
    }
}
