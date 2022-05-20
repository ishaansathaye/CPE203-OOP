import java.util.*;
import java.util.function.*;
import java.util.stream.*;
import java.io.*;

public class StreamsDemo
{
   public static void main(String[] args) 
   {
      List<Student> theStudents = new ArrayList<>();
      Consumer<Student> PrintStudentName = 
                s -> System.out.println(s.getName());
      
      readInStudents(theStudents);
      
      List<Student> topStudents = 
         theStudents.stream()
            .filter(s -> s.getGpa() >= 3.5)
            .collect(Collectors.toList());
            
      topStudents.stream().forEach(PrintStudentName);
      
      System.out.println("Average Student GPA: " +  
         theStudents.stream()
            .mapToDouble(Student::getGpa)
            .sum()
            /theStudents.size());
         
      List<Student> raisedStudents = 
         theStudents.stream()
            .filter(s -> s.getGpa() < 2.75)
            .map(s -> new Student(s.getName(), 
                                  s.getAge(), 
                                  s.getGpa() + .15))
            .collect(Collectors.toList());
            
      writeStudents(raisedStudents);
      
   }
   
   public static void readInStudents(List<Student> students)
   {
      try 
      {
        Scanner sc = new Scanner(new File("students.txt"));
         while (sc.hasNext())
         {
            students.add(new Student(sc.nextLine(), 
                                     sc.nextInt(), 
                                     sc.nextDouble()));
            sc.nextLine();
         }
      }
      catch (Exception e)
      {
         System.out.println("Can't open input file.");
      }
      
   }
   public static void writeStudents(List<Student> students) 
   {
      try 
      {
         PrintStream ps = new PrintStream("raisedStudents.txt");
         
         for (Student s : students)
         {
            ps.println(s.getName());
            ps.println(s.getAge());
            ps.println(s.getGpa());
         }
      }
      catch (Exception e)
      {
         System.out.println("Can't open output file.");
      }
   }   
    
}



































