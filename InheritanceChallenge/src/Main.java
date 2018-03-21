import java.util.Scanner;

public class Main
{

	public static void main(String[] args) throws Exception
	{
		Scanner input = new Scanner(System.in);
		int choice;
		System.out.println("1. Vehicle (Generic vehicle) ");
		System.out.println("2. Car (Generic car) ");
		System.out.println("3. Ford Mustang ");
		System.out.println("What kind of a vehicle would you like to create: ");
		choice = input.nextInt();
		
		switch (choice)
		{
			case 1:
				Vehicle v = SetDetails.setVehicleDetails();
				PrintDetails.printVehicleDetails(v);
				break;
			case 2:
				Car c = SetDetails.setCarDetails();
				PrintDetails.printVehicleDetails(c);
				break;
			case 3:
				Mustang m = SetDetails.setMustangDetails();
				PrintDetails.printVehicleDetails(m);
				break;
			default:
				System.out.println("Run again.");
		}
	}
}