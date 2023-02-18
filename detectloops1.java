import java.util.HashSet;
class Node {
    int data;
    Node next;
    Node(int x) {
        data = x;
        next = null;
    }
}
public class detectloops1 {
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
        detectloops1 o = new detectloops1();
        o.findcycle(head);
    }
    public void findcycle(Node head) { 
        Node p = head;
        int count = 0;
        while (p != null) {  
            Node q = head;
            p = p.next;
            count++;
            while (count > 0) {
                System.out.println("Comparing node " + p.data + " with " + q.data);
                if (q == p) {
                    System.out.println("Cycle found");
                    return;
                }
                q = q.next;
                count--;
            }
        }
    }
}