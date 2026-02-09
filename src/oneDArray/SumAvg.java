package oneDArray;

import java.util.Scanner;

public class SumAvg {
	
public static void main (String [] arg)
{
	Scanner sc = new Scanner (System.in);
	System.out.println("Enter size of array: ");
	int n = sc.nextInt();
	int [] a = new int [n];
	for(int i=0;i<a.length;i++)
	{
		System.out.println("Enter ["+(i+1)+"] element: ");
		 a[i] = sc.nextInt();
}
	int sum = 0;
	for(int i=0;i<a.length;i++)
	{
		sum = sum+a[i];
		
	}
	int avg = sum/n;
	System.out.println("sum is "+sum);
	System.out.println("avg is "+avg);
}
}
