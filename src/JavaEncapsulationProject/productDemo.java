package JavaEncapsulationProject;
import java.util.Scanner;
public class productDemo {

	public static void main(String [] arg)
	{
		Scanner sc = new Scanner (System.in);
		product.starting();
		
		System.out.println("\n------------Enter product 1 details-----------");
		System.out.println("Enter product 1 ID: ");
		int pid1 = sc.nextInt();
		System.out.println("Enter product 1 name: ");
		String pN1 = sc.next();
		System.out.println("Enter price of product 1: ");
		double price1 = sc.nextDouble();
		product p1 = new product(pid1,pN1,price1);
		p1.display();
		sc.nextLine();
		
		System.out.println("\n------------Enter product 2 details-----------");
		System.out.println("Enter product 2 ID: ");
		int pid2 = sc.nextInt();
		System.out.println("Enter product 2 name: ");
		String pN2 = sc.next();
		System.out.println("Enter price of product 2: ");
		double price2 = sc.nextDouble();
		product p2 = new product(pid2,pN2,price2);
		p2.display();
		
		String res = p1.compare(p2);
		System.out.println(res);
		

	}
}
