package DSA;
import java.util.Scanner;
 class binary {

	public static int binarySearch(int []arr,int key)
	{
		int low =0;
		int high = arr.length - 1;
		
		while (low <= high)
		{
			int mid = (low + high)/2;
			
			if(key == arr[mid])
			{
				return mid;
			}
			else if (key > arr[mid])
			{
				low = mid + 1;
			}
			else
			{
				high = mid - 1;
			}
		}
		return -1;
	}
	
}
 
 public class binarySearch
 {
	 public static void main (String [] arg)
	 {
		 Scanner sc = new Scanner (System.in);
		 System.out.println("enter number of elements: ");
		 int n = sc.nextInt();
		 
		int [] arr = new int[n];  
		
		
		
		for(int i=0;i<arr.length;i++)
		 {
			 System.out.println("Enter "+i+" element: ");
			 arr[i] = sc.nextInt();
		 }
		 System.out.println("Enter the element you want to Search: ");
		 int key = sc.nextInt();
		 long start = System.nanoTime();
		int res =  binary.binarySearch(arr, key);
		long stop = System.nanoTime();
		if(res!=-1)
		 {
			 System.out.println("found at index "+ res );
		 }
		 else
		 {
			 System.out.println("not found");
		 }
		
		long time = stop - start;
		System.out.println("Time of execution is "+time);
	 }
 }
