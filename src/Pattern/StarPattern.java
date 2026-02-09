package Pattern;
import java.util.Scanner;
public class StarPattern {

	public static void main (String [] arg)
	{
		Scanner sc = new Scanner (System.in);
		System.out.println("eneter n: ");
		int n = sc.nextInt();
		int i,j;
		for (i=1;i<=n;i++)
		{
			for(j=0;j<n;j++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}
