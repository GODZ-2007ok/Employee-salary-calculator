package CircularLL;



class Node {
	int data;
    Node link;
    
    public Node(int data)
    {
    	this.data = data;
    	this.link = null;
    	}
	
}

class circularLinkedListNode
{
private Node head = null;
    
    public void create(int data)
    {
        Node newnode = new Node (data);
        
        if(head == null)
        {
            head = newnode;
            newnode.link = head;
            return;
        }
    
        
        Node temp = head;
        while(temp.link != head)
        {
            temp = temp.link;
        }
        temp.link=newnode;
        newnode.link = head;
    }
    public void display()
    {
    	Node temp =head;
      do{
        System.out.print(temp.data+"---> ");
        temp = temp.link;
      }
      while(temp!= head);
    }
    
    public void InsertAtBegin(int data)
    {
    	Node newnode = new Node (data);
    //empty list
    	if(head == null)
    	{
    		newnode.link = head;
    		head = newnode;
    }
    
    	
    	// insert at begin
    	Node temp = head;
    	while(temp.link != head)
    	{
    		temp = temp.link;
    	}
    	temp.link = newnode;
    	newnode.link = head;
    	head = newnode;
}
    public void insertAtEnd(int data)
    {
Node newnode = new Node (data);
        
        if(head == null)
        {
            head = newnode;
            newnode.link = head;
            return;
        }
    
        
        Node temp = head;
        while(temp.link != head)
        {
            temp = temp.link;
        }
        temp.link=newnode;
        newnode.link = head;
    }
    public int Count_node1()
    {
    	Node temp = head;
    	int count =0;
    	do
    	{
    		count++;
    		temp = temp.link;
    	}
   while(temp!= head);
   return count;
    }  
    
    public void insertAtPos(int pos,int data)
    {
    	if(pos<1 && pos > Count_node1()+2)
    	{
    		System.out.println("Invalid position");
    		return;
    	}
    	Node newnode = new Node(data);
    	
    	//1st position
    	if(pos == 1) 
    	{
    		InsertAtBegin(data);
    		return;
    	}
    	if(pos == Count_node1()+1)
    	{
    		insertAtEnd(data);
    		return;
    	}
    			
    	Node temp = head;
    	for(int i=1;i<pos-1;i++)
    	{
    		temp=temp.link;
    	}
    	newnode.link = temp.link;
    	temp.link =newnode;
    }
    
    
    public void deleteAtBegin()
    {
    	// empty node
    	if(head == null)
    	{
    		System.out.println("Empty");
    	}
    	//single node
    	if(head.link == head)
    	{
    		head = null;
    		return;
    	}
    //multiple node
    	Node temp = head;
    	while(temp.link != head)
    	{
    		temp = temp.link;
    	}
    	temp.link = head.link;
    	head = head.link;
    }
    
    
    public void deleteAtEnd()
    {
    	Node temp = head;
    	while(temp.link.link != head)
    	{
    		temp=temp.link;
    	}
    	temp.link = head;
    }
    
    
    public void deleteAtPos(int pos,int data)
    {
    	if(pos<1 || pos>Count_node1()) 
    	{
    		System.out.println("Invalid");
    		return;
    	}
    	// 1st position
    	if(pos == 1)
    	{
    		deleteAtBegin();
    		return;
    	}
    	// last node
    	if(pos == Count_node1())
    	{
    		deleteAtEnd();
    	}
    	// middle position
    	Node temp = head;
    	for(int i=1 ; i<pos-1 ; i++)
    	{
    		temp = temp.link;
    	}
    		temp.link = temp.link.link;
    }
}
