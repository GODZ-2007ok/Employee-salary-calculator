package multilevelInheritance;
import java.util.Scanner;
public class shape2dDemo {

	public static void main (String [] arg)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter shape: ");
		String SN = sc.next();
		System.out.println("enter number of sides: ");
		int Ns = sc.nextInt();
		System.out.println("enter length: ");
		int l = sc.nextInt();
		System.out.println("enter breadth : ");
		int b = sc.nextInt();
		System.out.println("enter height of cuboid: ");
		int h = sc.nextInt();
		cuboid c = new cuboid( SN, Ns,  l, b, h);
		sc.nextLine();
		c.disp();
		System.out.println("Area of rectangle: " + c.area());
        System.out.println("Perimeter of rectangle: " + c.perimeter());
        System.out.println("Volume of cuboid: " + c.volume());
	}
	
}
