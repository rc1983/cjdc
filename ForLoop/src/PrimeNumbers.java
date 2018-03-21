import java.util.Arrays;
import java.util.OptionalInt;
import java.util.Scanner;

/**
 * This is a program will accept a number from the user and returns true if the number is prime, and false otherwise.
 * We will also accept a range of numbers from the user and print out all the prime numbers within the range.
 * 
 * 
 * @author Patch
 *
 */

public class PrimeNumbers
{

	public static void main(String[] args)
	{
//		A scanner variable to accept input from the user.
		Scanner input = new Scanner(System.in);
		
		int min = 0,
			max = 0,
			primeCount = 0;
		
		System.out.println("Enter a number: ");
		int isPrimeNum = input.nextInt();
		
		boolean isPrimeResult = isPrime(isPrimeNum);
		
		if (isPrimeResult)
		{
			System.out.println(isPrimeNum + " is a prime number.");
		}
		
		else
		{
			System.out.println(isPrimeNum + " is not a prime number.");
		}
		
//		For statement to find a range of prime numbers
		System.out.println("Enter a range (5,10)");
		String numberRange = input.next();
		
//		Once we get a string from the user, we will split it and store the individual
//		values in a string array
		String[] numRangeStrArray = numberRange.split(",");
		
//		We will create an int array that is of the same size as the string array to 
//		store the values
		int[] numRangeIntArray = new int[numRangeStrArray.length];
		
//		We only require a min and max range, but if the user enters more than two numbers, 
//		the extra values will be discarded and only the min and max values are used.
		if (numRangeStrArray.length > 2)
		{
			System.out.println("More than two numbers are entered. Only the max and min values from the list of numbers will be used.");
		}
		
//		Store all values in the string array into an int array
		for (int i = 0; i < numRangeStrArray.length; i++)
		{
			numRangeIntArray[i] = Integer.parseInt(numRangeStrArray[i]);
		}
		
//		IF the users enters only one number, we set the min value to 0
		if (numRangeIntArray.length == 1)
		{
			if (numRangeIntArray[0] == 0)
			{
				System.out.println("0 is not a valid input.");
				System.exit(0);
			}
			
			min = 0;
			max = numRangeIntArray[0];
		}
		
		else
		{
//			This is a handy way to get the minimum and maximum values out of an integer array
			max = Arrays.stream(numRangeIntArray).max().getAsInt();
			min = Arrays.stream(numRangeIntArray).min().getAsInt();
		}
		
		
//		We will loop through all the values including and in between the min and max values
//		The prime number count is incremented each time a result is found.
		System.out.println("The following prime number(s) are found: ");
		for (int i = min; i <= max; i++)
		{
			if (isPrime(i))
			{
				System.out.println(i);
				primeCount += 1;
			}
			
//			Use this if you want to break the loop after a set number of tries
//			if (primeNumCount == 3)
//			{
//				break;
//			}
		}
		
		System.out.println("There are " + primeCount + " prime number(s) found.");
		input.close();
		
//		Encountered a jvm bug (according to stackoverflow) when running this program in eclipse
		System.exit(0);
	}
	
	public static boolean isPrime(int n)
	{
		if (n == 1)
		{
			return false;
		}
		
//		for (int i = 2; i <= n/2; i++)
//		This is a more efficient way to find the prime numbers.
		for (int i = 2; i <= (long) Math.sqrt(n); i++)
		{
			if (n % i == 0)
			{
				return false;
			}
		}
		
		return true;
	}
}