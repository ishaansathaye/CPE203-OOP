// public class Student extends Person
// {
//    private double gpa;
//    private double studentLoans;
   
//    public Student(double gpa, double studentLoans, String name, double account, int legs) 
//    {
//       super(name, account, legs);
//       this.gpa = gpa;
//       this.studentLoans = studentLoans;
//    }
   
//    public String toString()
//    {
//       return super.toString() + " and a Student object with a " + gpa + " gpa and " +
//        studentLoans + " cents of student loans.";
//    }
   
//    public boolean equals(Object o)
//    {
//       return super.equals(o) && gpa == ((Student)o).gpa && studentLoans == ((Student)o).studentLoans;
//    }
   
//    public void getPaid(double amount)
//    {
//       double loanPayment = amount * .10;
      
//       if (loanPayment > studentLoans)
//       {
//          loanPayment = studentLoans;
//       }
//       studentLoans -= loanPayment;

//       super.getPaid(amount-studentLoans);
//    }
// }