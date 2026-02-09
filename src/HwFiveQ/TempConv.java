package HwFiveQ;

import java.util.Scanner;

public class TempConv {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Enter 1 to stop, 0 to continue: ");

		int choice = sc.nextInt();

		TempConv.templogic(choice,sc);

		}

		public static void templogic(int choice,Scanner sc) {


		while(choice != 1) {

		System.out.println("Enter temperature in celsisus : ");

		double c = sc.nextDouble();

		double f = ((double)9/5)*c+32;

		System.out.println("The temperature in fahrenheit : "+f);

		System.out.print("Enter 1 to stop : ");

		choice = sc.nextInt();


		if(choice == 1) {

		System.out.println("Stopped");

		break;

		}

		}

		sc.close();

		}


		}

