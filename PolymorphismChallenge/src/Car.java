public class Car
{
	private boolean _engine;
	private int _cylinders;
	private int _wheels;
	private String _name; 
	
	public Car(String name, int cylinders)
	{
		 this._engine = true;
		 this._cylinders = cylinders;
		 this._name = name;
		 this._wheels = 4;
	}

	public boolean isEngine()
	{
		return _engine;
	}

	public int getCylinders()
	{
		return _cylinders;
	}

	public int getWheels()
	{
		return _wheels;
	}

	public String getName()
	{
		return _name;
	}

//	public void setEngine(boolean engine)
//	{
//		this._engine = engine;
//	}

	public void setCylinders(int cylinders)
	{
		this._cylinders = cylinders;
	}

//	public void setWheels(int wheels)
//	{
//		this._wheels = wheels;
//	}

	public void setName(String name)
	{
		this._name = name;
	}
	
	public void startEngine()
	{
		System.out.println("The engine is started.");
	}
	
	public void accelerate()
	{
		System.out.println("Accelerate the vehicle");
	}
	
	public void pushBreak()
	{
		System.out.println("Stop/slow the vehicle");
	}
}