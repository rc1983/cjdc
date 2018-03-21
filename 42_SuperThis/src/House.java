
public class House
{
	private String _color;

	public House(String color)
	{
//		This keyword is not strictly required, but if the instance 
//		variable (_color) and parameter (color) were the same, this keyword is required.
		this._color = color;
	}

	public String getColor()
	{
		return _color;
	}

	public void setColor(String color)
	{
		this._color = color;
	}
}
