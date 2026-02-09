package multilevelInheritance;

public class Rectangle extends shape2D {

	private int l;
	private int b;
	
	public Rectangle(String SN,int Ns, int l,int b)
	{
		super(SN,Ns);
		this.l = l;
		this.b = b;
	}

public int area()
{
	int res = this.l * this.b;
	return res;
}
public int perimeter()
{
	int res =  2*(this.l + this.b);
	return res;
}
	@Override
	public void disp()
	{
		super.disp();
		System.out.println("Rectangle length is: "+this.l);
		System.out.println("Rectangle breadth is: "+this.b);
		
	
}
	}
