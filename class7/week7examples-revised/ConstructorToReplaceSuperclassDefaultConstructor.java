class Toyota
{
	String color;
	/* We need a customer constructor with the same signature as the default constructor
	   because the custom constructor that takes a string parameter has removed the default constructor,
	   and the subclass constructor always implicitly calls super().
	*/
	Toyota()
	{
		System.out.println("This Toyota constructor is parameterless, and is only here because the compiler is looking for the default contructor. By the way, right now the color is: " + this.color);
	}
	Toyota(String c)
	{
		super(); // by the way, this call is implicit, so we don't need to make it explicit
		color = c;
		System.out.println("Inside " + this.getClass() + " and the color is " + this.color);
	}
	String getColor()
	{
		System.out.println("Toyota color is " + color);
		System.out.println("Inside method getColor of " + this.getClass());
		return color;
	}
}

class PriusPlugInHybrid extends Toyota
{
	String color;
	/* The compiler will complain that it cannot find symbol  : constructor Toyota() unless we create it.
	   This is because the subclass implicitly calls super(), so the constructor that matches super()
	   must exist. It will either be the default constructor or a custom constructor with an empty parameter list.
	*/
	PriusPlugInHybrid(String c)
	{   // super(); this is implicit
		color = c;
		super.getColor();
		this.getColor();
	}
	String getColor()
	{
		System.out.println("Toyota PriusPlugInHybrid color is " + color);
		System.out.println("Inside method getColor of " + this.getClass());
		return color;
	}
}

class ConstructorToReplaceSuperclassDefaultConstructor
{
	public static void main(String[] args)
	{
		Toyota myCar = new Toyota("red");
		myCar.getColor();
		PriusPlugInHybrid myCar2 = new PriusPlugInHybrid("Green-Green-Green");
		myCar2.getColor();
	}
}