/**Created by Kelvin Mundi on 3/07/2017.
 * Filename:   Robin.java
 * Purpose:   To provide a class Robin
 */

public class Robin extends Bird {
    private String name;

    public Robin(String name)
    {
        this.name = name;
    }

    public void describe()
    {
        System.out.println(name +", a breed of Bird called "+ breed);
    }

    public void sound()
    {
        System.out.println("Tweet Tweet!");
    }

    public void sleep()
    {
        System.out.println(name + " the " + breed +" sleeps with one eye open for the cat!");
    }
}
