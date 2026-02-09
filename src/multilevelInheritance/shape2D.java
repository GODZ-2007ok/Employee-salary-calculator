package multilevelInheritance;

public class shape2D {

	private String ShapeN;
	private int Nside;
	
	public shape2D(String SN,int Ns)
	{
		this.ShapeN = SN;
		this.Nside = Ns;
	}
	public void disp()
	{
		System.out.println("Shape Name is: "+this.ShapeN);
		System.out.println("Shape number of side: "+this.Nside);
	}
}
