class A
{
   int numberOfApples = 12;

   A()
   {
      System.out.println("in the constructor of A");
   }

   void makeApplesauce()
   {
      System.out.println("in A's method with numberOfApples = " + numberOfApples);
   }
}

class B extends A
{
   void makeApplesauce(int numberOfApples)
   {
      System.out.println("in B's method with the following number of apples: " + numberOfApples);
      System.out.println("subclass can call superclass methods");
      super.makeApplesauce();
   }
}

class ImplicitConstructorCallDemo2
{
   public static void main(String[] args)
   {
      A myA = new A();
      myA.makeApplesauce();
      // myA.makeApplesauce(13); // superclass cannot see subclass
      B myB = new B(); // implicit call to A()
      System.out.println("B's field was pre-initalized by A to: " + myB.numberOfApples);
      myB.makeApplesauce(13);
      myB.makeApplesauce(); // subclass sees its superclass members
      System.out.println(myB.numberOfApples);
   }
}