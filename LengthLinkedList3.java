class Node {
	int data;
	Node next;
	Node(int d)
	{
		data = d;
		next = null;
	}
}
class LengthLinkedList3 {
	Node head; 
	public void push(int new_data)
	{
		Node new_node = new Node(new_data);
		new_node.next = head;
		head = new_node;
	}
	public int getCountRec(Node node, int count)
	{
		if (node == null)
			return count;
		return getCountRec(node.next, 1 + count);
	}
	public int getCount() { return getCountRec(head, 0); }
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
