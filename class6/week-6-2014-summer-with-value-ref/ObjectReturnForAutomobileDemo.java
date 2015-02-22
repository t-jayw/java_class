class Automobile
{
	int numberOfDoors; // instance variable or field with "state"

	Automobile(int i)
	{
		numberOfDoors = i;
	}

	Automobile incrementDoors()
	{
		Automobile myCar = new Automobile(numberOfDoors + 1);
		return myCar;
	}
}
class ObjectReturnForAutomobileDemo
{
	public static void main(String[] args)
	{
		Automobile ob1 = new Automobile(2);
		//Automobile ob2 = null;
		Automobile ob2;

		ob2 = ob1.incrementDoors();
		System.out.println("ob1.numberOfDoors: " + ob1.numberOfDoors);
		System.out.println("ob2.numberOfDoors: " + ob2.numberOfDoors);

		ob2 = ob2.incrementDoors();
		System.out.println("ob2.numberOfDoors after second increase: " + ob2.numberOfDoors);
	}
}