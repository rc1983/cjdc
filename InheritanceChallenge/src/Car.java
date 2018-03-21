
public class Car extends Vehicle
{
	private boolean _powerSteering;
//	Manual or automatic
	private String _transmissionType;
	private int _doors;
	private boolean _isConvertible;
	final static int _wheels = 4;
	
	public Car()
	{
		super();
	}
	
	public Car(String name, double topSpeed, double price, String color, int year, double fuelEfficiency, boolean powerSteering, String transmissionType, int doors, boolean isConvertible)
	{
		super(name, _wheels, topSpeed, price, color, year, fuelEfficiency);
		this._powerSteering = powerSteering;
		this._transmissionType = transmissionType;
		this._doors = doors;
		this._isConvertible = isConvertible;
	}
	
//	All the getters
	public boolean getPowerSteering()
	{
		return _powerSteering;
	}
	public String getTransmissionType()
	{
		return _transmissionType;
	}
	public int getDoors()
	{
		return _doors;
	}
	public boolean getIsConvertible()
	{
		return _isConvertible;
	}
	public static int getCarWheels()
	{
		return _wheels;
	}
	
//	All the setters
	public void setPowerSteering(boolean powerSteering)
	{
		this._powerSteering = powerSteering;
	}
	public void setTransmissionType(String transmissionType)
	{
		this._transmissionType = transmissionType;
	}
	public void setDoors(int doors)
	{
		this._doors = doors;
	}
	public void setIsConvertible(boolean isConvertible)
	{
		this._isConvertible = isConvertible;
	}
}