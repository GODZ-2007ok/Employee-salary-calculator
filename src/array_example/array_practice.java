package array_example;

import java.util.Scanner;

public class array_practice {

	public static void main(String[] args) 
	{
		int[]arr = new int[7];
		
		Scanner inpObj = new Scanner(System.in);
		
		for(int i=0; i<7; i++)
		{
			System.out.println("Enter arr["+i+"] element");
			arr[i] = inpObj.nextInt();
			
		}
		System.out.println("Arrays displayed");
		
		int n = arr.length;
		for(int i=0;i < n; i++)
		{
			System.out.print(arr[i] + " ");
		}

	}

}
