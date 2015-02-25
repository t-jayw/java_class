class A
{
   void makeApplesauce()
   {
      System.out.println("in A's method");
   }
}

class B extends A
{
   // overload the inherited method with a new signature
   void makeApplesauce(int numberOfApples)
   {
      System.out.println("in B's method with the following number of apples: " + numberOfApples);
   }
}

class OverloadAppleSauceDemo
{
   public static void main(String[] args)
   {
      A myA = new A();
      myA.makeApplesauce();
      B myB = new B();
      myB.makeApplesauce(12);
      myB.makeApplesauce(); // subclass inherits superclass methods
      /*
           The superclass does not know its subclasses has overloaded the superclass method with a new signature.

           makeApplesauce() in A cannot be applied to (int)
           myA.makeApplesauce(12);
      */
      // myA.makeApplesauce(12);
   }
}