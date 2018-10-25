/**Created by Kelvin Mundi on 3/07/2017.
 * Filename:   Bird.java
 * Purpose:   To provide an abstract class Bird
 */

public abstract class Bird extends Animal
{
    protected String breed = "Robin";

    public Bird()
    {
        super("Bird");
    }


    public void move()
    {
        System.out.println("This " + breed + " flies up and away!");
    }
}
