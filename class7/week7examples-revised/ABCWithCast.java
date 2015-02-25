class A {
  String color = "crimson";
  A() {
    System.out.println("Constructing A.");
  }
}
class B extends A {
  String color = "blue";
  B() {
    System.out.println("Constructing B.");
  }
}
class C extends B {
  C() {
    System.out.println("Constructing an object of type C with the color value "
    + this.color);
  }
}
class ABCWithCast {
  public static void main(String[] args) {
	A a = new A();
    C c = new C();
    System.out.println("a.color is " + a.color);
    System.out.println("b.color is inherited by c, so c.color is " + c.color);
    A myCast = (A)c; // cast c as of type A
    String myStringCast = myCast.color;
    System.out.println("c cast as A is still " + myCast.getClass());
    System.out.println("c cast as color is " + myCast.color);
    /* ClassCastException if we try the following:
    C myCast2 = (C)a; // cast a as of type C
    System.out.println("a cast as C is still " + myCast.getClass()); */
  }
}