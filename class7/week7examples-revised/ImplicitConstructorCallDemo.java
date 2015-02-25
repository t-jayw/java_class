class A
{
  /* A()
   {
      System.out.println("in the constructor of A");
   }  */
   A(int i)
   {
         System.out.println("in the constructor of A");
   }

   void makeApplesauce()
   {
      System.out.println("in A's method");
   }
}

class B extends A
{
   void makeApplesauce(int numberOfApples)
   {
      System.out.println("in B's method with the following number of apples: " + numberOfApples);
   }
}

class ImplicitConstructorCallDemo
{
   public static void main(String[] args)
   {
      A myA = new A();
      myA.makeApplesauce();
      System.out.println("Before the call the B() constructor ... ");
      B myB = new B(); // implicit call to A() to enforce inheritence
      System.out.println("... After the call to the B() constructor");
      myB.makeApplesauce(12);
   }
}
/* ImplicitConstructorCallDemo.java:18: error: constructor A in class A cannot be applied to given types;
class B extends A
^
  required: int
  found: no arguments
  reason: actual and formal argument lists differ in length

  So, the superclass must have either the default constructor or a parameterless constructor!
*/