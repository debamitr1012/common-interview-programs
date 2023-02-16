import java.util.*;
 class ReversedLinkedList2
{
  public static void main (String[]args) throws Exception
  {
    LinkedList ll = new LinkedList ();
      ll.addFirst (8);
      ll.addFirst (12);
      ll.addFirst (16);
      ll.addFirst (24);
      System.out.println("Linked List before reversal");
	  ll.display ();
      ll.reversePI ();
	  System.out.println("Linked List after reversal");
      ll.display ();
  }
}
class LinkedList
{
  private class Node
  {
    int data;
    Node next;
    public Node (int data, Node next)
    {
      this.data = data;
      this.next = next;
    }
  }
  private Node head;
  private Node tail;
  private int size;
  public LinkedList ()
  {
    this.head = null;
    this.tail = null;
    this.size = 0;

  }
  public int size ()
  {
    return this.size;
  }
  public boolean isEmpty ()
  {
    return this.size () == 0;
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
  public void addFirst (int item)
  {
    Node temp = new Node (item, head);
    if (this.size == 0)
      {
	this.head = this.tail = temp;
      }
    else
      {
	this.head = temp;
      }
    this.size++;
  }
  private Node getNodeAt (int index) throws Exception
  {
    if (index < 0 || index >= this.size)
      {
	throw new Exception ("Index out of bound");
      }
    int i = 0;
    Node temp = head;
    while (i < index)
      {
	temp = temp.next;
	i++;
      }
    return temp;

  }
  public void reversePI ()
  {
    Node nm1 = null;
    Node n = this.head;
    Node np1 = n;
    while (n.next != null)
      {
	np1 = np1.next;
	n.next = nm1;
	nm1 = n;
	n = np1;
      }
    n.next = nm1;
    Node temp = this.head;
    this.head = this.tail;
    this.tail = temp;
  }
}