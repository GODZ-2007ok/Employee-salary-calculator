package DSA;
import java.util.Scanner;
public class arrayElmntSum {

	public static void main( String [] args)
	{
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter the size of array: ");
		int n = sc.nextInt();
		int sum = 0;
		int arr[] = new int [n];
		
		long start = System.nanoTime();
		for(int i=0;i<n;i++)
		{
			System.out.println("Enter "+i+" element: ");
			arr[i] = sc.nextInt();
			sum = sum + arr[i];
		}
		long stop = System.nanoTime();
		long time = stop - start;
		System.out.println("Sum is "+sum);
		System.out.println("Time is "+time);
	}
}
