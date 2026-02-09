package inheritanceJava;

public class Course {

	private int ccode;
	private String cName;
	
	public Course (int cc,String cN)
	{
		this.ccode = cc;
		this.cName = cN;
	}
	public void display()
	{
		System.out.println("Course code is: "+this.ccode);
		System.out.println("Course name: "+this.cName);
	}
	
}
