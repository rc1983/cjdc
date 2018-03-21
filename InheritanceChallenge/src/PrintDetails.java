public class PrintDetails 
{
	public static void printVehicleDetails(Vehicle v)
	{
//		Print details of base class
		System.out.println("Name of the vehicle: " + v.getName());
		System.out.println("Number of wheels: " + v.getWheels());
		System.out.println("Top speed: " + v.getTopSpeed());
		System.out.println("Price of the vehicle: " + v.getPrice());
		System.out.println("Color of the vehicle: " + v.getColor());
		System.out.println("Year: " + v.getYear());
		System.out.println("Fuel efficiency of the vehicle: " + v.getFuelEfficiency());
		
//		Print details of the car
		if (v instanceof Car)
		{
			printDetailsOfCar((Car) v);
		}
		
//		Print details of FordMustang
		if (v instanceof Mustang)
		{
			printDetailsOfCar((Car) v);
			printDetailsOfFordMustang((Mustang) v);
		}
	}
	
	private static void printDetailsOfCar (Car c)
	{
		System.out.println("Number of doors: " + c.getDoors());
		System.out.println("Power steering: " + c.getPowerSteering());
		System.out.println("Convertible: " + c.getIsConvertible());
		System.out.println("Transmission type: " + c.getTransmissionType());
	}
	
	private static void printDetailsOfFordMustang(Mustang fm)
	{
		System.out.println("GT version: " + fm.getGTVersion());
	}
}
