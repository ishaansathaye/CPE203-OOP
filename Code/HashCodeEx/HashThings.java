public class HashThings
{
	public static void main(String[] args)
	{
		Person p1 = new Person("Coderson", "Carla", 21);
		Person p2 = new Person("Coderson", "Cody", 21);
		Person p3 = new Person("Coderson", "Cody", 21);
		Person p4 = new Person(null, "Cody", 21);

		System.out.println("P1 hashes to: " + p1.hashCode());
		System.out.println("P2 hashes to: " + p2.hashCode());
		System.out.println("P3 hashes to: " + p3.hashCode());
		System.out.println("P4 hashes to: " + p4.hashCode());

		Integer i = 53;
		System.out.println("Hashing an int: " + i.hashCode());
	}
}
