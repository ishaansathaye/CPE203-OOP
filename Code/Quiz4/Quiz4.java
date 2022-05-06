// import java.util.Objects;

public class Quiz4 {
    public static void main(String[] args) {
        Person p1 = new Person("Aurian", 25); 
        Person p2 = new Student2("Aurian", 25, 32); 
        Person p3 = p2;
        System.out.println(p1.equals(p2));
        System.out.println(p1.equals((Person)p2));
        System.out.println(p2.equals(p3));

        Student2 s = new Student2("name", 23, 1);
        s.getCreditsEarned();
    }
     
}
