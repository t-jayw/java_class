// Simple types are passed by value.
class Test
{
	// no field declarations.

	/* This method causes no change to the arguments
	 used in the call. The scope of formal parameters i and j is the method definition. */
	void noChange(int i, int j)
	{
		System.out.println("within the noChange method definition, the value of i is "
		   + i + " and the value of j is " + j);
		i = i + j;
		j = -j;
		System.out.println("within the noChange method definition, the value of i is "
		   + i + " and the value of j is " + j);
	}
}

class CallByValue
{
	public static void main(String[] args)
	{
		Test ob = new Test();

		int a = 15, b = 20; // local variables, not fields

		System.out.println("a and b before call: " +
		   a + " " + b);

		ob.noChange(a, b); // runtime arguments that are not returned or modified

		System.out.println("a and b after call: " +
		   a + " " + b);

	}
}