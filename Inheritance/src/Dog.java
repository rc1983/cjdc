
public class Dog extends Animal
{
	private int _eyes;
	private int _legs;
	private int _tail;
	private int _teeth;
	private String _coat;
	
	public Dog(String name, int size, int weight, int eyes, int legs, int tail, int teeth, String coat)
	{
		super(name, 1, 1, size, weight);
		this._coat = coat;
		this._eyes = eyes;
		this._legs = legs;
		this._tail = tail;
		this._teeth = teeth;
	}
	
	@Override
	public void eat()
	{
		// TODO Auto-generated method stub
		System.out.println("Dog.eat() called.");
		chew();
		super.eat();
	}
	
	@Override
	public void move(int speed)
	{
		System.out.println("Dog.move() called.");
		moveLegs(speed);
		super.move(speed);
	}
	
	private void moveLegs(int speed)
	{
		// TODO Auto-generated method stub
		System.out.println("Dog.moveLegs() called.");
	}

	public void walk()
	{
		System.out.println("Dog.walk() called.");
		move(5);
	}
	
	public void run()
	{
		System.out.println("Dog.run() called.");
		move(10);
	}

	private void chew()
	{
		System.out.println("Dog.chew() called");
	}
	
	public int getEyes()
	{
		return _eyes;
	}

	public void setEyes(int eyes)
	{
		this._eyes = eyes;
	}

	public int getLegs()
	{
		return _legs;
	}

	public void setLegs(int legs)
	{
		this._legs = legs;
	}

	public int getTail()
	{
		return _tail;
	}

	public void setTail(int tail)
	{
		this._tail = tail;
	}

	public int getTeeth()
	{
		return _teeth;
	}

	public void setTeeth(int teeth)
	{
		this._teeth = teeth;
	}

	public String getCoat()
	{
		return _coat;
	}

	public void setCoat(String coat)
	{
		this._coat = coat;
	}
}
