package formula;

import java.util.Scanner;

public class firstProgram {
	public static void main (String[] arg)
	{
		
		
		Scanner inpObj = new Scanner(System.in);
		System.out.print("Enter the MRP: ");
		float MRP = inpObj.nextFloat();
		System.out.print("Enter discount: ");
		float Discount = inpObj.nextFloat();
		
		float Final = (Discount * MRP)/100;
		float Pay = MRP - Final;
		System.out.println("The final price is " + Pay);
		
		
		
	}

}
