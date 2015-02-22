// Demonstrate method overloading.
class Overload
{
  void printParameters()
  {
    System.out.println("No parameters");
  }

  void printParameters(int myFormalParameter)
  {
    System.out.println("One parameter: " + myFormalParameter);
  }

  int printParameters(int myFormalParameter, double myDoubleFormalParameter)
  {
    System.out.println("Two parameters: " + myFormalParameter + " " + myDoubleFormalParameter);
    return (int)(myFormalParameter + myDoubleFormalParameter);
  }

  int printParameters(double b, int a)
  {
      System.out.println("Two parameters: " + a + " " + b);
      return (int)(a + b);
  }

  double printParameters(double a, double b)
  {
    System.out.println("Two double parameters: " +
                       a + " "+ b);
    return a + b;
  }
}

class OverloadMethodDemo
{
  public static void main(String[] args)
  {
    Overload ob = new Overload();
    int resultInteger;
    double resultDouble;

    ob.printParameters();
    System.out.println();

    ob.printParameters(2);
    System.out.println();

    resultInteger = ob.printParameters(4, 6.0);
    System.out.println("Result of ob.printParameters(4, 6): " +
                       resultInteger);
    System.out.println();


    resultDouble = ob.printParameters(1, 2.32);
    System.out.println("Result of ob.printParameters(1.1, 2.2): " +
                       resultDouble);
  }
}