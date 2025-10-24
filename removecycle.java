public class removecycle {

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

    public void add(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = tail = newNode;
            return;
        }
        tail.next = newNode;
        tail = newNode;
    }

    public static void print() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public boolean isCycle() {
        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) {
                return true; // cycle found
            }
        }
        return false;
    }

    public void removeCycle() {
        Node slow = head;
        Node fast = head;
        boolean cycle = false;

        // detect cycle
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) {
                cycle = true;
                break;
            }
        }

        if (!cycle) return; // no cycle

        // find start of cycle
        slow = head;
        Node prev = null;
        while (slow != fast) {
            prev = fast;
            slow = slow.next;
            fast = fast.next;
        }

        // break the cycle
        prev.next = null;
    }

    public static void main(String[] args) {
        removecycle ll = new removecycle();
        ll.add(1);
        ll.add(2);
        ll.add(3);
        ll.add(5);
        ll.add(4);
        ll.add(6);
        ll.add(7);
       

        print();

        // create a cycle manually for testing (connect tail to node 3)
        ll.tail.next = ll.head.next.next;

        System.out.println("Cycle present before removal: " + ll.isCycle());
        ll.removeCycle();
        System.out.println("Cycle present after removal: " + ll.isCycle());

        // now safe to print
        print();
    }
}
