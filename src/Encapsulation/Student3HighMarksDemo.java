package Encapsulation;
import java.util.Scanner;
public class Student3HighMarksDemo {

	public static void main(String [] arg)
	{
		Scanner sc = new Scanner (System.in);
		Student3HighMarks std1 = new Student3HighMarks();
		Student3HighMarks std2 = new Student3HighMarks();
		Student3HighMarks std3 = new Student3HighMarks();
		
		System.out.println("Enter Studnt 1 details: ");
		std1.setData("Laura", 45252, 70);
		std1.getData();
		
		System.out.println();
		
		System.out.println("Enter Studnt 2 details: ");
		std2.setData("John",95684, 86);
		std2.getData();
		
		System.out.println();
		
		System.out.println("Enter Studnt 3 details: ");
		std3.setData("Chris", 84232, 99);
		std3.getData();
		System.out.println();
		System.out.println(std1.HighMark(std2, std3));
	}
}
