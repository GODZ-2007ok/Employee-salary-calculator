package multilevelInheritance;

public class cuboid extends Rectangle
{

	private int height;
	
	public cuboid (String SN,int Ns, int l,int b,int h)
	{
		super(SN,Ns,l,b);
		this.height = h;
	}
	
	public int volume()
	{
		int res = super.area()*this.height;
		return res;
	}
	@Override
	public void disp()
	{
		super.disp();
		System.out.println("Height of cuboid id: "+this.height);
	}
	
	
}
