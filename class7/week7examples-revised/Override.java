// Method overriding.
class A
{
  int i, j;
  A(int a, int b)
  { // custom constructor of the superclass
    i = a; // 1
    j = b; // 2
  }

  // display i and j
  void show()
  {
    System.out.println("i and j: " + i + " " + j);
  }
}

class B extends A
{
  int k; // declare an instance variable

  B(int a, int b, int c)
  { // 1, 2, 3
    super(a, b); // call the constructor of the superclass
    k = c; // 3
    // back to the caller
  }

  // display k – this overrides show() in A
  void show()
  {
    System.out.println("k: " + k);
    super.show();
    //super.super.show();  single inheritence
  }
}

// we do not need to say extends Object
// because this is IMPLICIT for every class
class Override extends Object
{
  public static void main(String[] args)
  {
    B subOb = new B(1, 2, 3); // calling the constructor in the B class

    // on the subOb object, call its show method
    subOb.show(); // this calls show() method in B
   // super.show();  what is the superclass of Override
   // subOb.super.show();   subOb is not a class so the dot operator doesn't work here
   //subOb.super.show();
  }
}
