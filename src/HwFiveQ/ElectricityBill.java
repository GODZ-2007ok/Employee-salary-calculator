package HwFiveQ;

import java.util.Scanner;

public class ElectricityBill {

	public static void main (String [] arg)
	{
		Scanner sc = new Scanner (System.in);
		System.out.println("FOR 30 Days bill");
		System.out.println("Enter rupee per unit: ");
		int rs = sc.nextInt();
		
		int a[] = new int [30];
		for(int i=0;i<a.length;i++)
		{
			System.out.println("enter electricity unit of ["+(i+1)+"] days");
			 a[i] =  sc.nextInt();
		}
		int sum=0;
		for(int i=0;i<a.length;i++)
		{
			sum=sum+i;
		}
		System.out.println("Total consumption = "+sum);
		int avg = sum/30;
		System.out.println("Average consumption: "+avg);
		int amt = sum * rs;
		
		System.out.println("Your total bill is "+ amt);
		

	}
}

