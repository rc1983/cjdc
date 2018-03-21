
public class Fish extends Animal
{
	private int _gills;
	private int _eyes;
	private int _fins;
	
	public Fish(String name, int size, int weight, int gills, int eyes, int fins)
	{
		super(name, 1, 1, size, weight);
		// TODO Auto-generated constructor stub
		this._gills = gills;
		this._eyes = eyes;
		this._fins = fins;
	}
	
	public Fish()
	{
		// TODO Auto-generated constructor stub
	}

	private void rest()
	{
		System.out.println("Fish do not sleep. They rest.");
	}
	
	@Override
	public void sleep(String animalType)
	{
		// TODO Auto-generated method stub
		rest();
	}

	private void moveMuscles()
	{
		System.out.println("Fish.moveMuscles() called.");
	}
	
	private void moveBackFin()
	{
		System.out.println("Fish.moveBackFin() called.");
	}
	
	private void swim(int speed)
	{
		moveMuscles();
		moveBackFin();
		super.move(speed);
	}

	@Override
	public void move(int speed)
	{
		// TODO Auto-generated method stub
		System.out.println("Fish.move() called.");
		swim(speed);
	}

	@Override
	public void eat()
	{
		// TODO Auto-generated method stub
		System.out.println("Fish.eat() called.");
		super.eat();
	}
	
	
	
}
