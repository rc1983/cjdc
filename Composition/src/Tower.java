
public class Tower
{
	private String _model;
	private String _manufacturer;
	private String _formFactor;
	private String _style;
	private Dimensions _dimensions;
	
	public Tower(String _model, String manufacturer, String _formFactor, String _style, Dimensions _dimensions)
	{
		super();
		this._model = _model;
		this._manufacturer = manufacturer;
		this._formFactor = _formFactor;
		this._style = _style;
		this._dimensions = _dimensions;
	}
	
	public Tower()
	{
		// TODO Auto-generated constructor stub
	}

	//	Public methods
	public void pressPowerButton()
	{
		System.out.println("Power button is pressed.");
	}

//	All the getters
	public String getModel()
	{
		return _model;
	}
	
	public String getManufacturer()
	{
		return _manufacturer;
	}

	public String getFormFactor()
	{
		return _formFactor;
	}

	public String getStyle()
	{
		return _style;
	}

	public Dimensions getDimensions()
	{
		return _dimensions;
	}

//	All the setters
	public void setModel(String model)
	{
		this._model = model;
	}
	
	public void setManufacturer(String manufacturer)
	{
		this._manufacturer = manufacturer;
	}

	public void setFormFactor(String formFactor)
	{
		this._formFactor = formFactor;
	}

	public void setStyle(String style)
	{
		this._style = style;
	}

	public void setDimensions(Dimensions dimensions)
	{
		this._dimensions = dimensions;
	}
}