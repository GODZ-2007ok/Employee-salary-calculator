package Interface;

public class bike implements vehicle {

	@Override
	public void start()
	{
		System.out.println("BIke is starting");
	}
	@Override
	public void drive()
	{
		System.out.println("Bike is moving");
	}
}
