import java.util.*;

public class Student implements Comparable<Student>
{
   private String lastName;
   private String firstName;
   private int age;
   private double gpa;
   
   public Student(String lastName, String firstName, int age, double gpa)
   {
      this.lastName = lastName;
      this.firstName = firstName;
      this.age = age;
      this.gpa = gpa;     
   }   

   public double getGpa() { return gpa; } 
   public int getAge() { return age; } 
   public String getLastName() { return lastName; } 
   public String getFirstName() { return firstName; } 

   public String toString()
   {
      return firstName + " " + lastName + " is " + age + " with a gpa of " 
             + gpa + ".";
   }

   public int compareTo(Student other)
   {
      return lastName.compareTo(other.lastName);
   }
}

