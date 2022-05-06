public class Tester
{
	public static void main(String[] args)
	{
		Dog a = new Dog(true);
		Dog b = new Dog(false);
		Cat c = new Cat(true);

		System.out.println("Medium Dog, 6 years: " + a.calculateHumanYears(6));
		System.out.println("Dog, 7 years: " + b.calculateHumanYears(7));
		System.out.println("Cat 6 years: " + c.calculateHumanYears(6));
	}
}