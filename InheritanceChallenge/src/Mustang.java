
public class Mustang extends Car
{
	private String _gtVersion;
	final static String _name = "Ford Mustang";
	
	public Mustang()
	{
		super();
	}
	
	public Mustang(double topSpeed, double price, String color, int year, double fuelEfficiency, boolean powerSteering, String transmissionType, int doors, boolean isConvertible, String gtVersion)
	{
		super(_name, topSpeed, price, color, year, fuelEfficiency, powerSteering, transmissionType, doors, isConvertible);
		this._gtVersion = gtVersion;
	}
	
	public String getGTVersion()
	{
		return _gtVersion;
	}
	public static String getMustangName()
	{
		return _name;
	}
	
	public void setGTVersion(String gtVersion)
	{
		this._gtVersion = gtVersion;
	}
}
