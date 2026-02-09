package Encapsulation;

public class arrayStuMarkDemo {

	public static void main(String [] arg)
	{
		arrayStuMarks s1 = new arrayStuMarks();
		arrayStuMarks s2 = new arrayStuMarks();
		arrayStuMarks s3 = new arrayStuMarks();
		
		s1.setData();
		s1.display();
		System.out.println(s1.max());
		System.out.println(s1.tot());
		System.out.println();
		s2.setData();
		s2.display();
		System.out.println(s2.max());
		System.out.println(s2.tot());
		System.out.println();
		s3.setData();
		s3.display();
		System.out.println(s3.max());
		System.out.println(s3.tot());
		
		
	}
}
