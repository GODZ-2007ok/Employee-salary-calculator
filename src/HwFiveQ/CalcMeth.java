package HwFiveQ;
import java.util.Scanner;
public class CalcMeth {
	public static void main (String [] arg)
	{
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter number a: ");
		int a = sc.nextInt();
		System.out.println("Enter number b: ");
		int b = sc.nextInt();
		System.out.println("enter 1 for addition: \n"
				+ "enter 2 for Multiplication: \n" + 
		           "enter 3 for Substraction: \n"
		           + "enter 4 for division: ");
		int choice = sc.nextInt();
		int result = CalcMeth.Sol(a, b, choice);
		System.out.println("Result: "+ result);
	}
	public static int Sol (int a,int b,int choice)
	{
		int res=0;
		
		if (choice == 1)
		{
		   res = a + b;
			
		}
		else if (choice==2)
		{
			res = a*b;
		}
		else if (choice==3)
		{
			res = a-b;
		}
		else if (choice==4 && a>b)
		 {
			 res = a/b;
		 }
		 else
		 {
			 System.out.print("Not possible");
		 }
		 return res;
	}

}
