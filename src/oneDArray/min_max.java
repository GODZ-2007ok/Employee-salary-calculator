package oneDArray;

import java.util.Scanner;

public class min_max {

	public static void main (String [] arg)
	{
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter size of array: ");
		int n = sc.nextInt();
		int [] a = new int [n];
		for(int i=0;i<a.length;i++)
		{
			System.out.println("Enter ["+i+"] element: ");
			 a[i] = sc.nextInt();
		}
		int min = a[0];
		for(int i=0;i<a.length;i++)
		{
			if (a[i] < min)
			{
				min = a[i];
			}
			
		}
		int max = a[0];
		for(int i=0;i<a.length;i++)
		{
			if (a[i] > max)
			{
				max = a[i];
			}
		}
		System.out.println("max is: "+ max);
		System.out.println("min is : "+ min);

		}
}
