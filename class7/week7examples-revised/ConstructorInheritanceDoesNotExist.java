class Lawyer
{
  Lawyer(boolean b)
  {
    System.out.println("Boolean constructor for Lawyer " + b);
  }
}

class TaxAttorney extends Lawyer
{
  String name;
  TaxAttorney(String name)
  {
	super(2 + 2 == 4); // use super to refer to a superclass constructor
	System.out.println("I am a tax attorney named " + name);
  }
}

class ConstructorInheritanceDoesNotExist
{
  public static void main(String[] args)
  {
	Lawyer lw2 = new Lawyer(2 + 2 == 4); // call the boolean constructor with an expression that evaluates to true
	TaxAttorney ta = new TaxAttorney("TaxAttorney Joe");
	/*
		The subclass does NOT inherit constructors from its superclass. Therefore, the following code must be commented out. The compiler error is: "cannot find symbol
		symbol  : constructor TaxAttorney(boolean)"
	*/
	//TaxAttorney ta2 = new TaxAttorney(2 + 2 == 4); // call the boolean constructor
  }
}