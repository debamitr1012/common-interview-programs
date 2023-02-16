class ReversedLinkedList1
{
  Node head;
  class Node
  {
    int data;
    Node next;
      Node (int x)		
    {
      data = x;
      next = null;
    }
  }
  public void display ()
  {
    Node temp = head;
    while (temp != null)
      {
	System.out.print (temp.data + " ");
	temp = temp.next;
      }
    System.out.println ("END");
  }
  public Node insertBeginning (int data)
  {
    Node newNode = new Node (data);
    newNode.next = head;
    head = newNode;
    return head;
  }
  public void reverse ()
  {
    Node pointer = head;
    Node previous = null, current = null;
    while (pointer != null)
      {
	current = pointer;
	pointer = pointer.next;
	current.next = previous;
	previous = current;
	head = current;
      }
  }
}
 public class Main
{
  public static void main (String[]args)
  {
    try
    {
      LinkedList ll = new LinkedList ();
        ll.insertBeginning (2);
        ll.insertBeginning (4);
        ll.insertBeginning (6);
        ll.insertBeginning (8);   
        System.out.println("LinkedList before reversal : ");
        ll.display ();     
        System.out.println("LinkedList after reversal : ");
        ll.reverse ();
        ll.display ();
    }
    catch (Exception e)
    {
      System.out.println ("Exception occurred.");
    }
  }
}