
public class Main
{

	public static void main(String[] args)
	{
		Furniture furniture = new Furniture(1, 1, 3);
		Dimensions dimensions = new Dimensions(10, 10, 10);
		
		Room room = new Room("Computer room", "Off white", 1, furniture, dimensions);
		
		room.addFurniture();
		room.changeDimensions(dimensions);
	}
}
