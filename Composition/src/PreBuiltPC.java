
public class PreBuiltPC
{
	public static void preBuiltPC()
	{
		Dimensions dimensions = new Dimensions(20, 20, 5);
		Tower tower = new Tower("230T", "Corsair", "ATX", "Mid-tower", dimensions);
		Monitor monitor = new Monitor("PG278Q", "Asus", 27, new Resolution(2560,1440));
		Motherboard motherboard = new Motherboard("Gaming", "MSI", 4, 1, false, "LGA 1150");
		PC pc = new PC(motherboard , tower, monitor);
		PrintPCDetails.printPCDetails(pc);
	}
}