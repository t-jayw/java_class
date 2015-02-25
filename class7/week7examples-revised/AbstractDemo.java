abstract class HelloAbstractWorld { }

class AbstractDemo
{   
   public static void main(String[] args)
   {
      System.out.println("Hello world");
      HelloAbstractWorld haw = new HelloAbstractWorld();
      // 8: HelloAbstractWorld is abstract; cannot be instantiated
   }
}