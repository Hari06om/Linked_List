public class AddinfirstNode{
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

    public static void addfirst(int data){
        Node newNode =  new Node(data);
        if(head == null){
            head = tail= newNode;
            return;
        }
       newNode.next = head ;
       head = newNode;
    }

    public static void main(String args[]){
        AddinfirstNode ll = new AddinfirstNode();
        ll.addfirst(2);
        ll.addfirst(3);
        ll.addfirst(4);

        Node temp = head;
        while(temp != null){
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
        

    }
}