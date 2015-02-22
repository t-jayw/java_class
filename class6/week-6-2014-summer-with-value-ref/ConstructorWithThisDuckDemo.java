class Duck
{
	boolean hasWings;
	int weight = 1;
	String style = "normal";

	Duck()
	{
		hasWings = true;
		System.out.println("I am the basic duck with the default properties. Do I have wings? " + hasWings + ".");
	}
	Duck(int weight)
	{
		this();
		this.weight = weight;
		System.out.println("I am the duck whose weight is " + weight + ". Do I have wings? " + hasWings + ".");

	}
	Duck(String style)
	{
		this();
		this.style = style;
		System.out.println("I am the duck whose style is " + style + ". Do I have wings? " + hasWings + ".");
	}
}
class ConstructorWithThisDuckDemo
{
	public static void main(String[] args)
	{
		Duck myDuck = new Duck();
		Duck babyHuey = new Duck(200);
		Duck daffy = new Duck("zany");
	}
}