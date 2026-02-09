package abstract1;

public abstract class person {

	private String name;
	private char gender;
	private int age;
	
	public person(String n,char g, int a)
	{
		this.name = n;
		this.gender = g;
		this.age = a;
	}
	public  abstract String rating();
	
	public void disp()
	{
		System.out.println("name "+this.name);
		System.out.println("gender "+this.gender);
		System.out.println("age "+this.age);
	}
}
