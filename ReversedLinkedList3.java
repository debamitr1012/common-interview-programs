import java.util.*;
class ReversedLinkedList3 {
    Node head;
    class Node {
        int data;
        Node next;
        Node(int d) {
            data = d;
            next = null;
        }
    }
    void printReverse(Node head) {
        if (head == null) return;
        printReverse(head.next);
        System.out.print(head.data + " ");
    }
    public void display ()
    {
        Node temp = head;
        while (temp != null)
        {
            System.out.print (temp.data + " ");
            temp = temp.next;
        }
        System.out.println(" ");
    }
    public void addFirst(int new_data) {
        Node new_node = new Node(new_data);
        new_node.next = head;
        head = new_node;
    }
}
public class Main{
    public static void main(String args[])
    {
        LinkedList llist = new LinkedList();
        llist.addFirst(42);
        llist.addFirst(13);
        llist.addFirst(25);
        llist.addFirst(10);
        System.out.println("Linked List before reversing");
        llist.display();
        System.out.println("Linked List after reversing");
        llist.printReverse(llist.head);
}