public class Animal {
    
   private int numLegs;
   
   public Animal(int legs) {
   
      numLegs = legs;
   
   }
   
   public String toString()
   {
      return "I am an Animal object with " + numLegs + " legs";
   }

   //override equals method
   public boolean equals(Object obj)
   {
      if (obj == null) {
         return false;
      }
      if(obj instanceof Animal) {
         Animal other = (Animal)obj;
         return numLegs == other.numLegs;
      } else {}
         return false;
      }
   }

}

  
