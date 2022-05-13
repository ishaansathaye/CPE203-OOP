import org.junit.Test;

import java.util.*;
import java.util.function.Function;
import java.util.function.Predicate;

import static org.junit.Assert.*;

public class TestCases
{
   private static Student[] studentArray = new Student[] {
           new Student("Smidt", "Bob", 26, 2.67),
           new Student("Workman", "Julie", 21, 3.84),
           new Student("Johnson", "Jane", 18, 3.59),
           new Student("Hatalsky", "Paul", 22, 3.21),
           new Student("Wood", "Zoe", 21, 3.62)
   };
      


   @Test
   public void testNameComp()
   {
      // Lambda (long syntax)
      Comparator<Student> comp1 = (Student s1, Student s2) -> 
                              {  return s1.getFirstName().compareTo(s2.getFirstName());};
      // Lambda (short syntax)
      Comparator<Student> comp2 = (s1, s2) -> 
                              s1.getFirstName().compareTo(s2.getFirstName());
      // Key extractor (lambda)
      Comparator<Student> comp3 = Comparator.comparing(s->s.getFirstName());
      // Key extractor (method reference operator)
      Comparator<Student> comp4 = Comparator.comparing(Student::getFirstName);

      assertTrue(comp1.compare(studentArray[0], studentArray[3]) < 0); // B < P
      assertTrue(comp2.compare(studentArray[0], studentArray[3]) < 0);
      assertTrue(comp3.compare(studentArray[0], studentArray[3])< 0);
      assertTrue(comp4.compare(studentArray[0], studentArray[3]) < 0);
   }

   @Test
   public void testAgeComp()
   {
      // Lambda (short syntax)
      Comparator<Student> comp1 = (s1, s2) -> s1.getAge() - s2.getAge();
      // Key extractor (lambda)
      Comparator<Student> comp2 = Comparator.comparing(s->s.getAge());
      // Key extractor (method reference operator)
      Comparator<Student> comp3 = Comparator.comparing(Student::getAge);

      assertTrue(comp1.compare(studentArray[0], studentArray[3]) > 0); // 26 > 22
      assertTrue(comp2.compare(studentArray[0], studentArray[3]) > 0);
      assertTrue(comp3.compare(studentArray[0], studentArray[3]) > 0);

   }

   @Test
   public void testGpaComp()
   {
      // Lambda (short syntax)
      Comparator<Student> comp1 = (s1, s2) -> ((Double)s1.getGpa()).compareTo(s2.getGpa());
      // Key extractor (lambda)
      Comparator<Student> comp2 = Comparator.comparing(s->s.getGpa());
      // Key extractor (method reference operator)
      Comparator<Student> comp3 = Comparator.comparing(Student::getGpa);

      assertTrue(comp1.compare(studentArray[0], studentArray[3]) < 0); // 2.67 < 3.21
      assertTrue(comp2.compare(studentArray[0], studentArray[3]) < 0);
      assertTrue(comp3.compare(studentArray[0], studentArray[3]) < 0);

      // reversed

      // does not work - lambda is not comparator until stored as one
      //Comparator<Student> compRev = ((s1, s2) -> ((Double)s1.getGpa()).compareTo(s2.getGpa())).reversed();
      
      Comparator<Student> compRev1 = Comparator.comparing(Student::getGpa).reversed();
      assertTrue(compRev1.compare(studentArray[0], studentArray[3]) > 0);
      assertTrue(comp1.reversed().compare(studentArray[0], studentArray[3]) > 0);
   }

   @Test
   public void testAgePred()
   {
      // return true if age > 21
      Predicate<Student> pred = s -> s.getAge() > 21;

      assertTrue(pred.test(studentArray[0]));
   }

   @Test
   public void testNameFunc()
   {
      // Input: Student, Return Type: String

      // Lambda
      Function<Student, String> func = s -> s.getFirstName();

      // Method reference Operator
      Function<Student, String> func2 = Student::getFirstName;

      assertEquals(func.apply(studentArray[0]), "Bob");
   }


}
