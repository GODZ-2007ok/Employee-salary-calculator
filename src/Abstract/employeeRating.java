package Abstract;

public class employeeRating extends employee {

	private int rating;
	
	public employeeRating(int eid,String eN,int R)
	{
		super(eid,eN);
		this.rating = R;
	}
	@Override
	public String MaxRating()
	{
		String res = null;
		if(this.rating >= 3 && this.rating <=5)
		{
			res = "Good employee";
		}
		else if(this.rating >5 && this.rating <=10)
		{
			res = "Noice employee damnnn";
		}
		else
		{
			res = "damnn bruh";
		}
		return res;
	}
	@Override
	public void disp()
	{
		super.disp();
		System.out.println("employee is: "+this.MaxRating());
	}
}
