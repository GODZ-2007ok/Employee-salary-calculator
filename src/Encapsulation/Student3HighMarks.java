package Encapsulation;

public class Student3HighMarks {

	private String stuN;
	private int stuId;
	private int mark;
	
	public void setData(String stuN,int stuId,int mark)
	{
		this.stuN = stuN;
		this.stuId = stuId;
		this.mark = mark;
	}
	public void getData()
	{
		System.out.println("Student name is: "+this.stuN);
		System.out.println("Student id is: "+this.stuId);
		System.out.println("Student marks is: "+this.mark);
	}
	public String HighMark(Student3HighMarks std2,Student3HighMarks std3)
	{
		if(this.mark > std2.mark && this.mark > std3.mark)
		{
			return this.stuN + " got highest mark";
		}
		else if(std2.mark > std3.mark)
		{
			return std2.stuN + " got highest mark";
		}
		else
		{
			return std3.stuN + " got highest mark";
		}
	}
}
