package Encapsulation;
import java.util.Scanner;
public class movieDemo {

	public static void main (String [] arg)
	{
		Scanner sc = new Scanner (System.in);
		
		movie m1 = new movie();
		System.out.println("\n........enter m1 details..........");
		System.out.println("enter movie name: ");
		String mN = sc.next();
		System.out.println("Enter movie id: ");
		int mid = sc.nextInt();
		System.out.println("Enter movie language: ");
		String mLang = sc.next();
		System.out.println("Enter movie Rating: ");
		int rating = sc.nextInt();
		
		m1.setData(mN, mid, mLang, rating);
		m1.getData();
		m1.Rating();
		
		movie m2 = new movie();
		System.out.println("\n........enter m2 details..........");
		System.out.println("enter movie name: ");
		String mN1 = sc.next();
		System.out.println("Enter movie id: ");
		int mid1 = sc.nextInt();
		System.out.println("Enter movie language: ");
		String mLang1 = sc.next();
		System.out.println("Enter movie Rating: ");
		int rating1 = sc.nextInt();
		
		m2.setData(mN1, mid1, mLang1, rating1);
		m2.getData();
		m2.Rating();
	}
}
