
public class Motherboard
{
	private String _model;
	private String _manufacturer;
	private int _ramSlots;
	private int _gpuSlots;
	private boolean _supportsSLI;
	private String _socketType;
	
	public Motherboard()
	{
		
	}
	
	public Motherboard(String model, String manufacturer, int ramSlots, int gpuSlots, boolean supportsSLI, String socketType)
	{
		super();
		this._model = model;
		this._manufacturer = manufacturer;
		this._ramSlots = ramSlots;
		this._gpuSlots = gpuSlots;
		this._supportsSLI = supportsSLI;
		this._socketType = socketType;
	}
	
//	Public methods
	public void loadProgram(String programName)
	{
		System.out.println("Program name is: " + programName);
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

	public int getRamSlots()
	{
		return _ramSlots;
	}
	
	public int getGpuSlots()
	{
		return _gpuSlots;
	}
	
	public boolean getSupportsSLI()
	{
		return _supportsSLI;
	}
	
	public String getSocketType()
	{
		return _socketType;
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
	
	public void setRamSlots(int ramSlots)
	{
		this._ramSlots = ramSlots;
	}

	public void setGpuSlots(int gpuSlots)
	{
		this._gpuSlots = gpuSlots;
	}
	
	public void setSupportsSLI(boolean supportsSLI)
	{
		this._supportsSLI = supportsSLI;
	}

	public void setSocketType(String socketType)
	{
		this._socketType = socketType;
	}
}