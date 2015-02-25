// The call to the superclass constructor can have arguments
class BasicCake
{
	boolean isBasic = true;

	BasicCake()
	{
		System.out.println("batter has been mixed and baked and isBasic is set to " + this.isBasic);
	}
	BasicCake(String anyString)
	{
		System.out.println("This superclass constructor has a String parameter");
	}
}

class FrostedCake extends BasicCake
{
    boolean isBasic = false;

	String typeOfIcing;

	FrostedCake()
	{
		// this(true); // illegal
		super();
		System.out.println("batter has been mixed and baked and isBasic is set to " + this.isBasic + " but in the superclass, the value of isBasic remains " + super.isBasic);
	}

	FrostedCake(boolean hasStringInput)
	{
		super("These are a few of my favorite Strings");
		// this(); // illegal
	}

	String setTypeOfIcing(String s)
	{
		return typeOfIcing = s;
	}
}

class ThisAndSuperDemoForConstructors
{
	public static void main(String[] args)
	{
		FrostedCake fc = new FrostedCake();
		System.out.println("The icing is " + fc.setTypeOfIcing("chocolate"));
		FrostedCake fc2 = new FrostedCake(2 + 2 == 4);
	}

}