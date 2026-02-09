package DSA;
import java.util.Scanner;
 class linearSearching<T> {

	T [] a;
	
	linearSearching (T [] a)
	{
		this.a = a;
	}
	public int search( T key) 
	 {
		for(int i=0;i<a.length;i++)
		{
			if(a[i].equals(key))
					return (i+1);
		}
		return -1;
	 }
}

public class linearSearchClassGeneric
{
	public static void main (String [] arg)
	{
		Scanner sc = new Scanner (System.in);
		System.out.print("Enter array size: ");
        int n = sc.nextInt();

        Integer[] a = new Integer[n];
        for(int i=0;i<a.length;i++)
		 {
			 System.out.println("Enter "+(i+1)+" element of integer type: ");
			 a[i] = sc.nextInt();
		 }
		 System.out.println("Enter the element you want to Search: ");
		 Integer key = sc.nextInt();
		
		 linearSearching<Integer> ls = new linearSearching<>(a);   //object creation ##### important for me
		 int result = ls.search( key);    // important for me
		
		 if(result!=-1)
		 {
			 System.out.println("found at index "+ result );
		 }
		 else
		 {
			 System.out.println("not found");
		 }
	}
}