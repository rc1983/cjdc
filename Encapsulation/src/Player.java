
public class Player
{
//	It is not practice to make member variables public. This is done
//	to demonstrate good and bad practices.
	public String _name;
	public int _health;
	public String _weapon;
	
	public void loseHealth(int damage)
	{
		this._health = this._health - damage;
		if (this._health <= 0)
		{
			System.out.println("Player KO.");
		}
	}

	public int healthRemaining()
	{
		return this._health;
	}
}
