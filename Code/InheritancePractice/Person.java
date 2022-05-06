public class Person extends Animal {

   private String name;
   protected double accountBalance;  
   
   public double getAccountBallance() { return accountBalance; }
   
   public Person(String name, double accountBalance, int legs) {

      super(legs);
      this.name = name;
      this.accountBalance = accountBalance;

   }

   //override toString method
   public String toString() {
      //do return super.toString() + " ...";
      return "I am an Animal object with " + this.legs + " legs and a Person object whose name is " + name;
   }

   //override equals method
   public boolean equals(Object obj) {
      if(obj instanceof Person) {
         Person other = (Person)obj;
         return name.equals(other.name) && accountBalance == other.accountBalance;
      } else {
         return false;
      }
      //return super.equals(obj) && name.equals(((Person)obj).name);
   }

   public void getPaid(double amount) {
      accountBalance += amount;
   }
}
