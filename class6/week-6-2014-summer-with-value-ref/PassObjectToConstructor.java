class DriverLicense
{
	DriverLicense(int ssn)
	{
	}
}

class LibraryCard
{
	LibraryCard(DriverLicense dl)
	{

	}
}

class PassObjectToConstructor
{
	public static void main(String[] args)
	{
		DriverLicense myDL = new DriverLicense(555555555);
		LibraryCard myLC = new LibraryCard(myDL);
		System.out.println(myLC.getClass());
		System.out.println(myDL.getClass());
		System.out.println("Hello World!".getClass());

		// the overloaded String constructor can accept an argument
		System.out.println(new String("Hello World!").getClass());
		System.out.println(new String(new String("fun")).getClass());
		char[] myCharArray = { 'a', 'b', 'c' };
		System.out.println(new String(myCharArray).getClass());

		// the constructor for Object accepts no argument
		System.out.println(new Object().getClass());
		System.out.println(new java.lang.Object().getClass());
	}
}