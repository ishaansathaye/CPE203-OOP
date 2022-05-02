public class Professor extends Person{
   private double mortgage;  
   private boolean tenure;
   
   public Professor(double mortgage, boolean tenure, String name, int account, int legs) {
      super(name, account, legs);
      this.mortgage = mortgage;
      this.tenure = tenure;
   }

   //override toString method
   public String toString() {
      return "I am an Animal object with " + numLegs + " legs and a Person object whose name
      is " + name + " and I am a Professor object with a " + mortgage + " dollar mortgage and " + tenure;
   }

   //override getPaid method
   public void getPaid(double amount) {
      mortgage -= amount*0.25
      if mortgage < 0 {
         mortgage = 0;
      }
      accountBalance += amount*0.75;
   }
}
