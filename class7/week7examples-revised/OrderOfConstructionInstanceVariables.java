/* Demonstrate that the implicit call of
   the superclass constructor guarantees
   proper initialization of inherited
   instance variables */

class A extends java.lang.Object {
  int classAInstanceVariable; // declaring an instance variable
  A() {
    System.out.println("Constructing A.");
    classAInstanceVariable = 78; // back to caller
  }
}

class B extends A {
  B() {
    System.out.println("Constructing B.");
    // go to line 6
    //super(); // illegal call the superclass constructor
  }
}

class C extends B {
  C() {
    System.out.println("Constructing C.");
    System.out.println("the value of classAInstanceVariable that I inherited from A is: " + classAInstanceVariable);
    // go to line 14
  }
}

class OrderOfConstructionInstanceVariables {
  public static void main(String[] args) {
    C c = new C(); // call the constructor
    // creates an instance of type C
    // go to line 14
    // magic mechanism:
    // implicit call to the constructor of the superclass
  }
}