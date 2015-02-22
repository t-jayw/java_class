// Compare a recursive algorithm to an iterative equivalent.
class Factorial
{
  // Recursive method calls itself on line 12
  int getFactorialRecursive(int n)
  {
    System.out.println("n equals " + n);
    int result;
    // terminating case
    if(n==1) return 1;
    // each recursive call gravitates toward the terminating case
    result = getFactorialRecursive(n-1) * n;
    System.out.println("current result is: " + result);
    return result;
  }

  // non-recursive, iterative equivalent.
  int getFactorialIterative(int n)
  {
    int t, result;
    result = 1;
    for(t=1; t <= n; t++)
    {
      System.out.println("n equals " + n);
      result *= t;
      System.out.println("current result is: " + result);
    }
    return result;
  }
}

class RecursionForFactorialWithPrintln
{
  public static void main(String[] args)
  {
    Factorial f = new Factorial();

    System.out.println("Factorials using recursive method.");
    System.out.println("Factorial of 3 is " + f.getFactorialRecursive(3));
    System.out.println("Factorial of 4 is " + f.getFactorialRecursive(4));
    System.out.println("Factorial of 5 is " + f.getFactorialRecursive(5));
    System.out.println();

    System.out.println("Factorials using iterative method.");
    System.out.println("Factorial of 3 is " + f.getFactorialIterative(3));
    System.out.println("Factorial of 4 is " + f.getFactorialIterative(4));
    System.out.println("Factorial of 5 is " + f.getFactorialIterative(5));
  }
}