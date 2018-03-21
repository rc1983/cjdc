
public class Car
{
	private String _engine;
	private String _color;
	private String _model;
	private int _doors;
	private int _wheels;
	
	public void setModel(String model)
	{
		String validModel = model.toLowerCase();
		
		if (validModel.equals("911") || validModel.equals("neon"))
		{
			this._model = model;
		}
		else
		{
			this._model = "Unknown";
		}
	}
	
	public void setEngine(String engine)
	{
		this._engine = engine;
	}
	
	public String getModel()
	{
		return this._model;
	}
}
