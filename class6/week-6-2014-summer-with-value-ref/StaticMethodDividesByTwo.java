// Static class allows access to members without instantiation
class StaticMeth
{
  static int val = 1024; // a static variable

  // a static method
  static int divideByTwo()
  {
    return val/2;
  }
}

class StaticMethodDividesByTwo
{
  public static void main(String[] args)
  {
    System.out.println("val is " + StaticMeth.val);
    System.out.println("StaticMeth.divideByTwo(): " +
                       StaticMeth.divideByTwo());

    StaticMeth.val = 4;
    System.out.println("val is " + StaticMeth.val);
    System.out.println("StaticMeth.divideByTwo(): " +
                       StaticMeth.divideByTwo());

   StaticMeth.val = -4;
   System.out.println("val is " + StaticMeth.val);
   System.out.println("StaticMeth.divideByTwo(): " +
                      StaticMeth.divideByTwo());
  }
}