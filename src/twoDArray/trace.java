package twoDArray;
import java.util.Scanner;
public class trace {
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
		int trace =0;
		if(r==c)
		{
		 
			for(int i=0;i<r;i++)
			{
				trace += a[i][i];
			}
		}
		else
		{
			System.out.println("Not possible");
		}
		System.out.println("trace is: "+trace);
		
	}
}
