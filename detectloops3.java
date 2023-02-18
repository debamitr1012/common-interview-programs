import java.util.HashSet;
class Node {
    int data;
    Node next;
    Node(int x) {
        data = x;
        next = null;
    }
}
public class detectloops3 {
    public static void main(String args[]) {
        Node head = new Node(10);
        Node n1 = new Node(20);
        head.next = n1;
        Node n2 = new Node(30);
        n1.next = n2;
        Node n3 = new Node(40);
        n2.next = n3;
        Node n4 = new Node(50);
        n3.next = n4;
        n2.next = head;
        detectloops3 o = new detectloops3();
        o.findcycle(head);
    }
    void findcycle(Node head) {
        Node s = head, f = head;
        int found = 0;
        while (s != null && f != null && f.next != null) {
            s = s.next;
            f = f.next.next;
            System.out.println("Slow pointer is at " + s.data);
            System.out.println("Fast pointer is at " + f.data);
            if (s == f) {
                found = 1;
                break;
            }
        }
        if (found == 1)
            System.out.println("Cycle found");
        else
            System.out.println("No cycle found");
    }
}