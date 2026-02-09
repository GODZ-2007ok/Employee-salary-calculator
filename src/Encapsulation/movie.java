package Encapsulation;

public class movie {

	private String mN;
	private int mId;
	private String mLang;
	private int rating;
	
	public void setData(String mN,int mId,String mLang,int rating)
	{
		this.mN=mN;
		this.mId=mId;
		this.mLang=mLang;
		this.rating=rating;
				
	}
	public void getData()
	{
		System.out.println("Movie name is: "+ this.mN);
		System.out.println("Movie id is: "+this.mId);
		System.out.println("Movie language is: "+this.mLang);
		System.out.println("Movie rating is: "+this.rating);
		
	}
	public void Rating()
	{
		if(this.rating >7)
		{
			System.out.println(this.mN+" is best movie");
		}
		else if(this.rating >=4 && this.rating <=7)
		{
			System.out.println(this.mN+" is good movie");
		}
		else if(this.rating>=1 && this.rating<=4)
		{
			System.out.println(this.mN+" is mid movie");
		}
	}
	
}
