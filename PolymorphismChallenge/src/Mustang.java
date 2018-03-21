
public class Mustang extends Car
{

	public Mustang()
	{
		super("Mustang", 6);
	}
	
	@Override
	public void accelerate()
	{
		System.out.println("Accelerate " + getName());
	}

	@Override
	public void startEngine()
	{
		System.out.println("Start " + getName());
	}
	
	public void vehicleDetails()
	{
		System.out.println("Cylinders: " + getCylinders());
		System.out.println("Name: " + getName());
		System.out.println("Wheels: " + getWheels());
	}
}
