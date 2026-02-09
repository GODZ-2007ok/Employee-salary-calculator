package Methods;

import java.util.Scanner;

public class Marks {

	public static void Sand()
	{
		System.out.print("You bought sandwich");
	}
	static void Pasta()
	{
		System.out.print("You bought Pasta");
	}
	static void Burger()
	{
		System.out.print("You bought Burger");
	}
	static void Nood()
	{
		System.out.print("You bought Noodles");
	}
	public static void main (String [] a)
	{
		System.out.print("Menu Options:\r\n"
				+ "1️Sandwich – ₹25\r\n"
				+ "2️ Pasta – ₹40\r\n"
				+ "3️ Burger – ₹50\r\n"
				+ "4 noodles - ₹100");
		Scanner sc = new Scanner (System.in);
		System.out.println();
		System.out.print("Enter the Number");
		int n = sc.nextInt();
		if (n==1)
		{
			Marks.Sand();
		}
		else if (n==2)
		{
			Marks.Pasta();
		}
		else if (n==3)
		{
			Marks.Burger();
		}
		else if (n==4)
		{
			Marks.Nood();
		}
	}
}
