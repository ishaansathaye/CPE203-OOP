import java.util.Objects;

public class Student2 extends Person { 
    private int creditsEarned; 
 
    public Student2(String name, int age, int creditsEarned) { 
       super(name, age); 
       this.creditsEarned = creditsEarned; 
    }

    
    public int hashCode() { 
       return Objects.hash(super.hashCode(), this.creditsEarned); 
    } 

    public boolean equals(Object o) {
        return super.equals(o) && this.creditsEarned == ((Student2)o).creditsEarned;
    }

    public int getCreditsEarned() {
        return creditsEarned;
    }
        
 }
