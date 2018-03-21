import java.util.Scanner;

public class SetDetails
{
	public static Scanner input = new Scanner(System.in);
	
	public static Vehicle setVehicleDetails() throws Exception
	{
		Vehicle vehicle = new Vehicle();
		
		System.out.println("Enter name of the vehicle: ");
		vehicle.setName(input.next());
		System.out.println("Enter top speed: ");
		vehicle.setTopSpeed(input.nextDouble());
		System.out.println("Enter the price: ");
		vehicle.setPrice(input.nextDouble());
		System.out.println("Enter the color: ");
		vehicle.setColor(input.next());
		System.out.println("Enter the year: ");
		vehicle.setYear(input.nextInt());
		System.out.println("Enter fuel efficiency: ");
		vehicle.setFuelEfficiency(input.nextDouble());
		System.out.println("Enter number of wheels: ");
		vehicle.setWheels(input.nextInt());
		
		return vehicle;		
	}

	public static Car setCarDetails() throws Exception
	{
		Car car = new Car();
		
		String transmissionType;
		
		System.out.println("Enter the name of the car: ");
		car.setName(input.nextLine());
		car.setWheels(Car._wheels);
		System.out.println("Enter top speed: ");
		car.setTopSpeed(input.nextDouble());
		System.out.println("Enter price: ");
		car.setPrice(input.nextDouble());
		System.out.println("Enter color: ");
		car.setColor(input.next());
		System.out.println("Enter Year: ");
		car.setYear(input.nextInt());
		System.out.println("Enter fuel efficiency: ");
		car.setFuelEfficiency(input.nextDouble());
		System.out.println("Enter transmission type: ");
		transmissionType = input.next();
		while (InputValidation.validTransmission(transmissionType) == false)
		{
			System.out.println("Invalid transmission type. Please try again.");
			System.out.println("Enter transmission type: ");
			transmissionType = input.next();
		}
		car.setTransmissionType(transmissionType);
		System.out.println("Enter number of doors: ");
		car.setDoors(input.nextInt());
		
		try
		{
			System.out.println("Does the car have power steering (true/false): ");
			car.setPowerSteering(input.nextBoolean());
			System.out.println("Is this a convertible (true/false): ");
			car.setIsConvertible(input.nextBoolean());
		}
		catch (Exception e)
		{
			System.out.println("Value should be \"true\" or \"false\". Please re-run the program.");
			e.printStackTrace();
			throw new Exception("Program failed!");
		}

		return car;
	}
	
	public static Mustang setMustangDetails() throws Exception
	{
		Mustang mustang = new Mustang();
		
		String transmissionType;
		
		mustang.setName(Mustang._name);
		mustang.setWheels(Car._wheels);
		System.out.println("Enter top speed: ");
		mustang.setTopSpeed(input.nextDouble());
		System.out.println("Enter price: ");
		mustang.setPrice(input.nextDouble());
		System.out.println("Enter color: ");
		mustang.setColor(input.next());
		System.out.println("Enter Year: ");
		mustang.setYear(input.nextInt());
		System.out.println("Enter fuel efficiency: ");
		mustang.setFuelEfficiency(input.nextDouble());
		System.out.println("Enter transmission type: ");
		transmissionType = input.next();
		while (InputValidation.validTransmission(transmissionType) == false)
		{
			System.out.println("Invalid transmission type. Please try again.");
			System.out.println("Enter transmission type: ");
			transmissionType = input.next();
		}
		mustang.setTransmissionType(transmissionType);
		System.out.println("Enter number of doors: ");
		mustang.setDoors(input.nextInt());
		
		try
		{
			System.out.println("Does the vehicle have power steering (true/false): ");
			mustang.setPowerSteering(input.nextBoolean());
			System.out.println("Does the car have power steering (true/false): ");
			mustang.setPowerSteering(input.nextBoolean());
			System.out.println("Is this a convertible (true/false): ");
			mustang.setIsConvertible(input.nextBoolean());
		}
		catch (Exception e)
		{
			System.out.println("Value should be \"true\" or \"false\". Please re-run the program.");
			e.printStackTrace();
			throw new Exception("Program failed!");
		}
		
		System.out.println("Enter GT version: ");
		mustang.setGTVersion(input.next());
		
		return mustang;
	}
}