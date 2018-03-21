import java.util.Scanner;

/**
 * This small program shows an example of calculating the sum of all the
 * elements of an int or double array
 * 
 * @author Patch Rowcester
 *
 */

public class ArrayTotal
{

	public static void main(String[] args)
	{
		double[] prices = new double[5];
		Scanner in = new Scanner(System.in);
		
		for (int i = 0; i < prices.length; i++)
		{
			System.out.println("Enter value for price " + i + ": ");
			prices[i] = in.nextDouble();
		}
		
		double total = 0.0;
		
		for (int i = 0; i < prices.length; i++)
		{
			total += prices[i]; 
		}
		
		System.out.println("Total = " + total);
		in.close();
	}

}
