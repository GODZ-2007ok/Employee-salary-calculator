package DSA;

import java.util.Scanner;

public class LinearSearch {
	public static void main (String [] arg)
	{
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter size of array: ");
		int n = sc.nextInt();
		int [] a = new int [n];
		long start = System.nanoTime();
		for(int i=0;i<a.length;i++)
		{
			System.out.println("Enter ["+i+"] element: ");
			 a[i] = sc.nextInt();

		}
		System.out.println("Enter element you want to search: ");
		int key = sc.nextInt();
		boolean found = false;
		for(int i=0;i<a.length;i++)
		{
			if (a[i] == key)
			{
				System.out.println("element found in index " +i);
				found = true;
				break;
			}
		
		}
		long end = System.nanoTime();
		long time = end-start;
		if (! found)
		{
			System.out.println("not found");
		}
		else
		{
			System.out.println("time taken = "+ time);
		}
	}
}

