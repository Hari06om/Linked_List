public class Head&Tail {
    public static class Node{
        int data;
        Node next;

        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    public Static Node head;
    public Static Node tail;

    public static void main(String args[]){
        Head&Tail list = new Head&Tail();
        list.head = new Node(1);
        list.tail = new Node(3);
    }

}

    

