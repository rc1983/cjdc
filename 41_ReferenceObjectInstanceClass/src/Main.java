
public class Main
{

	public static void main(String[] args)
	{
		
		House blueHouse = new House("blue");
		House anotherHouse = blueHouse;
		
		System.out.println("blueHouse color: " + blueHouse.getColor());
		System.out.println("anotherHouse color: " + anotherHouse.getColor());
		System.out.println();
		
		anotherHouse.setColor("red");
		System.out.println("blueHouse color: " + blueHouse.getColor());
		System.out.println("anotherHouse color: " + anotherHouse.getColor());
		
		House greenHouse = new House("green");
		anotherHouse = greenHouse;
		
		System.out.println();
		System.out.println("blueHouse color: " + blueHouse.getColor());
		System.out.println("anotherHouse color: " + anotherHouse.getColor());
		System.out.println("greenHouse color: " + greenHouse.getColor());

	}

}
