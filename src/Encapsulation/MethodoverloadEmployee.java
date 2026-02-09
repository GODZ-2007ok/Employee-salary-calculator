package Encapsulation;

public class MethodoverloadEmployee {

	public double sal(int hours,double hoursRate)
	{
		double sol=hours*hoursRate;
		return sol;
	}
	public double sal(double monthlySal)
	{
		return monthlySal;
	}
	public double sal(int project,double projectRate, int time)
	{
		double sol = project*projectRate*time;
		return sol;
	}
}
