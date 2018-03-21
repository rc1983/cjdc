
public class PrintPCDetails
{
	public static void printPCDetails(PC pc)
	{
		Monitor monitor = pc.getMonitor();
		Tower tower = pc.getTower();
		Motherboard mb = pc.getMotherboard();
		
		printMotherboardDetails(mb);
		printMonitorDetails(monitor);
		printTowerDetails(tower);
	}
	
	private static void printMotherboardDetails(Motherboard mb)
	{
		System.out.println("Motherboard model: " + mb.getModel());
		System.out.println("Motherboard manufacturer: " + mb.getManufacturer());
		System.out.println("Number of RAM slots: " + mb.getRamSlots());
		System.out.print("Does the motherboard support SLI: ");
		if (mb.getSupportsSLI())
		{
			System.out.println("Yes.");
		}
		else
		{
			System.out.println("No.");
		}
		System.out.println("BIOS version: " + mb.getSocketType());
	}
	
	private static void printMonitorDetails(Monitor monitor)
	{
		System.out.println("Monitor model: " + monitor.getModel());
		System.out.println("Monitor manufacturer: " + monitor.getManufacturer());
		System.out.println("Screen size: " + monitor.getSize());
		System.out.println("Resolution width: " + monitor.getResolution().getWidth());
		System.out.println("Resolution height: " + monitor.getResolution().getHeight());
	}
	
	private static void printTowerDetails(Tower tower)
	{
		System.out.println("Tower model: " + tower.getModel());
		System.out.println("Tower manufacturer: " + tower.getManufacturer());
		System.out.println("Form factor: " + tower.getFormFactor());
		System.out.println("Style: " + tower.getStyle());
		System.out.println("Case width: " + tower.getDimensions().getWidth() + ", case height: " + tower.getDimensions().getHeight() + ", case depth: " + tower.getDimensions().getDepth());
	}
	
}