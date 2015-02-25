// Demonstrate overloaded calls to the overloaded superclass constructor,
// including isosolese constructor
class TwoDShape {
  private double width;
  private double height;

  // A constume constructor that looks like the default constructor, which no longer exists.
  TwoDShape() {
    width = height = 0.0;
  }

  // Parameterized constructor.
  TwoDShape(double w, double h) {
    width = w;
    height = h;
  }

  // Construct object with equal width and height.
  TwoDShape(double x) {
    width = height = x;
  }

  // Accessor methods for width and height.
  double getWidth() { return width; }
  double getHeight() { return height; }
  void setWidth(double w) { width = w; }
  void setHeight(double h) { height = h; }

  void showDim() {
    System.out.println("Width and height are " +
                       width + " and " + height);
  }
}

class Triangle extends TwoDShape {
  private String style;

  // A non-default constructor.
  Triangle() {
    super(); // call the constructor of the superclass
    style = "null";
  }

  // Constructor
  Triangle(String s, double w, double h) {
    super(w, h); // call superclass constructor

    style = s;
  }

  // Construct an isosceles triangle.
  Triangle(double x) {
    super(x); // call superclass constructor

    style = "isosceles";
  }

  double area() {
    return getWidth() * getHeight() / 2;
  }

  void showStyle() {
    System.out.println("Triangle is " + style);
  }
}

class Shapes5 {
  public static void main(String[] args) {
    Triangle t1 = new Triangle();
    Triangle t2 = new Triangle("right", 8.0, 12.0);
    Triangle t3 = new Triangle(4.0);

    t1 = t2; // assigning one reference to another reference. Both references refer to the same object.

    System.out.println("Info for t1: ");
    t1.showStyle();
    t1.showDim();
    System.out.println("Area is " + t1.area());

    System.out.println();

    System.out.println("Info for t2: ");
    t2.showStyle();
    t2.showDim();
    System.out.println("Area is " + t2.area());

    System.out.println();

    System.out.println("Info for t3: ");
    t3.showStyle();
    t3.showDim();
    System.out.println("Area is " + t3.area());

    System.out.println();
  }
}
