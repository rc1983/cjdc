
public class Main
{

	public static void main(String[] args)
	{
		Car porsche = new Car();
		Car dodge = new Car();
		
		porsche.setModel("911");
		dodge.setModel("NeOn");
//		porsche.setModel("123");		
		
		System.out.println("Porsche model - " + porsche.getModel());
		System.out.println("Porsche model - " + dodge.getModel());

	}

}
