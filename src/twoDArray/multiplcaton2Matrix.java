package twoDArray;

import java.util.Scanner;

public class multiplcaton2Matrix {

	public static void main (String [] arg)
	{
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter row size of A Matrix: ");
		int r1 = sc.nextInt();
		System.out.println("Enter column size of A Matrix: ");
		int c1 = sc.nextInt();
		int a[][] = new int [r1][c1];
		for(int i=0;i<r1;i++)
		{
			for(int j=0;j<c1;j++)
			{
				System.out.println("Enter ["+(i+1)+"]["+(j+1)+"]"+ "element :");
				 a[i][j] = sc.nextInt();
			}
	}
		
		System.out.println("Enter row size of B Matrix: ");
		int r2 = sc.nextInt();
		System.out.println("Enter column size of B Matrix: ");
		int c2 = sc.nextInt();
		int b[][] = new int [r2][c2];
		for(int i=0;i<r2;i++)
		{
			for(int j=0;j<c2;j++)
			{
				System.out.println("Enter ["+(i+1)+"]["+(j+1)+"]"+ "element :");
				 b[i][j] = sc.nextInt();
			}
			
		}
		if(c1 != r2)
		{
			System.out.println("Not possible");
		}
		
		int c[][] = new int [r1][c2];
		for(int i=0;i<r1;i++)
		{
			for(int j=0;j<c2;j++)
			{
				c[i][j] = 0;
			
			for(int k=0;k<c1;k++)
			
				c[i][j] += a[i][k] * b[k][j];
			}
		}
		for(int i=0;i<r1;i++)
		{
			for(int j=0;j<c2;j++)
			{
				System.out.println(c[i][j] + " ");
			}
		System.out.println();
	
}
}
}
