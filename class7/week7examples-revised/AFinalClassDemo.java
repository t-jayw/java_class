/*
	http://en.wikipedia.org/wiki/Singleton_pattern
*/
final class A
{
	// define a class that cannot be subclassed
}

// to compile, this class must be commented out
class B extends A
//10: cannot inherit from final A
{
}

class AFinalClassDemo
{
   public static void main(String[] args)
   {
	   // create an object at a level that cannot be subclassed
      A myA = new A();
   }
}
