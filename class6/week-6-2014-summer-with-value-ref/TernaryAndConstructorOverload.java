class IfElseVersionAndTernaryVersion
{
	// fields
	int x = 1;
	int y = 3;
	int lowestValue;

	// overloaded constructor
	IfElseVersionAndTernaryVersion(int anyInt)
	{
		for(int i = 0; i < 5; i++)
		{
			System.out.println("i is now: " + i);
			if(x < y) lowestValue = x;
			else lowestValue = y;
			System.out.println("\tx is " + x + " and y is " + y + " so lowestValue is " + lowestValue);
			x++;
		}
	}
	IfElseVersionAndTernaryVersion(String s)
	{

		for(int i = 0; i < 5; i++)
		{
			System.out.println("i is now: " + i);
			lowestValue = x < y ? x : y;
			System.out.println("\tx is " + x + " and y is " + y + " so lowestValue is " + lowestValue);
			x++;
		}
	}
}
class TernaryAndConstructorOverload
{
	public static void main(String[] args)
	{
		System.out.println("call the IfElseVersion constructor");
		new IfElseVersionAndTernaryVersion(1);
		System.out.println("\ncall the TernaryVersion constructor");
		new IfElseVersionAndTernaryVersion("use Ternary");
	}
}


