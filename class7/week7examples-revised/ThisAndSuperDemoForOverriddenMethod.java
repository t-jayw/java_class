class BasicCake
{
	BasicCake()
	{
		System.out.println("BasicCake() " + this.getClass());
	}

	void myMethod()
	{
		System.out.println("myMethod in the superclass");
		System.out.println("This cake is " + this.getClass());
	}
}

class FrostedCake extends BasicCake
{
	FrostedCake()
	{
		super.myMethod();
		this.myMethod();
	}

	void myMethod()
	{
		System.out.println("myMethod in the subclass");
		System.out.println("This cake is " + this.getClass());
	}
}

class ThisAndSuperDemoForOverriddenMethod
{
	public static void main(String[] args)
	{
		BasicCake bc = new BasicCake();
		bc.myMethod();
		System.out.println();

		FrostedCake fc = new FrostedCake();
	}

}