
public class Main
{

	public static void main(String[] args)
	{
		Car car1 = new Civic();
		Car car2 = new Neon();
		Car car3 = new Mustang();
		
		System.out.println("Name: " + car1.getName());
		car1.pushBreak();
		car1.accelerate();
		
		System.out.println("\nName: " + car2.getName());
		car2.pushBreak();
		car2.accelerate();
		
		System.out.println("\nName: " + car3.getName());
		car3.pushBreak();
		car3.accelerate();
	}

}
