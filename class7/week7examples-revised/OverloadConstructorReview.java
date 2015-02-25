class OverLoadedConstructor
{
	  int a; // create "a" as variable type integer
	  OverLoadedConstructor()
	  {
	  System.out.println("This is an Overloaded Constructor which is not default.");
	  a = 1; // assign value of 1 to int a
	  }
	  OverLoadedConstructor(int x, int y, int z)
	  {
	  System.out.println("This is an Overloaded Constructor which is looking for three int variables.");
	  a = x + y + z; //adds the values of int x, y, and z to int variable a
	  }
}

class OverLoadedMethod
{
	void Meth() //a method that has no parameters
	{
		System.out.println("This is not a default overload method");
	}

	void Meth(long x, long y) //a method that has 2 long variables
	{
		System.out.println("This is looking for 2 long variables");
	}
}

class OverloadConstructorReview
{
   public static void main(String args[])
   {
     OverLoadedConstructor ol1 = new OverLoadedConstructor(); //create an object calls constructor with no argument
     OverLoadedConstructor ol2 = new OverLoadedConstructor(50,25,25);//create an object calls constructor with 3 variables

      System.out.println("I assigned \"a\" the value of " + ol1.a); //will go up to line 22
      System.out.println("\"a\" = x + y + z which equals " + ol2.a); //will go up to line 27
      System.out.println(); //prints a blank line

     OverLoadedMethod mt1 = new OverLoadedMethod(); //create an object calls constructor with no argument

      mt1.Meth(); //goes up to line 36
      System.out.println("This is a overloaded method with no parameters");

      mt1.Meth(10, 1); //goes up to line 41
      System.out.println("This is an overloaded method with parameters");
   }
}