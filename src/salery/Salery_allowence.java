package salery;

import java.util.Scanner;

public class Salery_allowence {

	public static void main (String[] arg) 
	{
		Scanner inpObj = new Scanner(System.in);
		System.out.print("Enter salery: ");
		int Salery = inpObj.nextInt();
		System.out.print("Enter HRA: ");
		int HRA = inpObj.nextInt();
		int HRA1 = (HRA * Salery)/100;
		System.out.print("Enter DA: ");
		int DA = inpObj.nextInt();
		int DA1 = (DA * Salery)/100;
		int Gross = HRA1 + DA1 + Salery;
		
		System.out.print("The pay check in total is " + Gross);
		
		
		
		
	}
}
