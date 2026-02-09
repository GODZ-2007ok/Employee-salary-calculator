package Methods;

import java.util.Scanner;

public class MethodSol {

	public static void Mrng()
	{
		System.out.print("Good morning ma fellas");
	}
	public static void Nght()
	{
		System.out.print("Good night ma fellas");
	}
	public static void Aftrn()
	{
		System.out.print("Good afternoon ma fellas");
	}
	public static void evng()
	{
		System.out.print("Good evening ma fellas");
	}
	public static void main (String [] a)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Time in 24 hr format (use . between time): ");
		float time = sc.nextFloat();
		
		if (time >= 4.0 && time < 12.00)
		{
			MethodSol.Mrng();
		}
		else if (time >= 12.0 && time <= 15.00)
		{
			MethodSol.Aftrn();
		}
		else if (time > 15.0 && time <= 19.30)
		{
			MethodSol.evng();
		}
		else if (time > 19.30 && time <= 24.00)
		{
			MethodSol.Nght();
		}
	}
}
