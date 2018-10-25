/**Created by Kelvin Mundi on 3/07/2017.
 * Filename:   Animal.java
 * Purpose:   To provide a base class for animal
 */

public abstract class Animal
{
	public String type;

	public Animal(){}

	public Animal(String type)
	{
		type = this.type;
	}

	public String getType(){
		return type;
	}

	public void describe(){}
	public void sound(){}
	public void sleep(){}
	public void move(){}

}