class Carrier
{
  String name;
  Carrier(String name)
  {
    this.name = name;
  }
  void show()
  {
    System.out.println("Carrier class version of show() says Carrier is: " + name);
  }
}
class Number extends Carrier
{
  String num;
  String[] numSplit;

  Number(String name, String num)
  {
    super(name); // call the constructor of the superclass
    this.num = num; // 3
  }

  void show()
  {
    System.out.println("\nInside Number class version of show()");
    System.out.println("\nGoing to call super.show() from subclass show()");
    super.show(); // usage of super
    System.out.println("Number is: " + this.num); //usage of this
  }

  void convertNum()
  {
	  numSplit =  num.split("-");
	  for(String x : numSplit)
	  {
		  System.out.println("Number is broken into: " + x);
		  System.out.println("\nGoing to call super.show() from subclass convertNum()");
		  super.show();
		  this.show(); // usage of this
	  }
  }
}
class ThisAndSuperForMethodOverride
{
  public static void main(String[] args)
  {
	Number myCell1 = new Number("ATT", "111-222-3333");

    myCell1.show();
    myCell1.convertNum();

    Carrier myCell2 = new Carrier("Verizon");
    myCell2.show();
  }
}