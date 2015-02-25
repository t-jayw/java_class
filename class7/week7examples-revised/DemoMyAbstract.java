// MyAbstract is abstract; cannot be instantiated
// but a subclass that implements any abstract methods can be instantiated.
abstract class MyAbstract
{
   void message()
   {
      System.out.println("Hello");
   }
}

class DemoMyAbstract
{
   public static void main(String[] args)
   {
      MyAbstract ma = new MyAbstract();
      ma.message();
   }
}