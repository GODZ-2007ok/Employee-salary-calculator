package Encapsulation;
import java.util.Scanner;
public class employee {
private int empId;
private String empName;
private int rating;

public void setData(int emid,String emN,int rat)
{
	this.empId = emid;
	this.empName = emN;
	this.rating = rat;
}
public void getData()
{
	System.out.println("Employee name is "+ this.empName);
	System.out.println("Employee id id is "+this.empId);
	System.out.println("Employee rating is "+this.rating);
}


}
