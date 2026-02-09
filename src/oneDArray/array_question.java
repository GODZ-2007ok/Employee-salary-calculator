package oneDArray;

import java.util.Scanner;

public class array_question {

	public static void main(String[] args) {
		Scanner inpObj = new Scanner(System.in);
		int n,i,j;
		System.out.print("Enter array size");
		n = inpObj.nextInt();
		
		int arr[] = new int[6];
		
		for(i=0;i<n;i++)
		{
			System.out.println("Enter arr[" + i +"] element");
			   arr[i] = inpObj.nextInt();
			  }
			  System.out.println("Array elemnts are: ");
			  
			  for(i=0;i<arr.length;i++)
			  {
			   System.out.print("arr[" + i+ "] = "+ arr[i] +"\t");
			  }
		}
	}


