
public class Vehicle
{
	private String _name;
	private int _wheels;
	private double _topSpeed;
	private double _price;
	private String _color;
	private int _year;
	private double _fuelEfficiency;
	
	public Vehicle()
	{
		super();
	}
	
	public Vehicle(String name, int wheels, double topSpeed, double price, String color, int year, double fuelEfficiency)
	{
		super();
		this._name = name;
		this._wheels = wheels;
		this._topSpeed = topSpeed;
		this._price = price;
		this._color = color;
		this._year = year;
		this._fuelEfficiency = fuelEfficiency;
	}

//	All the getters
	public String getName()
	{
		return _name;
	}
	public int getWheels()
	{
		return _wheels;
	}
	public double getTopSpeed()
	{
		return _topSpeed;
	}
	public double getPrice()
	{
		return _price;
	}
	public String getColor()
	{
		return _color;
	}
	public int getYear()
	{
		return _year;
	}
	public double getFuelEfficiency()
	{
		return _fuelEfficiency;
	}
	
//	All the setters
	public void setName(String name)
	{
		this._name = name;
	}
	public void setWheels(int wheels)
	{
		this._wheels = wheels;
	}
	public void setTopSpeed(double d)
	{
		this._topSpeed = d;
	}
	public void setPrice(double price)
	{
		this._price = price;
	}
	public void setColor(String color)
	{
		this._color = color;
	}
	public void setYear(int year)
	{
		this._year = year;
	}
	public void setFuelEfficiency(double fuelEfficiency)
	{
		this._fuelEfficiency = fuelEfficiency;
	}
}