package Pattern;

import java.util.Scanner;

public class leftAlignRev {
	public static void main (String [] arg)
	{
		Scanner sc = new Scanner (System.in);
		System.out.print("Enter n: ");
		int n = sc.nextInt();
		int i,j;
		
		for(i=n;i>=1;i--)
		{
			for(j=n;j>=i;j--)
			{
				System.out.print(j+" ");
			}
			System.out.println();
		}
}
}
