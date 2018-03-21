
public class Dimensions
{
	private double _length;
	private double _width;
	private double _height;
	
	public Dimensions(double length, double width, double height)
	{
		super();
		this._length = length;
		this._width = width;
		this._height = height;
	}

	
	public Dimensions changeDimensions(Dimensions dimensions)
	{
		System.out.println("Old dimensions, length: " + dimensions.getLength() + ", width: " + dimensions.getWidth() + ", height: " + dimensions.getHeight());
		_length +=5;
		_width +=6;
		_height +=7;
		System.out.println("New dimensions, length: " + dimensions.getLength() + ", width: " + dimensions.getWidth() + ", height: " + dimensions.getHeight());
		return dimensions;
	}

//	All the getters
	private double getLength()
	{
		return _length;
	}
	
	private double getWidth()
	{
		return _width;
	}

	private double getHeight()
	{
		return _height;
	}

//	All the setters
	public void setLength(double length)
	{
		this._length = length;
	}

	public void setWidth(double width)
	{
		this._width = width;
	}
	
	public void setHeight(double height)
	{
		this._height = height;
	}

}
