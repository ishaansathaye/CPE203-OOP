public abstract class Animal2 {
	
	public abstract void speak();


	public int calculateHumanYears(int years)
	{
		// age faster when younger, so set 1 years to 15.
		if (years == 1)
		{
			return 15;
		}
		
		// after year 2 (which is 28), age in multiples of 4
		int humanYears = 16 + 4 * years; 


		return humanYears;
	}

	public void attack(int i)
	{
		System.out.println("Grrrrr");
		if (i > 5)
			_attackHelper();
		System.out.println("Grrrrr");
	}

	protected abstract void _attackHelper();
}