package if_else;

import java.util.Scanner;

public class weather_classification {

	public static void main (String[] arg)
	{
		Scanner inpObj = new Scanner(System.in);
		System.out.print("Enter the temperature in C°: ");
		float Temp = inpObj.nextFloat();
		if (Temp < 0 )
		{
			System.out.print("It's freezing");
		}
		else if (Temp >= 0 && Temp < 15)
		{
			System.out.print("Cold");
		}
		else if (Temp >= 15 && Temp < 30)
		{
			System.out.print("Warm");
		}
		else if (Temp >= 30)
		{
			System.out.print("Hot");
		}
	}
}
