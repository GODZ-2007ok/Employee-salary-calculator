package Encapsulation;

public class Real_and_imaginary {

	private int real;
	private int img;
	
	public void setData(int real,int img)
	{
		this.real = real;
		this.img = img;
	}
	public void output()
	{
		System.out.println("addition of real and imaginary part is "+this.real+" + "+this.img+"i");
	}
	public Real_and_imaginary add(Real_and_imaginary cn2)
	{
		Real_and_imaginary cn3 = new Real_and_imaginary();
		cn3.real = this.real + cn2.real;
		cn3.img = this.img + cn2.img;
		return cn3;
	}
}
