class BasicCake
{
	boolean isBasic = true;

	boolean isBasicCake()
	{
		return isBasic;
	}
}

class FrostedCake extends BasicCake
{
	boolean isBasicCake()
	{
		boolean b = super.isBasicCake(); // true
		System.out.println(b);
		this.isBasic = false;
		return this.isBasic;
	}
}

class ThisAndSuperDemoForMethodThatCallsAMethod
{
	public static void main(String[] args)
	{
		BasicCake bc = new BasicCake();
		System.out.println(bc.isBasicCake()); // true
		FrostedCake fc = new FrostedCake();
		System.out.println(fc.isBasicCake()); // false
	}

}