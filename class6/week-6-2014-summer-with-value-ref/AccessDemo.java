// Public vs private access.
class MyClass {
  private int alpha; // private access
  public int beta; // public access
  int gamma; // default access, package

  /* Methods to access alpha.  Aaccess a private
  * member of the same class. */
  void setAlpha(int a) {
    alpha = a;
  }

  int getAlpha() {
    return alpha;
  }
}
// Demonstrate that a private variable is not visible outside its class
class AccessDemo {
  public static void main(String[] args) {
    MyClass ob = new MyClass();

    /* Access to alpha is allowed only through
       its accessor methods. */
    ob.setAlpha(-99);
    System.out.println("ob.alpha is " + ob.getAlpha());

    /* The compiler error is:
    * AccessDemo.java:29: alpha has private access * in MyClass */
    //ob.alpha = 10; // comment out this line!

    // These are OK because beta and gamma are public.
    ob.beta = 88;
    ob.gamma = 99;
   }
}