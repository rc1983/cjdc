public class BuildYourPC
{
	public static void buildYourPC()
	{
		System.out.println("Build your own PC");
		PC pc = UserInput.setPCDetails();
		PrintPCDetails.printPCDetails(pc);
	}
}