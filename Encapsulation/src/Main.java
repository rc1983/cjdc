
public class Main
{

	public static void main(String[] args)
	{
		Player player = new Player();
		player._name = "xyz";
		player._health = 20;
		player._weapon = "sword";
				
		int damage = 10;
		
		player.loseHealth(damage);
		System.out.println("Remaining health = " + player.healthRemaining());
		
		damage = 11;
		player._health = 200;
		player.loseHealth(damage);
		System.out.println("Remaining health = " + player.healthRemaining()); 
		
		EnhancedPlayer ep = new EnhancedPlayer("abc", 101, "pistol");
		
		System.out.println("Name: " + ep.getName());
		System.out.println("Health: " + ep.getHealth());
		
	}

}
