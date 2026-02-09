package Pattern;
import java.util.Scanner;
public class leftAlign {

	public static void main (String [] arg)
	{
		Scanner sc = new Scanner (System.in);
		System.out.print("Enter n: ");
		int n = sc.nextInt();
		int i,j;
		for( i=1;i<=n;i++)
		{
			for(j=1;j<=i;j++)
			{
				System.out.print( (char)('A'+j-1)+" ");
			}
			System.out.println();
		}
	}
}
