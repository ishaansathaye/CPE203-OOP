import java.util.Objects;

public class Person { 
    private String name; 
    private int age; 
 
    public Person(String name, int age) { 
       this.name = name; 
       this.age = age;
    } 

    public int hashCode() { 
        int hash = 1; 
 
        hash = hash * 31 + ((name == null) ? 0 : this.name.hashCode()); 
        hash = hash * 31 + this.age; 
 
        return hash; 
    }

    public boolean equals(Object o) {
        if (o == null)
            return false;
        if (o.getClass() != this.getClass())
            return false;

        Person p = (Person)o;
        return Objects.equals(this.name, p.name) && age == p.age;
    }
 
 }
