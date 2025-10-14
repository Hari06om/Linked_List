public class AddinLast{
    public static class Node{
         int data;
          Node next;
           public Node(int data){
            this.data= data;
            this.next=null;
           }

    }
    public static Node head;
    public static Node tail;

    public static void addlast(int data){
        Node newNode= new Node(data);
        if(head == null){
            head=tail=newNode;
            return;
        }

        tail.next = newNode;
        tail = newNode;

    }

    public static void print(){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.println("null");
    }
    public static void main(String args[]){
        AddinLast ll = new AddinLast();
        ll.addlast(1);
        ll.addlast(2);
        ll.addlast(3);
        ll.addlast(4);
        ll.addlast(5);
        ll.addlast(6);
        ll.addlast(7);

        print();



    }
}