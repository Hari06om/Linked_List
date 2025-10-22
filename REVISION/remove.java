public class remove {
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

    public void add(int data){
        Node newNode = new Node(data);
        if(head == null){
            head = tail  = newNode;
            return;
        }
        tail.next = newNode;
        tail = newNode;
    }

    public void print(){
        Node temp = head ;
        while(temp!= null){
            System.out.print(temp.data +"->");
           temp = temp.next;
       }
       System.out.println("null");

    }

    public int re(){
        int val = head.data;
        head = head.next;
        return val;
    }

    public static void main(String[] args){
        remove ll = new remove();
        ll.add(1);
        ll.add(2);
        ll.add(3);
        ll.add(4);
        ll.add(5);
        ll.add(6);
        ll.print();
        System.out.println("Removed value: " + ll.re());
        ll.print();

    }    
}
