public class Dog extends Animal2
{
	boolean mediumDog;

	public Dog(boolean mediumDog)
	{
		this.mediumDog = mediumDog;
	}

	public void speak()
	{
		System.out.println("bark");
	}

	public int calculateHumanYears(int years)
	{
		int humanYears = super.calculateHumanYears(years);

		if (mediumDog)
		{
			if (years == 6)
			{
				humanYears += 2;
			}
			else if (years >= 7)
			{
				humanYears += 3;
			}
		}

		return humanYears;
	}

	protected void _attackHelper()
	{
		System.out.println("growl");
	}
}