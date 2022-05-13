import java.util.ArrayList;
import java.util.*;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import javax.swing.*;
import javax.swing.Timer;
public class LamdaTests
{
   public static void main(String[] args)
   {
      
      ArrayList<Student> students = new ArrayList<>();
      ArrayList<Student> filtered;
      
      students.add(new Student("Paul", 22, 3.84));
      students.add(new Student("Bob", 26, 2.67));
      students.add(new Student("Julie", 21, 3.62));
      students.add(new Student("Zoe", 18, 3.22));

      ArrayList<Object> objs = new ArrayList<>();
      objs.add(new Student("Paul", 22, 3.84));
      objs.add(1);
      objs.add("Hi");
      

      ///////////////////////////////////////////////////
      //                                               //
      //      Predicate in Context method Filtering    //
      //                                               //     
      ///////////////////////////////////////////////////
      //--Strategy Design Pattern (context: filterIt)--//
      ///////////////////////////////////////////////////

      // ------------- Made with Lambda -----------------
      Predicate<Student> pred = s -> s.getGpa() > 3.0;
      System.out.println(pred.test(students.get(2)));
      filtered = filterIt(students, pred);
      printList(filtered);

      // ---- Made with Function that makes Lambdas ------
      //  (Similar to Comparator.comparing idea, but just pass in number)
      filtered = filterIt(students, getGpaPredicate(3.5));
      printList(filtered);
   

      ///////////////////////////////////////////////////
      //                                               //
      //               Function Example                //
      //                                               //     
      ///////////////////////////////////////////////////
      //--Strategy Design Pattern (context: printList)-//
      ///////////////////////////////////////////////////
 
      System.out.println("\n********** PrintList and Function Tests ***********");

      //-------Print generic Student data in context of printList and Function interface------

      //Function<Student, String> f = s -> s.getName();
      Function<Student, String> f = Student::getName; 
      Function<Student, String> ageFunc = s -> Integer.toString(s.getAge());

      printList(students, "Student Name", f);
      printList(students, "Student Age", ageFunc);

      //-------Print generic Object data in context of printList and Function interface------
      Function<Object, String> objFunc = o -> "\n\t" + o.getClass() + "\n\tValue: " + o;
      printList(objs, "My Object", objFunc);

      ///////////////////////////////////////////////////
      //                                               //
      //              Other Lambda Tests               //
      //                                               //     
      ///////////////////////////////////////////////////

      System.out.println();
      Consumer<String> p = System.out::println;
      //Consumer<String> p = s -> System.out.println(s);
      for (Student s : students)
         p.accept(f.apply(s));
      
      System.out.println();
      
      //Function<String, String> u = String::toUpperCase;
      Function<String, String> u = s -> s.toUpperCase();
      
      Function<Student, String> fu = u.compose(f);
      for (Student s : students)
         p.accept(fu.apply(s));
   
     
   }  
     
   private static Predicate<Student> getGpaPredicate(double minGpa)
   {
      return s -> s.getGpa() >= minGpa;
   }
   
   private static <T> ArrayList<T> filterIt(List<T> list, Predicate<T> pred)
   {
      ArrayList<T> results = new ArrayList<>();
      for (T value : list)
      {
         if (pred.test(value))
         {
            results.add(value);
         }
      }
      return results;
   }
   
   private static void printList(List<Student> students)
   {
       System.out.println("\nStudent List:");
       for (Student s : students)
           System.out.println("   " + s.getName()); 
   }

   private static <T> void printList(List<T> myList, String label, Function<T, String> f)
   {
      for (T val : myList)
         System.out.println(label + ": " + f.apply(val));
   }
}
