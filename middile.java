public class middile{
    public class Node {
        int data;
        Node next;
        
        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
    public static Node head;
    public static Node tail;

    public void print(){
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
        
    }
    
      public void addFirst(int data){
        
        //step1: create a new node
        Node newNode = new Node(data);
        if(head == null){
            head =tail=newNode; //if list is empty, new node will be both head and tail
            return;
        }
        
        //step2: NewNode will be the new head
        newNode.next = head; //link the new node to the current head
        
        //step3: update head to point to the new node
        head = newNode;
    }
    
    public  void middle(int ind ,int data){
        Node newNode = new Node(data);
        Node temp = head;
        int  i =0 ;
        while(i<ind-1){
            temp = temp.next;
            i++;
            
        }
        newNode.next = temp.next;
        temp.next = newNode;
        if(newNode.next == null){
            tail = newNode;
            
        }
        System.out.println("Middle node added successfully");
        
    }
    public static void main(String[] args) {
        middile ll = new middile();
        ll.addFirst(1);
        ll.addFirst(2);
        ll.addFirst(3);
        ll.addFirst(4);
        ll.print(); //Printing the linked list should give output: 1 -> 2 -> 3 -> 4 -> null
        ll.middle(2,5);
        ll.print();
        //Printing the linked list should give output: 1 -> 2 -> 5 -> 3 -> 4 -> null
        //The node 5 is added at the 2nd position in the linked list.

    }
    
}