package inheritanceJava;

public class Marks extends Course
{

	private int Alm;
	private int project;
	private int endsem;
	
	public Marks(int cc,String cN,int alm,int pro,int endsm)
	{
		super(cc,cN);
		this.Alm = alm;
		this.project = pro;
		this.endsem = endsm;
	}
	@Override
	public void display()
	{
		super.display();
		System.out.println("ALM marks is: "+this.Alm);
		System.out.println("Project marks is: "+this.project);
		System.out.println("Endsem marks is: "+this.endsem);
	}
	public int getTot()
	{
		
		int res = 0;
		res = this.Alm + this.endsem + this.project;
		return res;
	}
	public int topper(Marks[] m)
	{
		int top = m[0].getTot();
		for(int i=0;i<m.length;i++)
		{
			if(m[i].getTot() > top)
				top = m[i].getTot();
		}
		return top;
	}


		
	
}
