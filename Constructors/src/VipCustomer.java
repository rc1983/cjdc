
public class VipCustomer
{
	private String _name;
	private double _creditLimit;
	private String _email;
	
	public VipCustomer()
	{
		this("Patch", 10000, "patch1@patch.com");
		System.out.println("Default constructor");
	}
	
	public VipCustomer(String name, double creditLimit)
	{
		this(name, creditLimit, "patch2@patch.com");
	}
	
	public VipCustomer(String name, double creditLimit, String email)
	{
		this._name = name;
		this._creditLimit = creditLimit;
		this._email = email;
	}
	
//	Getters are auto generated through eclipse. Source -> Generate Getters and Setters
//	We are not creating setters because for this exercise we are setting all the values through the main method
	public String get_name()
	{
		return _name;
	}

	public double get_creditLimit()
	{
		return _creditLimit;
	}

	public String get_email()
	{
		return _email;
	}
}
