
import java.util.LinkedList;

import java.util.*;
public class farmeworklinkedlist {
 public static void main(String args[]){
    LinkedList<Integer> ll = new LinkedList<>();
    ll.addLast(2); 
    ll.addLast(3); 
    ll.addLast(4); 
    ll.addLast(5);
    ll.addFirst(1); 
    System.out.print(ll);

    ll.removeLast();
    ll.removeFirst();
    System.out.println();
    System.out.println(ll);
 }   
}
