package array_min_max;

import java.util.Scanner;

public class min_max {
	
	public static void main(String[] arg)
	{
		
		int[]arr = new int[7];
		
		Scanner inpObj = new Scanner(System.in);
		
		for(int i=0; i<7; i++)
		{
			System.out.println("Enter arr["+i+"] element");
			arr[i] = inpObj.nextInt();
			
		}
	}

}
