package DSA;
import java.util.Scanner;
 class selectionSort <T extends Comparable <T>>{

	 T[] arr;
	 
	 selectionSort(T [] arr)
	 {
		 this.arr = arr;
	 }
	 public void sort()
	 {
		 for(int i=0;i<arr.length;i++)
		 {
			 int midIndex = i;
			 for(int j=i+1;j<arr.length;j++)
			 {
				 if(arr[midIndex].compareTo(arr[j]) > 0)
				 {
					 midIndex = j;
				 }
			 }
			 T temp = arr[i];
			 arr[i] = arr[midIndex];
			 arr[midIndex] = temp;
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
 public class selectionSortClassGeneric
 {
	 public static void main(String [] arg)
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
		 selectionSort <Integer> ss = new selectionSort<>(arr);
		 ss.sort();
		 ss.display();
	 }
 }
