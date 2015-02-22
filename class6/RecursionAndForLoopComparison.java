class BackwardsWithRecursion
{
	String str;
	BackwardsWithRecursion(String s)
	{
		str = s;
		int terminalInt = str.length() -1;
		System.out.println("str.length() - 1 is the terminal integer: " + terminalInt);
	}
	void getBackward(int index)
	{
		if(index != str.length() -1)
		{
		    System.out.println(str.charAt(index));
            System.out.println("recursive call index equals " + index);
			// increment replaces loop iteration
			getBackward(index + 1);
		}
	//	System.out.print(str.charAt(index));
	}
}
class BackwardsWithLoop
{
	static void useLoop(String s)
	{
		//System.out.print("\nnon-recursive loop:\n");
		for(int i = s.length() - 1; i >= 0; i--)
		{
			System.out.print(s.charAt(i));
		}
	}
}
class RecursionAndForLoopComparison
{
  public static void main(String[] args)
  {
	BackwardsWithRecursion b1 = new BackwardsWithRecursion("Name sold, I'd lose man");
    b1.getBackward(0);
    System.out.print("\nfor loop equivalent: ");
	BackwardsWithLoop.useLoop("riS etov ot esir");
	System.out.println();
  }
}
