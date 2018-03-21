import java.util.Scanner;

public class FloatAndDouble
{

	public static void main(String[] args)
	{
		int myIntValue = 5/3;
		float myFloatValue = 5/3f;
		double myDoubleValue = 5/3d;
		
		Scanner input = new Scanner(System.in);
		double kilo = 0;
		
		System.out.println("Int - " + myIntValue);
		System.out.println("Float - " + myFloatValue);
		System.out.println("Double - " + myDoubleValue);
		
		System.out.println("Enter the number of pounds: ");
		kilo = input.nextDouble();
		
		kilo = kilo * 0.4539237;
		
		System.out.println("Number of kilos: " + kilo);
		
		input.close();
		
	}

}
