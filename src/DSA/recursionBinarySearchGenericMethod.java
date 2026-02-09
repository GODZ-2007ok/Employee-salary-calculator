package DSA;
import java.util.Scanner;
 class recursionBinarySearchGeneric{

	public static <T extends Comparable<T>> int binarySearchon(T [] arr,int low,int high,T key)
	{
		
		if (low > high) {
	        return -1; // base case: not found
	    }

	    int mid = (low + high) / 2;
	    int cmp = key.compareTo(arr[mid]);

	    if (cmp == 0) {
	        return mid;
	    } else if (cmp < 0) {
	        return binarySearchon(arr, low, mid - 1, key);
	    } else {
	        return binarySearchon(arr, mid + 1, high, key);
	    }
	}
 }
 
 public class recursionBinarySearchGenericMethod
 {
	 public static void main (String [] arg)
	 {
		 Scanner sc = new Scanner(System.in);
		 System.out.println("Enter the size of array: ");
		
		 int n = sc.nextInt();
		 Integer [] arr =new Integer [n];
		 for(int i=0;i<arr.length;i++)
		 {
			 System.out.println("enter "+i+" element");
			 arr[i] = sc.nextInt();
		 }
		 System.out.println("Enter key to Search: ");
		 Integer key = sc.nextInt();
		 
		 int res = recursionBinarySearchGeneric.binarySearchon(arr, 0, arr.length-1, key);
		 
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
