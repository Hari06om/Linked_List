public class Search{
public static class Node{
    int data;
     Node Next;
     public Node(int data){
        this.data = data;
        this.Next = null;

     }
    }
     public static Node head;
        public static Node tail;

        public void addFirst(int data){
            Node newNode = new Node(data);
            if(head == null){
                head = tail = newNode;
                return;
            }
            newNode.Next = head;
            head = newNode;
        }
        public void print(){
            Node temp = head;
            while(temp!=null){
                System.out.print(temp.data + " ");
                temp = temp.Next;
            }
            System.out.println();
        }
        public void sch(int key){
           Node temp = head;
           int i=0;
           while(temp!=null){
            if(temp.data == key){
                System.out.println("key found at index: "+i);
                return;
            }
            temp = temp.Next;
            i++;

           }
        }
        public static void main(String[] args) {
            Search ll = new Search();
          ll.addFirst(1);
            ll.addFirst(2);
            ll.addFirst(3);
            ll.addFirst(4);
            ll.print();
            ll.sch(3);
            ll.sch(5);


}
}
