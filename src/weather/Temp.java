package weather;

import java.util.Scanner;

public class Temp {

	public static void TempHot()
	{
		System.out.println("Kinda hot dude the weather");
		System.out.println("Use an AC");
	}
	public static void TempCool()
	{
		System.out.println("Kinda cool man ngl");
		System.out.println("Use a Warm cloth dude");
	}
	
	public static void main (String [] arg)
	{
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter the temp");
		int temp = sc.nextInt();
		
		if (temp > 20)
		{
			Temp.TempHot();
			
		}
		else if (temp < 20)
		{
			Temp.TempCool();
		}
				
	}
}	


