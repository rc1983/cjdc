
public class While
{

	public static void main(String[] args)
	{
		int count = 0;
		
//		while (count != 5)
//		{
//			System.out.println("Count = " + count);
//			count++;
//		}
//		
//		for (int i = 1; i < 7; i++)
//		{
//			System.out.println("Count = " + i);
//		}
		
		do
		{
			System.out.println("Count value was: " + count);
			count++;
		}
		while(count != 6 && count < 99);
		
		boolean result = isEven(9);
		System.out.println(result);
	}
	
	public static boolean isEven(int n)
	{
		if (n % 2 == 0)
		{
			return true;
		}
		
		return false;
	}
}
