
public class PC
{
	private Motherboard _motherboard;
	private Tower _tower;
	private Monitor _monitor;
	
	public PC(Motherboard motherboard, Tower tower, Monitor monitor)
	{
		super();
		this._motherboard = motherboard;
		this._tower = tower;
		this._monitor = monitor;
	}
	
//	Public methods
		
//	All the getters
	public Motherboard getMotherboard()
	{
		return _motherboard;
	}

	public Tower getTower()
	{
		return _tower;
	}

	public Monitor getMonitor()
	{
		return _monitor;
	}

//	All the setters
	public void setMotherboard(Motherboard motherboard)
	{
		this._motherboard = motherboard;
	}

	public void setTower(Tower Case)
	{
		this._tower = Case;
	}

	public void set_monitor(Monitor _monitor)
	{
		this._monitor = _monitor;
	}
	

	
	
	
}