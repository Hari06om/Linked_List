import java.util.LinkedList;

public class classroom {
    public static void main(String[] args){
        //create
        LinkedList<Integer> ll = new LinkedList<>();

        //add
        ll.addLast(10);
        ll.addLast(23);
        ll.addFirst(12);
        
        int i = 2;
        
        for(int j = 3; j < 6; j++){
            ll.add(j, i);
            i += 2;
        }
        System.out.println(ll);

        //remove
        ll.removeLast();
        ll.removeFirst();
        System.out.println(ll);
    }
}