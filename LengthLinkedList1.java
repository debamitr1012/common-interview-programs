class Node {
	int data;
	Node next;
	Node(int d)
	{
		data = d;
		next = null;
	}
}
class LengthLinkedList1 {
	Node head; 
	public void push(int new_data)
	{
		Node new_node = new Node(new_data);
		new_node.next = head;
		head = new_node;
	}
	public int getCount()
	{
		Node temp = head;
		int count = 0;
		while (temp != null) {
			count++;
			temp = temp.next;
		}
		return count;
	}
	public static void main(String[] args)
	{
		LinkedList llist = new LinkedList();
		llist.push(1);
		llist.push(3);
		llist.push(1);
		llist.push(2);
		llist.push(1);
		System.out.println("Count of nodes is "
						+ llist.getCount());
	}
}
