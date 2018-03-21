public class BankAccount
{
	private int _accountNumber;
	private double _balance;
	private String _name;
	private String _email;
	private String _phoneNo;
	
	/**
	 * Default constructor
	 */
	public BankAccount()
	{
//		The idea here is to create default values for the fields when the user calls the constructor.
//		It can be easily done by calling the custom constructor from within the default constructor.
		this(666,400,"Default","default address","1000000000");
		System.out.println("Empty constructor");
	}
	
	/**
	 * Custom constructor
	 * 
	 * @param accountNumber
	 * @param balance
	 * @param name
	 * @param email
	 * @param phoneNo
	 */
	public BankAccount(int accountNumber, double balance, String name, String email, String phoneNo)
	{
//		General rule of thumb is to not call the setters in the constructors
		this._accountNumber = accountNumber;
		this._balance = balance;
		this._name = name;
		this._email = email;
		this._phoneNo = phoneNo;
	}
	
	/**
	 * Custom constructor that will call another custom constructor.
	 * This method will accept 3 fields and manually set the other two 
	 * 
	 * @param name
	 * @param email
	 * @param phoneNo
	 */
	public BankAccount(String name, String email, String phoneNo)
	{
		this(999, 100, name, email, phoneNo);
	}

	public void setAccountNnumber(int accountNumber)
	{
		this._accountNumber = accountNumber;
	}
	
	public void setBalance(double balance)
	{
		this._balance = balance;
	}
	
	public void setName(String name)
	{
		this._name = name;
	}
	
	public void setEmail(String email)
	{
		this._email = email;
	}
	
	public void setPhoneNo(String phoneNo)
	{
		if (!InputValidation.validPhoneNumber(phoneNo))
		{
			System.out.println("The input - " + phoneNo + " is not a valid phone number. Please enter a 10 digit number.");
			System.out.println("Assigning a default phone number.");
		}
		else
		{
			this._phoneNo = phoneNo;
		}
	}
	
	public int getAccountNumber()
	{
		return this._accountNumber;
	}
	
	public double getBalance()
	{
		return this._balance;
	}
	
	public String getName()
	{
		return this._name;
	}
	
	public String getEmail()
	{
		return this._email;
	}
	
	public String getPhoneNo()
	{
		return this._phoneNo;
	}
	
	public void deposit(double depositAmount)
	{
		this._balance = _balance + depositAmount;
		System.out.println("Deposit successful. Balance is: " + this._balance);
	}
	
	public void withdraw(double withdrawAmount)
	{
		if (withdrawAmount > this._balance)
		{
			System.out.println("The withdraw amount exceeds the balance.");
		}
		else
		{
			this._balance = _balance - withdrawAmount;
			System.out.println("Withdraw successful. Balance is: " + this._balance);
		}
	}
}
