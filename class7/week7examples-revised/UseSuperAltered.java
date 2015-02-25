// Using super to overcome name hiding.
class A
{
  int i = 47; // assigning a value to an instance variable
}

// Create a subclass by extending class A.
class B extends A
{
  int i; // this i hides the i in A

  B(int a, int b)
  {
    // using super to access an instance variable of the superclass
    super.i = a; // i in A
    i = b; // i in B
  }

  void show()
  {
    System.out.println("i in superclass: " + super.i);
    System.out.println("i in subclass: " + i);
  }
}

class UseSuperAltered
{
  public static void main(String[] args)
  {
    A myA = new A(); // call the default constructor
    System.out.println("i in A: " + myA.i);
    B subOb = new B(1, 2); // the new operator allocates memory for a new instance of a class
    subOb.show();
    System.out.println("i in A: " + myA.i);  // is this 1? or is it 47?
  }
}