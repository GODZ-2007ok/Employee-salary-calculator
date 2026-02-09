package DSA;
import java.util.Scanner;
 class BubbleSort1 <T extends Comparable<T>>{

	T[] arr;
	
	public BubbleSort1(T [] arr)
	{
		this.arr = arr;
	}
	
	public void sort()
	{
		int flag;
		for(int i=0;i<arr.length - 1;i++)
		{
			flag =0;
			for(int j=0;j<arr.length - i - 1;j++)
			{
				if(arr[j].compareTo(arr[j+1]) > 0)
				{
					T temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp; 
					
					flag =1;
				}
			}
			if (flag==0)
			{
				break;
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
 public class BubbleSortOptimised
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
		 BubbleSort1 <Integer> bs = new BubbleSort1<>(arr);
		 
		 bs.sort();
		 bs.display();
	 }
 }
