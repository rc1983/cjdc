import java.util.Scanner;

public class UserInput
{
	public static Scanner input = new Scanner(System.in);
	
	public static PC setPCDetails()
	{
		Motherboard motherboard = setMotherboardDetails();
		Monitor monitor = setMonitorDetails();
		Tower tower = setTowerDetails();
		PC pc = new PC(motherboard, tower, monitor);
		
		return pc;
	}
	
	public static Motherboard setMotherboardDetails()
	{
		Motherboard mb = new Motherboard();
		
		System.out.println("Enter the motherboard model: ");
		mb.setModel(input.next());
		System.out.println("Enter the motherboard manufacturer: ");
		mb.setManufacturer(input.next());
		System.out.println("Enter the number of RAM slots: ");
		mb.setRamSlots(input.nextInt());
		System.out.println("Enter the number of GPU slots: ");
		mb.setGpuSlots(input.nextInt());
		System.out.println("Does the motherboard support SLI? (true/false): ");
		mb.setSupportsSLI(input.nextBoolean());
		System.out.println("Enter the socket type: ");
		mb.setSocketType(input.next());
		
		return mb;
	}
	
	public static Monitor setMonitorDetails()
	{
		Monitor monitor = new Monitor();
		Resolution resolution = new Resolution();
		
		System.out.println("Enter the monitor model: ");
		monitor.setModel(input.next());
		System.out.println("Enter the manufacturer: ");
		monitor.setManufacturer(input.next());
		System.out.println("Enter the size: ");
		monitor.setSize(input.nextDouble());
		System.out.println("Enter the resolution width: ");
		resolution.setWidth(input.nextInt());
		System.out.println("Enter the resolution height: ");
		resolution.setHeight(input.nextInt());
		
		monitor.setResolution(resolution);
		
		return monitor;
	}
	
	public static Tower setTowerDetails()
	{
		Tower tower = new Tower();
		Dimensions dimensions = new Dimensions();
		
		System.out.println("Enter case model: ");
		tower.setModel(input.next());
		System.out.println("Enter the manufacturer: ");
		tower.setManufacturer(input.next());
		System.out.println("Enter form factor: ");
		tower.setFormFactor(input.next());
		System.out.println("Enter style: ");
		tower.setStyle(input.next());
		System.out.println("Enter the width of the tower: ");
		dimensions.setWidth(input.nextDouble());
		System.out.println("Enter the height of the tower: ");
		dimensions.setHeight(input.nextDouble());
		System.out.println("Enter the depth of the tower: ");
		dimensions.setDepth(input.nextDouble());
		
		tower.setDimensions(dimensions);
		
		return tower;
	}
}