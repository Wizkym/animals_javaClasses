/**Created by Kelvin Mundi on 3/07/2017.
 * Filename:   Cat.java
 * Purpose:   To provide a concrete class Cat
 */

public class Cat extends Animal
{
    private String name;
    protected String breed;


    public Cat()
    {
        super("Cat");
    }

    public Cat(String name, String breed) {
        this.name = name;
        this.breed = breed;
    }

    public void describe()
    {
        System.out.println(name +", a breed of Cat called "+ breed);
    }

    public void sound()
    {
        System.out.println("Meow");
    }

    public void sleep()
    {
        System.out.println(name + " is having purrfect dreams!");
    }

    public void move()
    {
        System.out.println("This little " +name+ " moves fast!");
    }
}
