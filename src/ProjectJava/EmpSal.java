package ProjectJava;
import java.util.Scanner;
public class EmpSal {
	public static void main (String [] arg)
	{
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter no of Employees: ");
		int n = sc.nextInt();   // number of employee
		
		System.out.println("Enter hra %: ");
		double hra = sc.nextDouble();
		System.out.println("Enter da %: ");
		double da = sc.nextDouble();
		System.out.println("Enter bonus %: ");
		double bonus = sc.nextDouble();
		
		
		
		double[] sal = new double [n];  // base salary 
		double[] net = new double [n];
		double[] gross = new double [n];
		double [] tax = new double [n];
		
		for(int i=0;i<sal.length;i++)
		{
			System.out.println("Enter salery of ["+(i+1)+"] employee");   // input basic salary of each member
			sal[i] = sc.nextDouble();
		
		double hra1 = (hra/100) * sal[i];
		 double da1 = (da/100) * sal[i];
		double  bonus1 = (bonus/100) * sal[i];
		
		gross[i] = hra1 + da1 + bonus1 + sal[i];
		
		if (gross[i] <= 25000) {
            tax[i] = 0;
        } else if (gross[i] > 25000 && gross[i] <=50000) {
            tax[i] = 0.10 * gross[i];
        } else if (gross[i] > 50000 && gross[i] <= 100000) {
            tax[i] = 0.20 * gross[i];
        } else {
            tax[i] = 0.30 * gross[i];
        }
		
		net[i] = sal[i]+hra1+da1+bonus1-tax[i];
		
		System.out.println("Total money of employee ["+(i+1)+"] is "+net[i]+"\n"+"gross = "+gross[i]+"\n"+"Tax is "+tax[i]);
		System.out.println();
		}
		
	
	}
}
