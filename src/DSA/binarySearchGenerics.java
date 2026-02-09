package DSA;

import java.util.Scanner;

 class binaryGen {

	public static <T extends Comparable<T>>int binarySearch(T []arr, T key)
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
 
 public class binarySearchGenerics
 {
	 public static void main (String [] arg)
	 {
		 Scanner sc = new Scanner (System.in);
		 System.out.println("Enter choice\n1.)Integer\n2.)Double\n3.)String");
		 int choice = sc.nextInt();
		
		 
		 switch (choice)
		 {
		 case 1: // for Integer
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
		 
		 long start = System.nanoTime();
		int res =  binaryGen.binarySearch(arr, key);
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
		break;
		
		 case 2: // for Double
			 System.out.println("enter number of elements: ");
				int n1 = sc.nextInt();
				 
				Double [] arr1 = new Double[n1];  
				
				for(int i=0;i<arr1.length;i++)
				 {
					 System.out.println("Enter "+i+" element: ");
					 arr1[i] = sc.nextDouble();
				 }
				 
				System.out.println("Enter the element you want to Search: ");
				 Double key1 = sc.nextDouble();
				 
				 long start1 = System.nanoTime();
				int res1 =  binaryGen.binarySearch(arr1, key1);
				long stop1 = System.nanoTime();
				
				if(res1!=-1)
				 {
					 System.out.println("found at index "+ res1 );
				 }
				 else
				 {
					 System.out.println("not found");
				 }
				
				long time1 = stop1 - start1;
				System.out.println("Time of execution is "+time1);
				break;
				
		 case 3: // for String
			 System.out.println("enter number of elements: ");
				int n2 = sc.nextInt();
				 
				String [] arr2 = new String[n2];  
				
				for(int i=0;i<arr2.length;i++)
				 {
					 System.out.println("Enter "+i+" element: ");
					 arr2[i] = sc.next();
				 }
				 
				System.out.println("Enter the element you want to Search: ");
				 String key2 = sc.next();
				 
				 long start2 = System.nanoTime();
				int res2 =  binaryGen.binarySearch(arr2, key2);
				long stop2 = System.nanoTime();
				
				if(res2!=-1)
				 {
					 System.out.println("found at index "+ res2 );
				 }
				 else
				 {
					 System.out.println("not found");
				 }
				
				long time2 = stop2 - start2;
				System.out.println("Time of execution is "+time2);
				break;
	 }
}
 }
