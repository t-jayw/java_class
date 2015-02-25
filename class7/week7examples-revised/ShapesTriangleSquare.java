// A class for two-dimensional objects.
// THREE LEVELS OF VARIABLES
// AT THE CLASS LEVEL: STATIC VARIABLES
// AT THE INSTANCE LEVEL: PROPERTIES/ATTRIBUTES/INSTANCE VARIABLES
// WITHIN A METHOD, LOCAL VARIABLES
class TwoDShape {
  double width; // instance variables in the superclass
  double height;

  void showDim() {
    System.out.println("Width and height are " +
                       width + " and " + height);
  }
}

// A subclass of TwoDShape for triangles.
class Triangle extends TwoDShape {
  String style; // which type of triangle - instance variable

  // specialized behavior
  double area() {
    // properties inherited from the superclass
    return width * height / 2;
  }

  void showStyle() {
    System.out.println("Triangle is " + style);
  }
}

// A subclass of TwoDShape for rectangles.
class Rectangle extends TwoDShape {
  boolean isSquare() {
    if(width == height) return true;
    return false;
  }

  // specialized behavior
  double area() {
  // properties inherited from the superclass
    return width * height;
  }
}

class ShapesTriangleSquare {
  public static void main(String[] args) { // static means no instance required - at the class level, not the instance level
    Triangle t1 = new Triangle(); // call the default constructor
    Triangle t2 = new Triangle();
    Rectangle r1 = new Rectangle();

    t1.width = 4.0; // inherited from the superclass
    t1.height = 4.0;
    t1.style = "isosceles"; // not inherited

    t2.width = 8.0;
    t2.height = 12.0;
    t2.style = "right";

    System.out.println("Info for t1: ");
    t1.showStyle(); // defined in subclass
    t1.showDim(); // inherited from superclass
    System.out.println("Area is " + t1.area());

    System.out.println();

    System.out.println("Info for t2: ");
    t2.showStyle();
    t2.showDim();
    System.out.println("Area is " + t2.area());

    System.out.println();

    System.out.println("Info for r1: ");
    r1.width = 3;
    r1.height = 3;
    System.out.println("Area is " + r1.area() + " and is this rectangle a square?: " + r1.isSquare());
  }
}