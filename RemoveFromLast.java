public class RemoveFromLast {
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
    public static void addlast(int data){
        
        //step1: create a new node
        Node newNode = new Node(data);
        if(head == null){
            head =tail=newNode; //if list is empty, new node will be both head and tail
            return;
        }
        
        //step2: NewNode will be the new head
        tail.next = newNode; //link the new node to the current head
        
        //step3: update head to point to the new node
        tail = newNode;
    }

    public static void removefromlast(){
        if(head == null){
            System.out.println("LL is empty");
            return;
        }
        if(head.next == null){
            head = null;
            return;
        }
        Node temp = head;
        while(temp.next.next != null){
            temp = temp.next;
        }
        temp.next = null;
    }

    public static void main(String args[]){
        RemoveFromLast ll = new RemoveFromLast();
        ll.addlast(85);
        ll.addlast(30);
        ll.addlast(50);
        System.out.println("Linked List before removing from last:");
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp = temp.next;
        }
        System.out.println();
        
        ll.removefromlast();
        
        System.out.println("Linked List after removing from last:");
        temp = head;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp = temp.next;
        }
        System.out.println();
    }
}