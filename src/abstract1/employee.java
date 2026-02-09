package abstract1;

public class employee extends person{
	private int empid;
	private int rating;
	public employee(String n,char g, int a,int eid,int r)
	{
		super(n,g,a);
		this.empid = eid;
		this.rating = r;
		
	}
	@Override
	public String rating()
	{
		String res = null;
		if(this.rating > 5)
		{
			res = "good employeee with "+this.rating;
		}
		else
		{
			res = "bad employee with "+this.rating;
		}
		return res;
	}
	public void disp()
	{
		super.disp();
		System.out.println("employee id is "+this.empid);
		System.out.println("employee rating is "+this.rating);
	}

}
