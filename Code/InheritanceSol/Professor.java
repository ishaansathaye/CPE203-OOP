// public class Professor extends Person
// {
//    private double mortgage;
//    private boolean tenure;
   
//    public Professor(double mortgage, boolean tenure, String name, double account, int legs) 
//    {
//       super(name, account, legs);
//       this.mortgage = mortgage;
//       this.tenure = tenure;
//    }
   
//    public String toString()
//    {
//       String s = super.toString() + " and a Professor object with a " + mortgage + " cent mortgage and ";
      
//       if (tenure)
//          s += "tenure.";
//       else
//          s += "no tenure.";
         
//       return s;
//    }
   
//    public boolean equals(Object o)
//    {
//       return super.equals(o) && mortgage == ((Professor)o).mortgage && ((Professor)o).tenure == tenure;
//    }
   
//    public void getPaid(double amount)
//    {
//       double mortgagePayment = amount * .25;
      
//       if (mortgagePayment > mortgage)
//       {
//          mortgagePayment = mortgage;
//       }
//       mortgage -= mortgagePayment;

//       super.getPaid(amount-mortgagePayment);
//    }
// }