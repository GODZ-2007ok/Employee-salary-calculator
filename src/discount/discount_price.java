package discount;

import java.util.Scanner;

public class discount_price {

	public static void main (String[] arg)
	{
		Scanner inpObj = new Scanner(System.in);
		System.out.print("Enter the amount: ");
		int Amount = inpObj.nextInt();
		if (Amount > 5000)
		{
			int disc = ((15 * Amount )/100);
			System.out.print("The amount you have to pay is " + disc);
		}
		else 
		{
			System.out.print("no discount");
		}
			
	}
}
