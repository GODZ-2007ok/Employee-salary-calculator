package HwFiveQ;

import java.util.Scanner;

public class Sorting {

	public static void main (Scanner [] arg)
	{
		Scanner sc = new Scanner (System.in);
		System.out.print("Enter array elements: ");
		int no = sc.nextInt();
		
		int [] array = new int [no];
		
		for(int i =0; i<array.length;i++)
		{
			System.out.print("enter "+i+" elements: ");
			 array [i] = sc.nextInt();
			 
		}
		
		for (int num : array)
		{
			System.out.println("Before Sorting");
			System.out.print(num + " ");
		}
		int temp = 0;
		for(int i =0; i<array.length;i++)
		{
			for(int j=0;j<array.length-1;j++)
			{
				temp = array[j];
				array[j] = array[j+1];
				array[j+1] = temp;
			}
		}
		System.out.println();
		System.out.println("After Sorting");
		for (int num : array)
		{
			System.out.print(num + " ");
		}
		
	}
}
