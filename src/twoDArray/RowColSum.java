package twoDArray;
import java.util.Scanner;
public class RowColSum {

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
		System.out.println("row wise sum");
		
		for(int i=0;i<r;i++)
		{
			int rowsum = 0;
			for(int j=0;j<c;j++)
			{
				rowsum = rowsum+a[i][j];
			}
			System.out.println("row sum of "+i+" is "+ rowsum);
		}
		
		
		System.out.println("Column sum");
		for(int j=0;j<c;j++)
		{
			int colsum = 0;

			for(int i=0;i<r;i++)
			{
				colsum += a[i][j];
			}
			System.out.println("Column sum of "+j+" is "+colsum);

		}

}
}
