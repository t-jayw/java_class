class BasicCake
{
	boolean isBasic = true;
	int myInt = 0;

	BasicCake()
	{
		myInt = 47;
		System.out.println("batter has been mixed and baked and isBasic is set to " + this.isBasic);
	}
}

class FrostedCake extends BasicCake
{
    boolean isBasic = false;

	String typeOfIcing;

	FrostedCake()
	{
		super();
		System.out.println("batter has been mixed and baked and isBasic is set to " + this.isBasic + " but in the superclass, the value of isBasic remains " + super.isBasic);
	}

	String setTypeOfIcing(String s)
	{
		return typeOfIcing = s;
	}
}

class ThisAndSuperDemoForInstanceVariable
{
	public static void main(String[] args)
	{
		FrostedCake fc = new FrostedCake();
		System.out.println("The icing is " + fc.setTypeOfIcing("chocolate"));
		System.out.println("The subclass value of myInt is: " + fc.myInt);
	}

}