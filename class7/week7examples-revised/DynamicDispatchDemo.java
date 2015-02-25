/* Demonstrate dynamic method dispatch so that the superclass reference, supRef,
   can reference objects are various subclasses at runtime.
*/
class Sup
{
  void printWho()
  {
    System.out.println("printWho() in Sup");
  }
}

class Sub1 extends Sup
{
  void printWho()
  { // this method overrides the method of the same name and signature in the superclass
    System.out.println("printWho() in Sub1");
  }
}

class Sub2 extends Sup
{
  void printWho()
  {
    System.out.println("printWho() in Sub2");
  }
}

class DynamicDispatchDemo
{
  public static void main(String[] args)
  {
    Sup superOb = new Sup(); // constructing an object of type Sup
    Sub1 subOb1 = new Sub1(); // instantiate a Sub1 object called subOb1
    Sub2 subOb2 = new Sub2(); // instantiate a Sub2 object

    Sup supRef;  // declare a reference of type Sup

    supRef = superOb; //assignment to the superclass
    supRef.printWho(); // go to line 4

    supRef = subOb1;  // reassign supRef to be of type Sub1, so the superclass reference now refers to a subclass
    supRef.printWho(); // go to line 12

    supRef = subOb2;  // reassign to type Sub2
    supRef.printWho(); // go to line 20
  }
}