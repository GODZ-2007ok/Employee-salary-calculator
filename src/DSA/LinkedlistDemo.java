package DSA;

class Node
{
    int data;
    Node link;
    
    public Node(int data)
    {
        this.data = data;
        this.link = null;
    }
}

class SingleLinkedList
{
    private Node head = null;
    
    public void create(int data)
    {
        Node newnode = new Node (data);
        
        if(head == null)
        {
            head = newnode;
            return;
        }
    
        
        Node temp = head;
        while(temp.link != null)
        {
            temp = temp.link;
        }
        temp.link=newnode;
    }
        public void display()
        {
        	Node temp =head;
          while(temp != null)
          {
            System.out.print(temp.data+"---> ");
            temp = temp.link;
          }
          System.out.print("null");
        
    }
        
        public void InsertAtBegin(int data)
        {
          Node newNode = new Node(data);
          newNode.link = head;
          head = newNode;
          
        }
       
        public void InsertAtEnd(int data)
        {
        	Node newNode = new Node(data);
        	if(head == null)
        	{
        		head = newNode;
        	return;
        	}
        	Node temp = head;
        	while(temp.link != null) {
        		temp = temp.link;
        	}
        	temp.link = newNode;
        }
        
        public int Count_node()
        {
        	Node temp = head;
        	int count =0;
        	while(temp!= null)
        	{
        		count++;
        		temp = temp.link;
        	}
        	return count;
        }  
        
        public int evenCount_node()
        {
        	Node temp = head;
        	int count =0;
        	while(temp!= null)
        	{
        		if(temp.data % 2 == 0)
        		{
        		count++;
        		}
        		temp = temp.link;
        	}
        	return count;
        }  
        
        public int oddCount_node()
        {
        	Node temp = head;
        	int count =0;
        	while(temp!= null)
        	{
        		if(temp.data % 2 != 0)
        		{
        		count++;
        		}
        		temp = temp.link;
        	}
        	return count;
        }  
        
        
        
        public void PositionInsertion(int data,int pos)
        {
        	Node newNode = new Node(data);
        //case 1
        	if(pos == 1)
        	{
        		InsertAtBegin(data);
        		return;
        	}
        	//case 2
        	if(pos==(Count_node()+1))
        	{
        		InsertAtEnd(data);
        		return;
        	}
        	//in between
        	Node temp = head;
        	for(int i=1;i<pos-1 && temp!= null;i++) //pos-1 && temp!=null
        	{
        		
        		temp = temp.link;
        	}
        	if(temp == null)
    		{
    			System.out.println("Invalid position");
    			return;
    		}
        	
        	newNode.link=temp.link;
        	temp.link = newNode;
        }
        
        public int max_ele()  // maximum element
        {
        	Node temp = head;
        	int max = temp.data;
        	
        	while(temp != null)
        	{
        		if(temp.data > max)
        		{
        			max = temp.data;
        			
        		}
        		temp = temp.link;
        	}
        	return max;
        }
        
        public int min_ele()  // Minimum element
        {
        	Node temp = head;
        	int min = temp.data;
        	
        	while(temp != null)
        	{
        		if(temp.data <min)
        		{
        			min = temp.data;
        			
        		}
        		temp = temp.link;
        	}
        	return min;
        }
        
        public int sum()
        {
        	Node temp = head;
        int sum = 0;
        	while(temp != null)
        	{
        		sum = sum+temp.data;
        		temp = temp.link;
        	}
        	return sum;
        }
        
        public int avg()
        {
        	Node temp = head;
        	int avg = 0;
        
        	while(temp != null)
        	{
        		avg = sum()/Count_node();  
        		temp = temp.link;
        		}
        	return avg;
        }
        
        public void deleteAtBegin()
        {
        	// case 1: no element 
        	if(head == null)
        	{
        		System.out.println("List empty");
        		return;
        	}
        	head = head.link; // making second node link as the head
        }
        
        
        public void deleteAtEnd()
        {
        	Node temp = head;
        	if(head == null)
        	{
        		System.out.println("No element");
        	}
        	else	 if(temp.link == null)
        	{
        		head = null;
        	}
        	else
        	{
        		while(temp.link.link !=null)
        		{
        			temp = temp.link;
        		}
        		temp.link = null;
        	}
        }
        		
        	//Sorting
        	public void sorting()
        	{
        		if(head == null || head.link == null)
        		{
        			System.out.println("list empty or single list");
        		}
        		Node i = null;
        		Node j = null;
        		
        		for(i = head ; i!= null ; i=i.link)
        		{
        			for(j = head ; j.link!=null ; j=j.link)
        			{
        				int temp = j.data;
        				j.data = j.link.data;
        				j.link.data = temp;
        			}
        		}
        	
        	
        	
        	}
        }
public class LinkedlistDemo
{
    public static void main (String [] arg)
    {
        SingleLinkedList sll = new SingleLinkedList();
        sll.InsertAtBegin(20);
        
        sll.create(10);
        sll.create(5);
        sll.create(15);
        sll.create(25);
        sll.create(125);
        sll.InsertAtEnd(12);
       
       
        sll.deleteAtBegin();
       sll.deleteAtEnd();
       sll.sorting();
        sll.display();
        
        System.out.println();
        System.out.println("total elements is "+sll.Count_node());
        System.out.println("even count is "+sll.evenCount_node());
        System.out.println("odd count is "+sll.oddCount_node());
        System.out.println("Max element is "+sll.max_ele());
        System.out.println("Min element is "+sll.min_ele());
       System.out.println("sum is: "+sll.sum());
       System.out.println("average is: "+sll.avg());
    }
}