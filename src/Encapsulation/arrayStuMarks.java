package Encapsulation;
import java.util.Scanner;
public class arrayStuMarks {

	private String stdN;
	private int m[] = new int [5];
	
	public void setData()
	{
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter Student name: ");
		this.stdN = sc.next();
		for(int i=0;i<m.length;i++)
		{
			System.out.println("Enter subject "+(i+1)+" marks:");
			m[i] = sc.nextInt();
		}
	}
		public void display()
		{
			System.out.println("student name is: "+this.stdN);
			for(int i=0;i<m.length;i++)
			{
				System.out.println("Marks of subject "+(i+1)+" is: "+this.m[i]);
			}
		}
		public String max()
		{
			int max = this.m[0];
			for(int i=0;i<m.length;i++)
			{
				if (this.m[i] > max)
				{
					max = this.m[i];
				}
			}
			return "maximum marks is: "+max;
		}
		
		public String tot()
		{
			double tot = 0;
			for(int i=0;i<m.length;i++)
			{
				tot += this.m[i];
			}
			return "total marks is: "+tot;
		}
	}

