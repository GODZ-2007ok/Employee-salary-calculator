package loops;
import java.util.Scanner;
public class primeMtoN {

	public static void main(String[] args) {

		Scanner sc = new Scanner (System.in);
		System.out.println("Enter m: ");
		int m = sc.nextInt();
		
		System.out.println("Enter n: ");
		int n = sc.nextInt();
		int count =0;
		boolean isprime = true;
		for(int i=m;i<=n;i++)
		{
			for(int j=2;j<=i;j++)
			{
				if(i%j == 0)
				{
					isprime = false;
					
					
				}
			}
			if(isprime == true)
			{
				System.out.println("Yes prime" );
			}
			else
			{
				System.out.println();
			}
		}
		
	}
		

}

