/* Demonstrate that a change to a referenced field can affect another referenced field while
primitives have only their immediate value */
class FieldTest
{
	int fieldX = 700;
	String color = "Red";
}
class ReferenceVersusValue
{
	public static void main(String[] args)
	{
		int a = 15;
		int b = 0;
		System.out.println("a and b before assigment: " +
		   a + " " + b);
		b = a; // passed the value
		System.out.println("a and b after assignment: " +
		   a + " " + b);
		b = -b;
		System.out.println("changing b does not affect a: " + a + " " + b);

		FieldTest myFieldTest = new FieldTest();
		FieldTest yourFieldTest = myFieldTest;
		System.out.println(myFieldTest.fieldX + " " + myFieldTest.color);
		System.out.println(yourFieldTest.fieldX + " " + yourFieldTest.color);
		System.out.println("changing a referenced field can affect another referenced field.");
		myFieldTest.fieldX = -700;
		yourFieldTest.color = "Green";
		System.out.println(myFieldTest.fieldX + " " + myFieldTest.color);
		System.out.println(yourFieldTest.fieldX + " " + yourFieldTest.color);
	}
}