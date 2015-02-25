class Animal
{
  Animal()
  {
	  System.out.println("Animal Constructor");
	  // constructor calling an overridable method
	  this.printLog("cannot know that finShape = square");
  }
  // not final, so overridable
  void printLog(String s)
  {
      System.out.println("Unused Text");
  }
}
class Fish extends Animal
{
	/* initialization ignored unless static */
	String finShape = "square";
	static String myStaticColor = "red";

	Fish()
	{
	  System.out.println("Fish constructor - finShape is " + finShape);
	  finShape = "fork";
	}
	void printLog(String s)
	{
	  System.out.println("overridden method - finShape is " + this.finShape + " and myStaticColor is " + myStaticColor);
    }
}
class ConstructorShouldNotCallOverridableMethodDemo
{
  public static void main(String... aArgs)
  {
     Fish myFish = new Fish();
     System.out.println("In main, the finShape is " + myFish.finShape);
  }
}