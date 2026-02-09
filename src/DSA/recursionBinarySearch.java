package DSA;
import java.util.Scanner;
 class recursion {

	public static int binarySearch(int[] arr,int low,int high,int key)
	{
		if(low > high)
		{
			return - 1;
		}
		else 
		{
			int mid =(low + high)/2;
			if(arr[mid] == key)
			{
				return mid;
			}
			else if (key < arr[mid])
			{
				return binarySearch(arr,low ,mid-1,key);
			}
			else 
			{
				return binarySearch(arr,mid+1,high,key);
			}
		}
	}
}
 
 public class recursionBinarySearch
 {
	 public static void main (String [] arg)
	 {
		 Scanner sc = new Scanner(System.in);
		 System.out.println("Enter the size of array: ");
		
		 int n = sc.nextInt();
		 int [] arr =new int [n];
		 for(int i=0;i<arr.length;i++)
		 {
			 System.out.println("enter "+i+" element");
			 arr[i] = sc.nextInt();
		 }
		 System.out.println("Enter key to Search: ");
		 int key = sc.nextInt();
		 
		 int res = recursion.binarySearch(arr, 0, arr.length-1, key);
		 
		 if(res!= -1)
		 {
			 System.out.println("found at Index "+ res);
		 }
		 else
		 {
			 System.out.println("not found");
		 }
	 }
 }
