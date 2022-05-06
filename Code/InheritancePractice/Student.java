public class Student extends Person {
   private double gpa;
   private double studentLoans;  
   
   public Student(double gpa, double studentLoans, String name, int account, int legs) {
      super(name, account, legs);
      this.gpa = gpa;
      this.studentLoans = studentLoans;
   }

   //override toString - wrong
   public String toString() {
      return "I am an Animal object with " + numLegs + " legs and a Person object whose name is " + name + " and I am a Student object with a " + gpa + " GPA and " + studentLoans + " dollars of student loans.";
   }

   //override getPaid method
   public void getPaid(double amount) {
      studentLoans -= amount*0.10;
      if studentLoans < 0 {
         studentLoans = 0;
      }
      accountBalance += amount*0.90;
   }

}
