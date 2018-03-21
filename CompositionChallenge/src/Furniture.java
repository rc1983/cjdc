
public class Furniture
{
	private int _beds;
	private int _chairs;
	private int _tables;
	private int _total;
	
	public Furniture(int beds, int chairs, int tables)
	{
		super();
		this._beds = beds;
		this._chairs = chairs;
		this._tables = tables;
	}
	
//	Public methods
	public void addFurniture()
	{
		System.out.println("Original numbers. Chairs: " + _chairs + ", tables: " + _tables + ", beds: " + _beds);
		System.out.println("Old total = " + getTotal());
		System.out.println("Adding 1 chair, 1 table, 1 bed. ");
		_beds++;
		_chairs++;
		_tables++;
		_total = getTotal();
		
		System.out.println("New total = " + _total);
	}
	
//	All the getters
	public int getBeds()
	{
		return _beds;
	}
	
	public int getChairs()
	{
		return _chairs;
	}
	
	public int getTables()
	{
		return _tables;
	}
	
	private int getTotal()
	{
		_total = _chairs + _tables + _beds;
		return _total;
	}

//	All the setters
	public void setBeds(int beds)
	{
		this._beds = beds;
	}

	public void setChairs(int chairs)
	{
		this._chairs = chairs;
	}

	public void setTables(int tables)
	{
		this._tables = tables;
	}
	
//	public void set_total(int _total)
//	{
//		this._total = _total;
//	}
}
