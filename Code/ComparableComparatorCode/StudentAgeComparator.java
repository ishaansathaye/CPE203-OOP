import java.util.*;

public class StudentAgeComparator implements Comparator<Student>
{
   public int compare(Student s1, Student s2)
   {
   	  return s1.age() - s2.age(); //compare ascending order
   }
}