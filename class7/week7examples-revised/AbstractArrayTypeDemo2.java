abstract class HelloAbstractWorld { }
class ImplementIt extends HelloAbstractWorld { }

class AbstractArrayTypeDemo2
{
   public static void main(String[] args)
   {
      ImplementIt myImplementIt = new ImplementIt();
      HelloAbstractWorld mySubclassObject1 = (HelloAbstractWorld)myImplementIt;
      HelloAbstractWorld mySubclassObject2 = new ImplementIt();
      Object myObject = new String("hello");
	  System.out.println(mySubclassObject1.getClass());
	  System.out.println(mySubclassObject2.getClass());
	  System.out.println(myObject.getClass());

	  /* Illegal to create an array of an abstract class
      HelloAbstractWorld[] myArray = new HelloAbstractWorld[3];
      but the array of the abstract type
      can hold objects of an implemented subclass */
	  HelloAbstractWorld[] myHelloAbstractWorldArray = { mySubclassObject1, mySubclassObject2 };
	  System.out.println(myHelloAbstractWorldArray[0].getClass());
	  System.out.println(myHelloAbstractWorldArray[1].getClass());
   }
}