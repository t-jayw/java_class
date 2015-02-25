/* Demonstrate the mechanism that ensures proper initialization, namely,
   an implicit call to the highest available superclass, through the
   entire inheritence hierarchy. */
class HumanBeing
{
	// inalienable properties
	boolean life;
	boolean liberty;
	boolean pursuitOfHappiness;
	// alienable properties?
	int numberOfEyes;
	int numberOfFingers;
	boolean rich;
	boolean famous;

	HumanBeing()
	{
		life = true;
		liberty = true;
		pursuitOfHappiness = true;
		System.out.println("The value of life is set to " + life);
		numberOfEyes = 2;
		numberOfFingers = 10;
		System.out.println("This HumanBeing object has the following number of eyes and fingers: "
		+ numberOfEyes + " " + numberOfFingers);
	}

}
class BusinessMagnate extends HumanBeing
{
	BusinessMagnate()
	{
		rich = true;
		famous = true;
		System.out.println("To be a business magnate, you only need two attributes or properties "
		+ "to be true: rich and famous");
	}
}
class HumanBeingDemo
{
	public static void main(String[] args)
	{
		BusinessMagnate steveJobs = new BusinessMagnate();
		System.out.println("As a business magnate, was Steve Jobs famous?: " + steveJobs.famous);
		HumanBeing thomas = new HumanBeing();
		System.out.println("As a human being, is thomas famous?: " + thomas.famous);
	}
}