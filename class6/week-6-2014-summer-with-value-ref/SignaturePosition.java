class SignaturePosition
{
	boolean myBoolean;
	int myInt;

	static void printSomething(boolean myBoolean, int myInt)
	{
		System.out.println("boolean before int");
	}

	static void printSomething(int myInt, boolean myBoolean)
	{
		System.out.println("int before boolean");
	}

	public static void main(String[] args)
	{
		printSomething(false, 17);
		printSomething(17, false);
	}
}