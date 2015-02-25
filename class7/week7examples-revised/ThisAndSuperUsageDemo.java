abstract class Vehicle
{
	String color;

	abstract int getMaximumSpeed();
}
class ModelT extends Vehicle
{
	ModelT()
	{
		color = "Black";
		System.out.println("The ModelT Ford can be any color you want, as long is it's " + color
		+ ". \n\nFrom 1908 to 1920, the ModelT could run on gasoline or ethanol, so a corn farmer could distill his own fuel. Did John D. Rockefeller of Standard Oil fund the passage of Prohibition in 1920 to create a market for gasoline stations in rural areas?");
	}
	int getMaximumSpeed()
	{
		System.out.println("The maximum speed of the ModelT was 45 miles per hour, which is still the most fuel efficient speed for an automobile. The ModelT got 25 mpg, which is better than the current vehicle average of 21 mpg.");
		return 45;
	}
}
class Tbird extends ModelT
{
	int getMaximumSpeed()
	{
		System.out.println("The new maximum speed lowers the fuel efficiency to 3 miles per gallon.");
		return 120;
	}
	void useThisAndSuper()
	{
		System.out.println("\nThe old maximum speed was: " + super.getMaximumSpeed());
	    System.out.println("\nThe new maximum speed is: " + this.getMaximumSpeed());
	}
}
class ThisAndSuperUsageDemo
{
	public static void main(String[] args)
	{
		Tbird myTbird = new Tbird();  // superclass constructor called implicitly
		myTbird.useThisAndSuper();
	}
}