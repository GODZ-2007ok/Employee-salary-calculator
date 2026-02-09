package JavaEncapsulationProject;

public class product {
 
	private int productId;
	private String productName;
	private double price;
	
	product()
	{
		this.productId = 000;
		this.productName = "******";
		this.price = 0000;
	}
	product(int pId,String pName,double price)
	{
		this.productId = pId;
		this.productName =pName;
		this.price = price;
	}
	public static void starting()
	{
		System.out.println("\n--------------Welcome to ching store------------");
	}
	
	public double disc()
	{
		double res = 0;
		if(this.price <= 500 )
		{
			 res = this.price ;
		}
		else if(this.price > 500 && this.price <= 1000)
		{
			 res = (10.0/100)*this.price;
		}
		else if(this.price > 1000 && this.price <= 3000)
		{
			res = (25.0/100)*this.price; 
		}
		else if(this.price > 3000)
		{
			res = (30.0/100)*this.price;
		}
		return res;
	}
	
	public double priceWithTax()
	{
		double m = this.price - this.disc();
		double tax = 0;
		if(m <= 100)
		{
			 tax =  m;
			
		}
		else if(m >100 && m <=500)
		{
			 tax =  m+(m)*3/100;
			 
		}
		else if(m >500 && m <=1000)
		{
			 tax = m+(m)*12/100;
			 
		}
		else if(m >1000 && m <=5000)
		{
			 tax = m+(m)*20/100;
			 
		}
		else
		{
			tax = m+(m)*36/100;
			 

		}
		return  tax;
		
	}
	
	public String compare(product p2)
	{
		String res = null;
		
		if(this.priceWithTax() > p2.priceWithTax())
		{
			 res = p2.productName+" is cheaper than "+this.productName;
		}
		else if(this.priceWithTax() < p2.priceWithTax())
		{
			res = this.productName+" is cheaper than "+p2.productName;
		}
		return res;
			
	}
	public void display()
	{
		double dis = this.price - this.disc();
		System.out.println("MRP after discount of product is : "+ dis);
		System.out.println("MRP after discount and tax is : "+this.priceWithTax());
	}
	

}
