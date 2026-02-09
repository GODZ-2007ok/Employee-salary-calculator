package DSA;

 class genericType <T>{

	T value;  //generic data member
	
	public void setData(T val) //val type is T
	{
		this.value = val;
	}
	
	public T getData() //T is return type of any type
	{
		return this.value;
	}
	
}

 public  class generic   // executable so it should be public/ same class name as the file name saved
{
	public static void main (String [] arg)
	{
		
		genericType <Integer> intobj = new genericType<>(); 
		intobj.setData(100);
		System.out.println(intobj.getData());
		
		genericType <Double> dobj = new genericType<>();
		dobj.setData(123.212);
		System.out.println(dobj.getData());
		
		genericType <String> strobj = new genericType <>();
		strobj.setData("wassup");
		System.out.println(strobj.getData());
		
	}
}
