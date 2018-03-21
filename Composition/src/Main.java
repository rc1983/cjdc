import java.util.Scanner;

public class Main
{

	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);

		int choice;
		
		System.out.println("Enter the option: ");
		System.out.println("1. Build your PC");
		System.out.println("2. Pre-built PC");
		choice = input.nextInt();
		
		switch(choice)
		{
			case 1: 
				BuildYourPC.buildYourPC();
				break;
			case 2: 
				PreBuiltPC.preBuiltPC();
				break;
			default:
				System.out.println("Invalid option.");
				break;
		}
		
		input.close();
	}
}