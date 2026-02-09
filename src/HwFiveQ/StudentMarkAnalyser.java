package HwFiveQ;

import java.util.Scanner;

public class StudentMarkAnalyser {
	public static void main (String [] arg)
	{
		Scanner sc =new Scanner (System.in);
		
		System.out.print("enter the no of students: ");
		int n = sc.nextInt();
		int [] Mark = new int [n];
		
		for (int i=0; i<Mark.length; i++)
		{
			System.out.print("Enter marks of " + i + " Student: ");
			Mark [i] = sc.nextInt();
		}
		int highest = Mark[0];
		int lowest = Mark[0];
		int sum = 0;
		for (int i=0;i<Mark.length;i++)
		{
			sum += Mark[i];
			if (Mark[i] > highest)
			{
				highest = Mark[i];
			}
			else if (Mark[i] < lowest)
			{
				lowest = Mark[i];
			}
		}
		double average = (double) sum/n;
		System.out.println("Highest marks is " + highest);
		System.out.println("Lowest mark is " + lowest);
		System.out.print("Average mark is " + average);
	}
}
