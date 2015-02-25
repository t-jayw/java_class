/* It is legal to declare a class abstract
   even if we have not yet developed any abstract method. Indeed, another use case for an abstract class is to define field values for the subclasses */
abstract class HelloAbstractWorld
{
	static String myField = "Howdy";
	void printGreeting()
	{
		System.out.println(myField);
	}
}
class NonAbstractGreeter extends HelloAbstractWorld{}

class AbstractDemoWithConcreteMethod
{
   public static void main(String[] args)
   {
      NonAbstractGreeter nag = new NonAbstractGreeter();
      nag.printGreeting();
      System.out.println(NonAbstractGreeter.myField);
   }
}