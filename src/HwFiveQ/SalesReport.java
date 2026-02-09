package HwFiveQ;
import java.util.Scanner;
public class SalesReport {

	public static void main (String [] arg)
	{
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter no of days: ");
		int n = sc.nextInt();
		int week = n/7;
		int sum =0;
		int avg;
		int w = week * 7;
		System.out.println("No of week is: "+ week);
		
		int arr[] = new int [w];
		for (int i = 0;i<arr.length;i++)
		{
			System.out.println("Enter [" + i +"] element: ");
			arr[i] = sc.nextInt();
		}
		
		for (int i = 0;i<arr.length;i++)
		{
			sum = sum+ arr[i];
			
		}
		System.out.println("Total sales in: "+ week + " weeks is "+ sum);
		
		avg = sum/week;
		System.out.println("Average Sales: "+ avg);
		
		int max = arr[0];
		int min = arr[0];
		for (int i=0;i<arr.length;i++)
		{
			
			if(arr[i] > arr[0])
			{
				max = arr[i];
			}
			else if (arr[i] < arr[0])
			{
				min = arr[i];
			}
			
		}
		System.out.println("Highest sale: "+ max);
		System.out.println("lowest sale: " + min);
	}
}
