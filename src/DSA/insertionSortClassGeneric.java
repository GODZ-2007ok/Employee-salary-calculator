package DSA;
import java.util.Scanner;
 class insertionSort<T extends Comparable <T>> {

	 T [] arr;
	 
	 insertionSort (T[] arr)
	 {
		 this.arr = arr;
	 }
	 public void sort()
	 {
		 for(int i=1;i<arr.length;i++)
		 {
			 int j = i-1;
			 T key = arr[i];
			 
			 while(j>=0 && arr[j].compareTo(key)>0)
			 {
				 arr[j+1]= arr[j];
				 j = j-1;
			 }
			 arr[j+1] = key;
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
 
 public class insertionSortClassGeneric
 {
	 public static void main (String [] arg)
	 {
		 Scanner sc = new Scanner (System.in);
			System.out.print("Enter array size: ");
	        int n = sc.nextInt();

	        Integer[] arr = new Integer[n];
	        for(int i=0;i<arr.length;i++)
			 {
				 System.out.print("Enter "+(i+1)+" element of integer type: ");
				 arr[i] = sc.nextInt();
			 }
	        insertionSort <Integer> inSo = new insertionSort<>(arr); 
	        inSo.sort();
	        inSo.display();
	 }
 }
