// abstract class AbstractWithImplementation  - will compile
class AbstractWithImplementation  // will not compile
{
  // accessor (getter) methods for width and height.
  double getWidth() { return 0.0; }
  double getHeight() { return 0.0; }

  // mutator (setter) methods
  void setWidth(double w) { }
  void setHeight(double h) {  }

  String getName() { return ""; }

  void showDim() { }

  abstract double area(); // no implementation
}