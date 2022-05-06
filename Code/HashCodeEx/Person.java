import java.util.Objects;

public class Person
{
	private String firstName;
	private String lastName;
	private double age;

	public Person(String firstName, String lastName, double age)
	{
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
	}


    public int hashCode()
    {
        int hash = 1;

        hash = hash * 31 + ((firstName == null) ? 0 : firstName.hashCode());
        hash = hash * 31 + ((lastName == null) ? 0 : lastName.hashCode());
        hash = hash * 31 + ((Double)age).hashCode(); // show casting ((Integer)age).hashCode();

        return hash;
    }



    public boolean equals(Object o)
    {
        if (o == null)
            return false;
        if (o.getClass() != this.getClass())
            return false;

        Person p = (Person)o;
        boolean result = true;
        
        if (firstName == null)
            result = p.firstName == null;
        else
            result = firstName.equals(p.firstName);

        if (lastName == null)
            result = result && p.lastName == null;
        else
            result = result && lastName.equals(p.lastName);

        return result && age == p.age;

        
    }



 //Equals shorthand

    public boolean equals(Object o)
    {
        if (o == null)
            return false;
        if (o.getClass() != this.getClass())
            return false;

        boolean result = true;

        Person p = (Person)o;
        return Objects.equals(firstName, p.firstName) && Objects.equals(lastName, p.lastName) && age == p.age;
    }



	// public int hashCode is a method in Object class, which we should override anytime
	//  we override the equals method in a class.
	//  Hash codes are used in HashMap implementation. 
	//  The default equals method and hashCode method in the object class both 
	//   determine equality/calculate hash code from the location of object in memory.
	//   If you override equal to check for equality by instance variables, you also want 
	//   hashcode to be calculated based on the same instance variables.
	
/*
//Example of using static method from Objects class (not to be confused with Object class)
// to override the hashcCode method.  Objects.hash does null checks for you.
    public int hashCode()
    {
        return Objects.hash(firstName, lastName, age);


    }
*/





}
