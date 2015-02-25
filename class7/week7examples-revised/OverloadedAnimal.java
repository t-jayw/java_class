class Animal
{
	Animal(int x)
	{
		System.out.println("I have " + x + " legs");
	}
	Animal()
	{
		System.out.println("I am an ambigious animal");
	}
	void action(double y)
	{
		System.out.println("Animal jumps " + y + " times");
	}
	void  action(int z)
	{
		System.out.println("Woof, Woof " + z);
	}
	void action(double a, double b)
	{
		double c = a + b;
		System.out.println("Animal adds " + a + " " + " and " + " " + b + " " + "to get " + c);
	}
}

class OverloadedAnimal
{
   public static void main(String[] args)
   {
      Animal myAnimal1 = new Animal(4);
      Animal myAnimal2 = new Animal();
      myAnimal1.action(5.0);
      myAnimal1.action(2);
      myAnimal1.action(5.5, 7.9);
   }
}