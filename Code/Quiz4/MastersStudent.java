public class MastersStudent extends Student2 {

    private String[] advisors;

    public MastersStudent(String name, int age, int creditsEarned, String[] advisors) {
        super(name, age, creditsEarned);
        this.advisors = advisors;
    }
        
}