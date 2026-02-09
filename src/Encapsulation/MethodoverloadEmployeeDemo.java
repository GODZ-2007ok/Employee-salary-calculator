package Encapsulation;

public class MethodoverloadEmployeeDemo {

	public static void main(String [] arg)
	{
		MethodoverloadEmployee e1 = new MethodoverloadEmployee();
		System.out.println("Employee montly salary: ");
		System.out.println(e1.sal(4651232));
		System.out.println();
		System.out.println("part time employee salary");
		System.out.println(e1.sal(4, 45252));
		System.out.println();
		System.out.println("contract employee salary");
		System.out.println(e1.sal(2, 6541  , 42));



	}
}
