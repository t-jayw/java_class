class OverloadTest
{
	boolean isParameterlessContructor;
	int Salary;

	// constructor overload
	OverloadTest()
	{
		isParameterlessContructor = true;
		System.out.println("OverloadTest() constructor called " + isParameterlessContructor);
	}
	OverloadTest(int inputValueForSalary)
	{
		this(); // chaining the parameterless constructor
		this.Salary = inputValueForSalary;
		System.out.println("Salary is: " + this.Salary);
	}

	// method overload
	int getSalary()
	{
		return Salary;
	}
	int getSalary(int inputValueForBonus)
	{
		//Salary = i;
		return Salary + inputValueForBonus;
	}
	// boolean getSalary(int myInt) { } // comment out, why?
}
class OverloadTestDemo
{
	public static void main(String[] args)
	{
		OverloadTest ot1 = new OverloadTest();
		OverloadTest ot2 = new OverloadTest(77777);
		int s1 = ot1.getSalary();
		int s2 = ot2.getSalary(22222);
		System.out.println("s1 salary is " + s1);
		System.out.println("s2 salary plus bonus is " + s2);
	}
}