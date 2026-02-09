package Hackathon;
import java.util.Scanner;
public class hotelRoom
{
	public static void main(String [] arg)
	{
		Scanner sc = new Scanner (System.in);
	System.out.println("\n--------------welcome to hyderabadi hotel----------------");
	
	int room[] = new int [5];
	System.out.println("Enter 1 to book");
	System.out.println("enter 2 to exit");
	int choice = sc.nextInt();
	
	boolean left = false;
	int count =0;
	
	if (choice == 1)
	{
		System.out.println("click 1 to  confirm");
	System.out.println("click 2 to deny");
	
	
	
	for(int i=0;i<5;i++)
	{
		System.out.println("person "+ (i+1));
		room[i] = sc.nextInt();
		if(room[i] == 1)
		{
			 
			System.out.println("Room "+(i+1)+" booked  succesfully");
			System.out.println();
			
		}
		else
		{
			System.out.println("room not booked");
			System.out.println();
		}
		if(room[i]==2)
		{
			count++;
			left = true;
		}
		
	
}
		}
	else 
	{
		System.out.println("Thank you for visiting");
	}
	
	
	if(left)
	{
		System.out.println("number of left room is "+count);
	}
	else
	{
		System.out.println("Sorry no room left");
	}
	
}
}