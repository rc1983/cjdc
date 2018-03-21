import java.util.Arrays;
import java.util.Scanner;

/**
 * Demonstrate the use of while loop.
 * 
 * We will accept a range of numbers from the user and print out all the even numbers
 * in that range
 * 
 * Create a method that will accept an integer and return true if it is an even number
 * 
 * @author Patch
 *
 */

public class EvenNumber
{

	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		String inputStr = new String();
		
		int numCount = 0;
		
		System.out.println("Enter a range of numbers (5,10): ");
		inputStr = input.nextLine();
		
		int[] inputNum = strToIntArray(inputStr);
		
		System.out.println("Even numbers in range: ");
		while (inputNum[0] <= inputNum[1])
		{
			if (!isEven(inputNum[0]))
			{
				inputNum[0]++;
				continue;
			}
			
			System.out.println(inputNum[0]);
			inputNum[0]++;
			numCount++;
			
//			if (numCount == 5)
//			{
//				break;
//			}
		}
		System.out.println(numCount + " even numbers are found.");
		
		input.close();
	}
	
	public static boolean isEven(int inputNum)
	{
		if (inputNum % 2 == 0)
		{
			return true;
		}
		
		return false;
	}
	
	public static int[] strToIntArray(String strRange)
	{
		int min, max;
		
		String[] strRangeArray = strRange.split(",");
		int[] intRangeArray = new int[strRangeArray.length];
		
		if (intRangeArray.length == 1)
		{
			min = 0;
			max = intRangeArray[0];
		}
		
		else
		{
			if (intRangeArray.length > 2)
			{
				System.out.println("More than two numbers are entered in the range. Only the min and max are considered, and the rest are discarded.");
			}
			for (int i = 0; i < intRangeArray.length; i++)
			{
				intRangeArray[i] = Integer.parseInt(strRangeArray[i]);
			}
			
			min = Arrays.stream(intRangeArray).min().getAsInt();
			max = Arrays.stream(intRangeArray).max().getAsInt();
		}
		
		int[] range = {min,max};
		
		return range;
	}
}
