public class Cat extends Animal2 {
	private boolean clawsSharp;

	public Cat(boolean c) { clawsSharp = c; }

	public void speak()
	{
		if (clawsSharp)
		{
			System.out.println("hiss");
		}
		System.out.println("moew");
	}

	protected void _attackHelper()
	{
		if (clawsSharp)
			System.out.println("scratch");
		else
			clawsSharp = true;
	}
}