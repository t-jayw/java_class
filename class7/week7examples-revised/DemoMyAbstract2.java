abstract class MyAbstract
{
   void printMessage()
   {
      System.out.println("Hello");
   }
   abstract void printMessage2(); // cannnot be implemented if declared abstract
}
class Implementation extends MyAbstract
{
   void printMessage()
   {
      System.out.println("Hello");
   }
  void printMessage2() // contract to implement is fulfilled
  {
    System.out.println("Hello");
   }
}

class DemoMyAbstract2
{
   public static void main(String[] args)
   {
      Implementation ma = new Implementation();
      ma.printMessage();
   }
}