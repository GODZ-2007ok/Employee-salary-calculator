package oneDArray;
import java.util.Scanner;
public class Reverse {

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
		for(int i=0;i<n/2;i++)
		{
			int temp = a[i];
			a[i]= a[n-i-1];
			a[n-i-1] = temp;
		}
		System.out.println("Reversed Array");
		for (int l : a)
		{
			System.out.println(l + " ");

		}

	}
}
