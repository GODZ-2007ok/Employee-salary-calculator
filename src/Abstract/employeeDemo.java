package Abstract;
import java.util.Scanner;
public class employeeDemo {

	public static void main(String [] arg)
	{
		employee e1;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter employee ID: ");
		int eid = sc.nextInt();
		System.out.println("enter employee Name: ");
		String eN = sc.next();
		System.out.println("enter employee rating: ");
		int R = sc.nextInt();
		 e1 = new employeeRating(eid,eN,R);
		 e1.disp();
		 e1.MaxRating();
	}
}
