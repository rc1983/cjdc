public class InheritanceMain
{
	public static void main(String[] args)
	{
		Animal a = new Animal("Animal", 1, 1, 5, 5);
		Dog d = new Dog("Yorkie", 8, 20, 2, 4, 1, 20, "long silky");
		Fish f = new Fish("nemo", 1, 1, 10, 2, 2);

		d.eat();
		d.walk();
		d.run();

		f.eat();
		f.move(5);
		f.sleep("fish");
	}
}
