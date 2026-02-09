package twoDArray;
import java.util.Scanner;
public class SumAvg {

	public static void main (String [] arg)
	{
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter row size: ");
		int r = sc.nextInt();
		System.out.println("Enter column size: ");
		int c = sc.nextInt();
		int a[][] = new int [r][c];
		int sum = 0;
		for(int i=0;i<r;i++)
		{
			for(int j=0;j<c;j++)
			{
				System.out.println("Enter ["+i+"]["+j+"]"+ "element :");
				 a[i][j] = sc.nextInt();
				 sum = sum + a[i][j];
					

			}
		}
		int avg = sum/a.length;
		System.out.println(sum);
		System.out.println(avg);
		
	}
}
