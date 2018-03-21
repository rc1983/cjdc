
public class Printer
{
//	Toner level in terms of percentage
	private double _tonerLevel = 100; 
	private int _numberOfPagesPrinted = 0;
	private boolean _duplexCapable;
	
	public Printer()
	{
		super();
	}
	
	public Printer(double tonerLevel, boolean duplexCapable)
	{
		super();
		
		if (tonerLevel > 0 && tonerLevel <= 100)
		{
			this._tonerLevel = tonerLevel;
		}
		
		this._numberOfPagesPrinted = 0;
		this._duplexCapable = duplexCapable;
	}

	public double getTonerLevel()
	{
		return _tonerLevel;
	}

	public int getNumberOfPagesPrinted()
	{
		return _numberOfPagesPrinted;
	}

	public boolean isDuplexCapable()
	{
		return _duplexCapable;
	}

	public void setTonerLevel(double tonerLevel)
	{
		if(tonerLevel > 0 && tonerLevel <= 100)
		{
			this._tonerLevel = tonerLevel;
		}
		
	}

//	public void setNumberOfPagesPrinted(int numberOfPagesPrinted)
//	{
//		this._numberOfPagesPrinted = numberOfPagesPrinted;
//	}

	public void setIsDuplexCapable(boolean duplexCapable)
	{
		this._duplexCapable = duplexCapable;
	}
	
	public void fillToner(double percentageFill)
	{
		double currentTonerLevel = this._tonerLevel + percentageFill; 
		if(currentTonerLevel > 100)
		{
			this._tonerLevel = 100;
		}
		else
		{
			this._tonerLevel = currentTonerLevel;
		}
	}
	
//	If the printer is duplex capable, then the number of pages to print 
//	will be half of what is needed if number of pages is even, else it will
//	be half of the number of pages plus 1
	public int printPage(int pagesToPrint)
	{
		int pagesPrinted = 0;
		if (_duplexCapable == false)
		{
			pagesPrinted = pagesToPrint;
			this._numberOfPagesPrinted += pagesPrinted;
		}
		else
		{
			pagesPrinted = roundUp(pagesToPrint, 2);
			this._numberOfPagesPrinted += pagesPrinted;
		}
		
		return pagesPrinted;
	}
	
	public int roundUp(int number, int divideBy)
	{
		int roundUpNumber = 0;
		
		if (number % divideBy== 0)
		{
			roundUpNumber = number / divideBy;  
		}
		else
		{
			roundUpNumber = number/divideBy + 1;
		}

		return roundUpNumber;
	}
}