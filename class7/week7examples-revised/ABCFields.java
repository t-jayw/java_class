class A {
  String color = "red";
  // String super = "s"; illegal! super is a reserved word
  A() {
    System.out.println("Constructing A.");
    System.out.println("\tA's color is " + this.color);
  }
}

// Reassign value to a local copy of an inherited field.
class B extends A {
  int licenseNumber = 303;
  String color = super.color; // what does this do?
  B() {
    System.out.println("Constructing B.");
    System.out.println("\tA's color is " + super.color);
    System.out.println("\tB's color is " + this.color);
    super.color = "blue";
    System.out.println("\tB's color is " + this.color);
    super.color = "orange"; // local to B, does not affect A
    System.out.println("\tA's color is " + super.color);
  }
}

class C extends B {
  //String color;
  C() {
    System.out.println("Constructing C.");
    super.color = "green";
    System.out.println("\tB's color is " + super.color);
    this.color = "yellow";
    System.out.println("\tB's color is " + super.color);
  }
}

class ABCFields {
  public static void main(String[] args) {
    C c = new C();
    System.out.println("in main, c.color is " + c.color);
    System.out.println("c.licenseNumber = " + c.licenseNumber);
    B b = new B();
    System.out.println("in main, b.color is " + b.color);
    A a = new A();
    System.out.println("in main, a.color is " + a.color);
  }
}
// What can we say about inheritance?
// How can a subclass reference a field of its superclass?
// Is the superclass affected by subclass use of super?