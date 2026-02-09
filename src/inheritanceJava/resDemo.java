package inheritanceJava;
import java.util.Scanner;
public class resDemo {

	public static void main(String [] arg)
	{
		Scanner sc = new Scanner (System.in);
		Marks []m = new Marks[3];
		for(int i=0;i<m.length;i++)
		{
			System.out.println("Enter student " + (i+1) +" details");
			System.out.println("enter course code: ");
			int cc = sc.nextInt();
			System.out.println("enter course name: ");
		String cn = sc.next();
		System.out.println("enter alm: ");
		int alm = sc.nextInt();
		System.out.println("Enter project: ");
		int pro = sc.nextInt();
		System.out.println("Enter endsem: ");
		int ensm = sc.nextInt();
			m[i]=new Marks(cc,cn,alm,pro,ensm);  
		}
		for(int i=0;i<m.length;i++)
		{
			m[i].display();
		}
		m[0].topper(m);
	}
}
