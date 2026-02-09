package DSA;
import java.util.Scanner;
 class Bubblesort<T extends Comparable <T>> {

	T[] arr;
	
	public Bubblesort(T [] arr)
	{
		this.arr = arr;
	}
	public void sort()
	{
		for(int i=0;i<arr.length - 1;i++)
		{
			for(int j=0;j<arr.length - i - 1;j++)
			{
				if(arr[j].compareTo(arr[j+1]) > 0)
				{
					T temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp; 
				}
			}
		}
	}
	public void display()
	{
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]);
		}
	}
}
 
 public class bubblesortClassGeneric
 {
	 public static void main (String [] arg)
	 {
		 Scanner sc = new Scanner (System.in);
		 System.out.println("Enter size of array: ");
		 int n = sc.nextInt();
		 Integer []arr = new Integer [n];
		 for(int i=0;i<arr.length;i++)
		 {
			 System.out.print("enter "+ i + " element: ");
			 arr[i] = sc.nextInt();
		 }
		 Bubblesort <Integer> bs = new Bubblesort<>(arr);
		 
		 bs.sort();
		 bs.display();
	 }
 }
