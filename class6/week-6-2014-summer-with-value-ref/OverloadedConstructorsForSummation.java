// Initialize one object with another.
class Summation
{
  int sum;

  // Construct from an int.
  Summation(int num)
  {
	System.out.println("// Construct from an int parameter.");
    sum = 0;
    for(int i=1; i <= num; i++)
    {
	  System.out.println("sum is now " + sum);
      sum += i; // add the loop counter int to the sum int
    }
  }

  // Construct from another object that is input as a formal parameter.
  Summation(Summation ob)
  {
	System.out.println("// Construct from an object parameter.");
    System.out.println("sum is now " + sum);
    sum = ob.sum;
    System.out.println("sum is now " + sum);
  }
}

class OverloadedConstructorsForSummation
{
  public static void main(String[] args)
  {
    Summation s1 = new Summation(5);
    // pass an object at runtime to a constructor
    Summation s2 = new Summation(s1);

    System.out.println("s1.sum: " + s1.sum);
    System.out.println("s2.sum: " + s2.sum);
  }
}