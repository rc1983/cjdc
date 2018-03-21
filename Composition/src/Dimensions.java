public class Dimensions
{
	private double _width;
	private double _height;
	private double _depth;
	
	public Dimensions(double width, double height, double depth)
	{
		super();
		this._width = width;
		this._height = height;
		this._depth = depth;
	}

	public Dimensions()
	{
		// TODO Auto-generated constructor stub
	}

	//	All the getters
	public double getWidth()
	{
		return _width;
	}

	public double getHeight()
	{
		return _height;
	}

	public double getDepth()
	{
		return _depth;
	}

//	All the setters
	public void setWidth(double width)
	{
		this._width = width;
	}

	public void setHeight(double height)
	{
		this._height = height;
	}

	public void setDepth(double depth)
	{
		this._depth = depth;
	}
}