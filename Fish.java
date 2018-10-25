/**Created by Kelvin Mundi on 3/07/2017.
 * Filename:   Fish.java
 * Purpose:   To provide a concrete class Fish
 */

public class Fish extends Animal {
    private String name;
    protected String breed;


    public Fish()
    {
        super("Fish");
    }

    public Fish(String name, String breed) {
        this.name = name;
        this.breed = breed;
    }

    public void describe()
    {
        System.out.println(name +", a breed of Fish called "+ breed);
    }

    public void sound()
    {
        System.out.println("Blub!");
    }

    public void sleep()
    {
        System.out.println(name + " sleeps with her eyes open!");
    }

    public void move()
    {
        System.out.println("This little "+breed+ " swims fast!");
    }
}
