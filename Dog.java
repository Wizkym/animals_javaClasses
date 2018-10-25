/**Created by Kelvin Mundi on 3/07/2017.
 * Filename:   Dog.java
 * Purpose:   To provide a concrete class Dog
 */

public class Dog extends Animal {
    private String name;
    protected String breed;


    public Dog()
    {
        super("Dog");
    }

    public Dog(String name, String breed) {
        this.name = name;
        this.breed = breed;
    }

    public void describe()
    {
        System.out.println(name +", a breed of Dog called "+ breed);
    }

    public void sound()
    {
        System.out.println("Woof!");
    }

    public void sleep()
    {
        System.out.println(name + " sleeps with one ear raised!");
    }

    public void move()
    {
        System.out.println("This " +breed+ " loves to play catch!");
    }
}
