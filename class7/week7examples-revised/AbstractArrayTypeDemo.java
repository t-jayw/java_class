abstract class HelloAbstractWorld { }
class ImplementIt extends HelloAbstractWorld { }

class AbstractArrayTypeDemo
{
   public static void main(String[] args)
   {
      ImplementIt[] myArray = new ImplementIt[3];
      // myArray[0] = ImplementIt(new HelloAbstractWorld()); // ILLEGAL
      myArray[0] = new ImplementIt(); // object of type that extends an abstract class
      Object[] myObjectArray = new Object[4];
      myObjectArray[0] = new ImplementIt(); // object array storing any kind of object
      myObjectArray[1] = "Hello";  // object array storing any kind of object
      myObjectArray[2] = (Object)(new ImplementIt()); // cast to Object is allowed
      myObjectArray[3] = (Object)"Hello";  // object array storing any kind of object

      for(Object o: myObjectArray)
      {
		  System.out.println(o);
		  System.out.println(o.getClass());
	  }
  }
}