import java.util.*;

public class Revision{
    public static void main(String args[]){
        LinkedList<Integer> ll =  new LinkedList<>();

        //add 

        ll.addLast(2);
        ll.addLast(1);
        ll.addLast(23);
        ll.addLast(4);
        ll.addLast(6);
        ll.addLast(null);
        ll.addFirst(0);

        System.out.print(ll);
        
        //remove 
        ll.removeLast();
        
        ll.removeFirst();
        
        
        System.out.println();
        System.out.print(ll);
    }
}