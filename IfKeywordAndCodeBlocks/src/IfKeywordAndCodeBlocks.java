
public class IfKeywordAndCodeBlocks
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		boolean gameOver = true;
		int score = 9000;
		int levelCompleted = 5;
		int bonus = 100;
		
		if (score < 5000)
		{
			System.out.println("Score is 5000!");
		}
		else
		{
			int x = 10;
			System.out.println("first else");
			System.out.println("x = " + 10);
		}
		if (score == 5000)
		{
			System.out.println("else if block");
		}
		else
		{
			System.out.println("second else block");
		}
		
		if (gameOver)
		{
			int finalScore = score + (levelCompleted * bonus);
			System.out.println("final score - " + finalScore);
		}
		
		score = 10000;
		levelCompleted = 8;
		bonus = 200;
		if (gameOver)
		{
			int finalScore = score + (levelCompleted * bonus);
			System.out.println("final score - " + finalScore);
		}

	}

}