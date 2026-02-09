package Interface;

public class car implements vehicle {

	@Override
	public void start()
	{
		System.out.println("car started");
	}
	@Override
	public void drive()
	{
		System.out.println("car is moving");
	}
}
