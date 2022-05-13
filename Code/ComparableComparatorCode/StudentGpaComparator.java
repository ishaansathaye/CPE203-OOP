import java.util.*;

public class StudentGpaComparator implements Comparator<Student>
{
	//compare reverse order
   public int compare(Student s1, Student s2)
   {
   	  if (s1.gpa() >s2.gpa())
   	     return -1;
   	  else if (s1.gpa() < s2.gpa())
   	  	 return 1;
   	  else 
   	  	 return 0;
   }
}