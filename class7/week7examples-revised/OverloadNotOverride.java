/* Methods with differing type signatures are
   overloaded and not overridden. */
class A
{
  int i, j;

  A(int a, int b)
  {
    i = a;
    j = b;
  }

  // display i and j
  void show()
  {
    System.out.println("i and j: " + i + " " + j);
  }
}


// Create a subclass by extending class A.
class B extends A
{
  int k;

  B(int a, int b, int c)
  {
    super(a, b);
    k = c;  // assign to k the value of 3
  }

  // overload show()
  void show(String msg)
  {
    System.out.println(msg + k);
  }
}

class OverloadNotOverride
{
  public static void main(String[] args)
  {
    B subOb = new B(1, 2, 3); // instantiate an object called subOb of the class B

    subOb.show("This is k: "); // this calls show() in B
    subOb.show(); // this calls show() in A
  }
}