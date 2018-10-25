public class AbstractTest
{
	public static void main(String[] args)
	{
		Cat cat = new Cat("Kitty", "Angora");
		Robin bird = new Robin("Rockin");

		System.out.println("For the cat: ");
		System.out.print("This is:  "); cat.describe();
		System.out.print("Sound:    "); cat.sound();
		System.out.print("Sleeping: "); cat.sleep();
		System.out.print("Moving:   "); cat.move();
		System.out.println("\n");

		System.out.println("For the robin: ");
		System.out.print("This is:  "); bird.describe();
		System.out.print("Sound:    "); bird.sound();
		System.out.print("Sleeping: "); bird.sleep();
		System.out.print("Moving:	  "); bird.move();
		System.out.println("\n");

		System.out.println("\nEnd of program");
	}
}