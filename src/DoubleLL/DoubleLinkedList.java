package DoubleLL;

class Node {

	Node prev;
	int data;
	Node next;
	
	public Node(int data)
	{
		this.data = data;
		this.prev = null;
		this.next= null;
	}
}
class DoubleLL
{
	Node head = null;
	Node tail = null;
	
	public void create( int data)
	{
		Node newNode = new Node (data);
		if(head == null)
		{
			head = newNode;
			tail = newNode;
			return;
		}
		tail.next = newNode;
		newNode.prev = tail;
		tail = newNode;
	}
	
	public void Didp_Frwd()
	{
		Node temp = head;
		while(temp != null)
		{
			System.out.println(temp.data+" ");
			temp = temp.next;
		}
	}
	
	public void Didp_Bkwd()
	{
		Node temp = tail;
		while(temp != null)
		{
			System.out.println(temp.data+" ");
			temp = temp.prev;
		}
	}
	
	public void InsertAtBegin(int data)
	{
		Node newNode = new Node (data);
		if(head == null && tail == null)
		{
			head = tail = null;
			return;
		}
		head.prev = newNode;
		newNode.next = head;
		head = newNode;
	}
	
	public void InsertAtEnd(int data)
	{
		Node newNode = new Node(data);
		tail.next = newNode;
		newNode.prev = tail;
		tail = newNode;
	}
	
	public void deleteAtBegin()
	{
		// no node
		if(head == null)
		{
		System.out.println("no node");
		return;
		}
		// single node
		if(head == tail)
		{
			head = tail = null;
			return;
		}
		head = head.next;
		head.prev = null;
	}
	
	public void DeleteAtEnd()
	{
		// no node
		if(head == null)
		{
		System.out.println("no node");
		return;
		}
		// single node
		if(head == tail)
		{
		head = tail = null;
		return;
		}
				
		tail = tail.prev;
		tail.next = null;
	}
	
	public int count()
	{
	    Node temp = head;
	    int count = 0;

	    while (temp != null)
	    {
	        count++;
	        temp = temp.next;
	    }
	    return count;
	}
	
	public void InsertAtPos (int pos,int data)
	{
		Node newNode = new Node(data);
		if (pos<1)
		{
			System.out.println("Invalid pos");
			return;
		}
		if(pos == 1)
		{
			InsertAtBegin(data);
			return;
		}
		if(pos == count()+1)
		{
			InsertAtEnd(data);
			return;
		}
		Node temp = head;
		for(int i =1;i<pos-1;i++)
		{
			temp = temp.next;
		}
		newNode.next = temp.next;
		temp.next.prev = newNode;
		newNode.prev = temp;
		temp.next = newNode;
	}
	
	public void DeleteAtPos(int pos)
	{
	    // no node
	    if (head == null)
	    {
	        System.out.println("No node");
	        return;
	    }

	   

	    // invalid position
	    if (pos < 1 || pos > count())
	    {
	        System.out.println("Invalid position");
	        return;
	    }

	    // delete at beginning
	    if (pos == 1)
	    {
	        deleteAtBegin();
	        return;
	    }

	    // delete at end
	    if (pos == count())
	    {
	        DeleteAtEnd();
	        return;
	    }

	    // delete in between
	    Node temp = head;
	    for (int i = 1; i < pos-1; i++)
	    {
	        temp = temp.next;
	    }

	    temp.next = temp.next.next;
	    temp.next.prev = temp;
	}

}
