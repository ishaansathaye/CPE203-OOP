public class Student
{
   private String name;
   private int age;
   private double gpa;
   
   public Student(String name, int age, double gpa)
   {
      this.name = name;
      this.age = age;
      this.gpa = gpa;     
   }   
   public String getName() 
   {
      return name;
   }
   public int getAge() 
   {
      return age;
   }
   public double getGpa() 
   {
      return gpa;
   }
}
