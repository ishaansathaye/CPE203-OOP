public class Cat
{
   private int age;
   private int numToys;

   public Cat(int age, int numToys) { 
      this.age = age; 
      this.numToys = numToys; 
   }
   
   public int getAge() { return age; }
   public int getNumToys() { return numToys; }
   public void setNumToys(int num) { numToys = num; }

   List<Cat> cats = new ArrayList<Cat>();
   cats = cats.stream().filter(c -> c.getAge() >= 5).map(c -> new Cat(c.getAge(), c.setNumToys(c.getNumToys() * 2))).collect(Collectors.toList());
}