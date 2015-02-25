class A {
  A() {
    System.out.println("Constructing A.");
  }
}

// Create a subclass by extending class A.
class B extends A {
  B() {
    System.out.println("Constructing B.");
  }
}

// Create another subclass by extending B.
class C extends B {
  C() {
    System.out.println("Constructing C.");
  }
}

class ABC {
  public static void main(String[] args) {
    C c = new C();
  }
}
// see OrderOfConstruction.java