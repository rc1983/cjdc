
public class Room
{
	private String _name;
	private String _color;
	private int _windows;
	private Furniture _furniture;
	private Dimensions _dimensions;
	
	public Room(String _name, String _color, int _windows, Furniture furniture, Dimensions dimensions)
	{
		super();
		this._name = _name;
		this._color = _color;
		this._windows = _windows;
		this._furniture = furniture;
		this._dimensions = dimensions;
	}
	
//	Public methods
	public Dimensions changeDimensions(Dimensions dimensions)
	{
		_dimensions.changeDimensions(dimensions);
		return this._dimensions;
	}
	
	public void addFurniture()
	{
		System.out.println("Room -> Adding furniture.");
		_furniture.addFurniture();
	}
	
	
//	All getters
	public String getName()
	{
		return _name;
	}

	public String getColor()
	{
		return _color;
	}

	public int getWindows()
	{
		return _windows;
	}

	public Furniture getFurniture()
	{
		return _furniture;
	}

	public Dimensions getDimensions()
	{
		return _dimensions;
	}

//	All setters
	public void setName(String name)
	{
		this._name = name;
	}

	public void setColor(String color)
	{
		this._color = color;
	}

	public void setWindows(int windows)
	{
		this._windows = windows;
	}

	public void setFurniture(Furniture furniture)
	{
		this._furniture = furniture;
	}

	public void setDimensions(Dimensions dimensions)
	{
		this._dimensions = dimensions;
	}
}
