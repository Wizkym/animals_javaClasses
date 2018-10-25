import java.util.ArrayList;

/**Created by Kelvin Mundi on 3/07/2017.
 * Filename:   LoopTest.java
 * Purpose:   To provide a test class for various subclasses
 */
public class LoopTest
{
    public static void main(String[] args)
    {
        Cat cat = new Cat("Kitty", "Angora");
        Robin bird = new Robin("Rockin");
        Dog dog = new Dog("Max", "Pug");
        Fish fish = new Fish("Goldie", "Goldfish");

        // Using an Array
        /*Animal[] animals = new Animal[4];
        animals[0] = cat;
        animals[1] = bird;
        animals[2] = dog;
        animals[3] = fish;

        for(Animal obj : animals){
            obj.describe();
            obj.sound();
            obj.sleep();
            obj.move();
            System.out.println("\n");*/

        // Using an ArrayList
        ArrayList<Animal> animals = new ArrayList<Animal>();
        animals.add(cat);
        animals.add(bird);
        animals.add(dog);
        animals.add(fish);

        for (int x = 0; x < animals.size(); x++){
            animals.get(x).describe();
            animals.get(x).sound();
            animals.get(x).sleep();
            animals.get(x).move();
            System.out.println();
        }// end of loop
    }
}
