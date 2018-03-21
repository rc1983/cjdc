public class Resolution
{
	private int _width;
	private int _height;
	
	public Resolution(int width, int height)
	{
		super();
		this._width = width;
		this._height = height;
	}

	public Resolution()
	{
		// TODO Auto-generated constructor stub
	}

	//	All the getters
	public int getWidth()
	{
		return _width;
	}

	public int getHeight()
	{
		return _height;
	}

//	All the setters
	public void setWidth(int width)
	{
		this._width = width;
	}

	public void setHeight(int height)
	{
		this._height = height;
	}
}