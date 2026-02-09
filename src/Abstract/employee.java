package Abstract;

public abstract class  employee {

	private int empid;
	private String empN;
	
	public employee (int eid,String eN)
	{
		this.empid = eid;
		this.empN = eN;
	}
	public abstract String MaxRating();
	
	public void disp()
	{
		System.out.println("Employee name is: "+this.empN);
		System.out.println("Employee is is: "+this.empid);
	}
}
