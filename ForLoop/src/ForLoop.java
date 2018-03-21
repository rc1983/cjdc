import java.util.Scanner;

public class ForLoop
{

	public static void main(String[] args)
	{
		
		
		
		System.out.println("10000 at 2% interest: " + calculateInterest(10000, 2));
		System.out.println("10000 at 3% interest: " + calculateInterest(10000, 3));
		System.out.println("10000 at 4% interest: " + calculateInterest(10000, 4));
		System.out.println("10000 at 5% interest: " + calculateInterest(10000, 5));
		
		System.out.println("**************************\n");
		for (int i = 2; i <= 8; i++)
		{
//			System.out.println("10000 at " + i + "% interest: " + calculateInterest(10000, i));
//			This will ensure that there are no more than 2 decimal points
			System.out.println("10000 at " + i + "% interest: " + String.format("%.2f", calculateInterest(10000, i)));
		}
		
//		Start from 8% and work back to 2%
		System.out.println("**************************\n");
		for (int i = 8; i >= 2; i--)
		{
			System.out.println("10000 at " + i + "% interest: " + String.format("%.2f", calculateInterest(10000, i)));
		}
		
		;
		
	}
	
	public static double calculateInterest(double amount, double interestRate)
	{
		return (amount* (interestRate/100));
	}
	
	public static boolean isPrime(int n)
	{
		if (n == 1)
		{
			return false;
		}
		
		for (int i = 2; i < n/2; i++)
		{
			if (n % i == 0)
			{
				return false;
			}
		}
		
		
		return true;
	}

}
