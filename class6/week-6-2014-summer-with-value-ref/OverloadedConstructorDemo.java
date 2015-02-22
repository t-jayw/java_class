// Demonstrate an overloaded constructor.
class Book
{
  int myInt;
  //private int y;

  Book()
  {
    System.out.println("Inside Book().");
    myInt = 0; // assign the value of zero to myInt
  }
  // reuse code while added the minimal new code
  Book(boolean b)
  {
      this(); // call Book() with no formal parameters
      boolean localBoolean = b;
      System.out.println("the constructor that calls "
         + "the no-arg constructor and then does something.");
  }
  Book(int i)
  {
    System.out.println("Inside Book(int).");
    // Book(); // not allowed!
    myInt = i;
  }
  Book(double d)
  {
    System.out.println("Inside Book(double).");
    myInt = (int) d; // as int 17
  }
  Book(int i, int j)
  {
    System.out.println("Inside Book(int, int).");
    myInt = i * j;
  }
}

class OverloadedConstructorDemo
{
  public static void main(String[] args)
  {
    Book b1 = new Book();
    Book bBoolean = new Book(true);
    Book b2 = new Book(88);  // calling the constructor on line 10
    Book b3 = new Book(17.23);
    Book b4 = new Book(2, 4);

    System.out.println("b1.myInt: " + b1.myInt);
    System.out.println("b2.myInt: " + b2.myInt);
    System.out.println("b3.myInt: " + b3.myInt);
    System.out.println("b4.myInt: " + b4.myInt);
  }
}