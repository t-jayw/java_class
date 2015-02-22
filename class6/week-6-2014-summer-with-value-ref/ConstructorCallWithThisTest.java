/* To chain to a particular superclass constructor instead of one in the same class,
  use super instead of this.
  Note that you can only chain to one constructor, and it has to be the first statement
  in your constructor body.*/
class ConstructorCallWithThis
{
    int x;
    public ConstructorCallWithThis()
    {
		// call the matching constructor in a constructor call "chain"
		this(1);
        System.out.println("called constuctor with this(1)");


    }
    public ConstructorCallWithThis(int x)
    {
        this.x = x; // assign the value of the formal argument to the field
        // x = x; // myTest.x will equal 0, unassigned
        System.out.println(this.x);
    }
}

class ConstructorCallWithThisTest
{
	public static void main(String[] args)
	{
		ConstructorCallWithThis myTest = new ConstructorCallWithThis();
		System.out.println("myTest.x is " + myTest.x);
	}
}