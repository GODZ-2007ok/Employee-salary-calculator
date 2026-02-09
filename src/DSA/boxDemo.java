package DSA;

 class box<T>{

	T value;
	int size;
	
	public void setData(T val,int size)
	{
		this.value = val;
		this.size = size;	
	}
	public T getValue()
	{
		return this.value;
	}
	public int getsize()
	{
		return this.size;
	}
 }
	
	public class boxDemo
	{
		public static void main(String [] arg)
		{
			box <Integer> b1 = new box<>();
			b1.setData(100, 20);
			System.out.println(b1.getsize() +" "+ b1.getValue());
		}
	}

