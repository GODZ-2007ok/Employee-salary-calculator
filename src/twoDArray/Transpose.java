package twoDArray;
import java.util.Scanner;
public class Transpose {

	public static void main (String [] arg)
	{
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter row size: ");
		int r = sc.nextInt();
		System.out.println("Enter column size: ");
		int c = sc.nextInt();
		int a[][] = new int [r][c];
		for(int i=0;i<r;i++)
		{
			for(int j=0;j<c;j++)
			{
				System.out.println("Enter ["+i+"]["+j+"]"+ "element :");
				 a[i][j] = sc.nextInt();
			}
	}
		int t[][] = new int [c][r];
		for(int i=0;i<r;i++)
		{
			for(int j=0;j<c;j++)
			{
				t[j][i] = a[i][j];
			}
		}
		
		for(int i=0;i<c;i++)
		{
			for(int j=0;j<r;j++)
			{
				System.out.print( t[i][j] + " ");
			}
			System.out.println();
	}
}
}
