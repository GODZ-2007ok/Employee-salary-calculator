package oneDArray;
import java.util.Scanner;
public class evenOdd1D {

	public static void main (String [] arg)
	{
		Scanner sc = new Scanner (System .in);
		System.out.println("Enter the size of array: ");
		int n = sc.nextInt();
		int [] a = new int [n];
		for (int i=0;i<a.length;i++)
		{
			System.out.println("Enter ["+(i+1)+"] element: ");
			a [i] = sc.nextInt(); 
		}
		int ecount=0;
		int ocount=0;
		for (int i=0;i<a.length;i++)
		{
			if(a[i] % 2 == 0)
			{
				  ecount++;
				
			}
			else if (a[i] % 2 != 0)
			{
				ocount++;
			}
		}
		System.out.println("number of even terms = "+ ecount); 
		System.out.println("number of odd terms= "+ ocount);

	}
}
