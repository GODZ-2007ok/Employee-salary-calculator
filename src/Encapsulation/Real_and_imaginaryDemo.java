package Encapsulation;
import java.util.Scanner;
public class Real_and_imaginaryDemo {

	public static void main (String [] arg)
	{
		Scanner sc = new Scanner (System.in);
		Real_and_imaginary cn1 = new Real_and_imaginary();
		Real_and_imaginary cn2 = new Real_and_imaginary();
		
		System.out.println("\n----------------Enter cn1 data------------- ");
		System.out.println("Enter cn1 real part: ");
		int real1 = sc.nextInt();
		System.out.println("Enter cn1 imaginary part: ");
		int img1 = sc.nextInt();
		cn1.setData(real1, img1);
		System.out.println();
		
		System.out.println("\n----------------Enter cn2 data------------- ");
		System.out.println("Enter cn2 real part: ");
		int real2 = sc.nextInt();
		System.out.println("Enter cn2 imaginary part: ");
		int img2 = sc.nextInt();
		cn2.setData(real2, img2);
		
		Real_and_imaginary res = cn1.add(cn2);
		res.output();
	}
}
