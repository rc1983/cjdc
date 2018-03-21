public class MainPrinter
{

	public static void main(String[] args)
	{
		Printer printer = new Printer(100, true);
		
		int pagesPrinted = printer.printPage(51);
		System.out.println("Number of pages printed: " + pagesPrinted);
		System.out.println("Total Number of pages printed: " + printer.getNumberOfPagesPrinted());
		pagesPrinted = printer.printPage(2);
		System.out.println("Number of pages printed: " + pagesPrinted);
		System.out.println("Total Number of pages printed: " + printer.getNumberOfPagesPrinted());
		pagesPrinted = printer.printPage(3);
		System.out.println("Number of pages printed: " + pagesPrinted);
		System.out.println("Total Number of pages printed: " + printer.getNumberOfPagesPrinted());
	}

}
