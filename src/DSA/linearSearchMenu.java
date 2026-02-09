package DSA;
import java.util.Scanner;
 class linearSearcho {

	public static <T> int search(T []arr , T key) 
	 {
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i].equals(key))
					return (i+1);
		}
		return -1;
	}
		 
}

public class linearSearchMenu
{
	 public static void main (String [] arg)
	 {
		 Scanner sc = new Scanner (System.in);
		 
		 System.out.println("Enter 1 for Integer \nEnter 2 for Double \nEnter 3 for String");
		 System.out.println("Enter choice: ");
		
		 int choice = sc.nextInt();
		 
		 switch (choice)
		 {
		 case 1:
			 System.out.println("enter number of elements: ");
			 int n = sc.nextInt();
			 
			 Integer [] arr = new Integer[n]; //for Integer 
			
			 for(int i=0;i<arr.length;i++)
			 {
				 System.out.println("Enter "+(i+1)+" element of integer type: ");
				 arr[i] = sc.nextInt();
			 }
			 System.out.println("Enter the element you want to Search: ");
			 int key = sc.nextInt();
			
			 int result = linearSearcho.search(arr, key);
			 if(result!=-1)
			 {
				 System.out.println("found at index "+ result );
			 }
			 else
			 {
				 System.out.println("not found");
			 }
			 break;
		 
		 
		 case 2:
			 System.out.println("enter number of elements: ");
			 int n1 = sc.nextInt();
			
			 Double [] arr1 = new Double[n1]; //for Double
			
			 for(int i=0;i<arr1.length;i++)
			 {
				 System.out.println("Enter "+(i+1)+" element of double type: ");
				 arr1[i] = sc.nextDouble();
			 }
			 System.out.println("Enter the element you want to Search: ");
			 double key1 = sc.nextDouble();
			
			 int result1 = linearSearcho.search(arr1, key1);
			 if(result1!=-1)
			 {
				 System.out.println("found at index "+ result1 );
			 }
			 else
			 {
				 System.out.println("not found");
			 }
			 break;
			 
		 case 3:
			 System.out.println("enter number of elements: ");
			 int n2 = sc.nextInt();
			 
			 String [] arr2 = new String[n2]; //for String
			
			 for(int i=0;i<arr2.length;i++)
			 {
				 System.out.println("Enter "+(i+1)+" element of string type: ");
				 arr2[i] = sc.next();
			 }
			 System.out.println("Enter the element you want to Search: ");
			 String key2 = sc.next();
			
			 int result2 = linearSearcho.search(arr2, key2);
			 if(result2!=-1)
			 {
				 System.out.println("found at index "+ result2 );
			 }
			 else
			 {
				 System.out.println("not found");
			 }
			 break;
		 }
		 
		 
	 }
}


