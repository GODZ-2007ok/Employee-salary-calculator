package Interface;

public class vehicleDemo {

	public static void main(String [] arg)
	{
		car c = new car();
		bike b = new bike();
		
		b.start();
		b.drive();
		c.drive();
		c.start();
	}
}
