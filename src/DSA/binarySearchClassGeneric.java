package DSA;

import java.util.Scanner;

class binarySearching <T extends Comparable<T>> {

	T [] arr;
	
	binarySearching (T [] arr)
	{
		this.arr = arr;
	}
	public  int binarySearch1( T key)
	{
		int low =0;
		int high = arr.length - 1;
		
		while (low <= high)
		{
			int mid = (low + high) / 2;

	        int cmp = key.compareTo(arr[mid]);

	        if (cmp == 0) {
	            return mid;
	        } else if (cmp > 0) {
	            low = mid + 1;
	        } else {
	            high = mid - 1;
	        }
	    }
	    return -1;
	}
}
 public class binarySearchClassGeneric
 {
	 public static void main (String [] arg)
	 {
	 Scanner sc = new Scanner (System.in);
	 System.out.println("enter number of elements: ");
		int n = sc.nextInt();
		 
		Integer [] arr = new Integer[n];  
		
		for(int i=0;i<arr.length;i++)
		 {
			 System.out.println("Enter "+i+" element: ");
			 arr[i] = sc.nextInt();
		 }
		 
		System.out.println("Enter the element you want to Search: ");
		 Integer key = sc.nextInt();
		 
		 binarySearching<Integer> bs = new binarySearching<>(arr);  //#### important for me object creation
		int res =  bs.binarySearch1( key);
		
		
		if(res!=-1)
		 {
			 System.out.println("found at index "+ res );
		 }
		 else
		 {
			 System.out.println("not found");
		 }
 }
 }
