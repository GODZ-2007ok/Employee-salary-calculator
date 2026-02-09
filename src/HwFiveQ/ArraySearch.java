package HwFiveQ;

import java.util.Scanner;

public class ArraySearch {
	public static void main (String [] arg)
	{
		Scanner sc = new Scanner (System.in);
		System.out.print("Enter no of Array elements: ");
		int n = sc.nextInt();
		int [] arr = new int [n];
		
		
		for(int i=0; i< arr.length; i++)
		{
			System.out.print("Enter "+i+" elements: ");
			arr[i] = sc.nextInt();
		}
		
		System.out.print("Enter the value you want to search: ");
		int Target = sc.nextInt();
		boolean found = false;
		for(int i=0; i< arr.length; i++)
		{
			if (Target == arr[i])
			{
				found = true;
				break;
			}
			
		}
		if(found)
		{
			System.out.println("Found");
		}
		else
		{
			System.out.println("Not found");
		}
	     
	}
}
