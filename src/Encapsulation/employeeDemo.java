package Encapsulation;
import java.util.Scanner;
public class employeeDemo {

	public static void main(String [] arg)
	  {
	    Scanner sc = new Scanner (System.in);

	    employee emp1 = new employee();
	    System.out.println("enter employee 1 data");
	    emp1.setData(234254, "lol", 7);
	    System.out.println("The employee 1 details are");
	    emp1.getData();
	    
	    employee emp2 = new employee();
	    System.out.println("\nEnter employee 2 data:");

	    System.out.print("Enter employee id: ");
	    int id = sc.nextInt();

	    System.out.print("Enter employee name: ");
	    String name = sc.next();

	    System.out.print("Enter employee rating: ");
	    int rating = sc.nextInt();

	    emp2.setData(id, name, rating);  // <-- Correct way
	    System.out.println();
	    System.out.println("The employee 2 details are:");
	    
	    emp2.getData();
	  }
	}

