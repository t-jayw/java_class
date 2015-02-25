/* abstract class (with an abstract method)
  Note: a use case for an abstract class is when  you can provide only SOME of the implementation. For example, Sacramento can provide the implementation for calculateStateSalesTax() but not the implementation for calculateCitySalesTax().
  The City of San Francisco could extend the abstract class that has an abstract method to calculateCitySalesTax. If there is no city sales tax, the implementation could be an empty code block.
*/
// keyword "abstract" - special qualifier
abstract class TwoDShape
{
  // declare fields
  private double width;
  private double height;
  private String name;

  // 4 overloaded constructor DEFINITIONS follow, that is, four uniques signatures.
  // A non-default parameterless constructor.
  TwoDShape()
  {
    width = height = 0.0;
    name = "null";
  }

  // Parameterized constructor.
  TwoDShape(double w, double h, String n)
  {
    width = w;
    height = h;
    name = n;
  }

  // Construct object with equal width and height. Note: iso-scelese means "equal -legs or -skeletons".
  TwoDShape(double x, String n)
  {
    width = height = x;
    name = n;
  }

  // Construct an object from an object.
  TwoDShape(TwoDShape ob)
  {
    width = ob.width;
    height = ob.height;
    name = ob.name;
  }

  // accessor (getter) methods for width and height return a value.
  double getWidth() { return width; }
  double getHeight() { return height; }

  // mutator (setter) methods take an value as input so they can change the value.
  void setWidth(double w) { width = w; }
  void setHeight(double h) { height = h; }

  String getName() { return name; }

  void showDim()
  {
    System.out.println("Width and height are " +
                       width + " and " + height);
  }

  // Now, getArea() is abstract.
  abstract double getArea();  // define a method with the return type of double, but this method has no code block. This method is abstract. A subclass of the abstract class must implement this method, which means the subclass must provide the code block that defines this method's logic.  No code block allowed here.
} // end of abstract class

// A subclass of TwoDShape for triangles.
class Triangle extends TwoDShape {
  private String style; // declare a field

  // My custom constructor with no arguments.
  Triangle()
  {
    super(); // call the TwoDShape constructor
    style = "null"; // add a field called style
  }

  // Constructor for Triangle.
  Triangle(String s, double w, double h)
  {
    super(w, h, "triangle");
    style = s; // set the style to the first runtime argument
  }

  // Construct an isosceles triangle.
  Triangle(double x)
  {
    super(x, "triangle"); // call superclass constructor
    style = "isosceles";
  }

  // Construct an object from an object.
  Triangle(Triangle ob) {
    super(ob); // pass object to TwoDShape constructor
    style = ob.style;
    // this.style = ob.style;    means the same thing
  }

  // implementation of the inherited method which was abstract in the superclass.
  // We MUST implement, but have the option of an empty code block.
  double getArea()
  {
     return getWidth() * getHeight() / 2;
  }

  void showStyle()
  {
    System.out.println("Triangle is " + style);
  }
} // end Triangle

// A subclass of TwoDShape for rectangles.
class Rectangle extends TwoDShape
{
  // A non-parameterized constructor, which replaces the default constructor.
  Rectangle()
  {
    super();
  }

  // Constructor for Rectangle.
  Rectangle(double w, double h) {
    super(w, h, "rectangle"); // call superclass constructor with the matching signature
  }

  // Construct a square.
  Rectangle(double x)
  {
    super(x, "rectangle"); // call superclass constructor with the matching signature
  }

  // Construct an object from an object.
  Rectangle(Rectangle ob)
  {
    super(ob); // pass object to TwoDShape constructor
  }

  boolean isSquare()
  {
    if(getWidth() == getHeight())
    {
		return true;
	}
	else
	{
    	return false;
	}
  }

  double getArea()
  {
    return getWidth() * getHeight();
  }
}

class AbstractShape
{
  public static void main(String[] args)
  {
    TwoDShape shapes[] = new TwoDShape[4]; // create am array called shapes that stores 4 elements of type TwoDShape

    // populate the array
    // store a Triangle object in the first element
    // A subclass is a specialization of its  superclass so it can be stored in an array of its superclass.
    shapes[0] = new Triangle("right", 8.0, 12.0);
    shapes[1] = new Rectangle(10);
    shapes[2] = new Rectangle(10, 4);
    shapes[3] = new Triangle(7.0);

    for(int i=0; i < shapes.length; i++)
    {
      System.out.println("object is " + shapes[i].getName());
      System.out.println("Area is " + shapes[i].getArea());
      System.out.println();
    }
  } // end main
} // end AbstractShape
