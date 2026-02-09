package Methods;

import java.util.Scanner;

public class Array2DMethArithmetic 
{
	public static void main (String [] arg)
	{
		Scanner sc = new Scanner(System.in);
		int[][] a = read(sc);
		int[][] b = read(sc);	
		 	 	
		
		
	}
		public static int[][] read(Scanner sc)
		{
			System.out.print("Enter no of rows: ");
			int r = sc.nextInt();
			System.out.print("Enter no of column: ");
			int c = sc.nextInt();
			int arr [][] = new int [r][c];
			for(int i=0;i<arr.length;i++)
			{
				for(int j=0;j<arr[0].length;j++)
				{
					System.out.print("Enter ["+i+"]"+"[");
				}
			}
			
			
		}
	}

	

	
	
	
	
	



