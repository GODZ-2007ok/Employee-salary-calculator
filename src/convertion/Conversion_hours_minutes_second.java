package convertion;

import java.util.Scanner;

public class Conversion_hours_minutes_second {

	public static void main (String[] arg)
	{
		Scanner inpObj = new Scanner(System.in);
		System.out.print("Enter the seconds: ");
		int second = inpObj.nextInt();
		int hours = second/3600;
		int minutes = ((second%3600)/60);
		int second1 = ((second%3600)%60);
		System.out.println("hours = " + hours );
		System.out.println("minutes = " + minutes);
		System.out.println("Seconds = " + second1);
		
	}
}
