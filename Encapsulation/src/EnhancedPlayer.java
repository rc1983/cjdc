
public class EnhancedPlayer
{
	private String _name;
	private int _health = 100;
	private String _weapon;
	
	public EnhancedPlayer(String name, int health, String weapon)
	{
		super();
		this._name = name;
		if (health > 0 && health <= 100)
		{
			this._health = health; 
		}
		
//		This is not strictly needed because we are already initializing the member variable
		else if (health > 100)
		{
			this._health = 100;
		}
		
		this._weapon = weapon;
	}
	
	public void loseHealth(int damage)
	{
		this._health = this._health - damage;
		if(this._health <= 0)
		{
			System.out.println("Player knocked out.");
		}
	}

	public String getName()
	{
		return _name;
	}

	public int getHealth()
	{
		return _health;
	}

	public String getWeapon()
	{
		return _weapon;
	}

	public void setName(String name)
	{
		this._name = name;
	}

	public void setHealth(int health)
	{
		this._health = health;
	}

	public void setWeapon(String weapon)
	{
		this._weapon = weapon;
	}	
}