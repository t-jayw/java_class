class Test
{
	int a; // instance variable or field with "state"

	Test(int i)
	{
		a = i;
	}

	Test incrementByTen()
	{
		Test temp = new Test(a + 10);
		return temp;
	}
}
class ObjectReturnDemo
{
	public static void main(String[] args)
	{
		Test ob1 = new Test(2);
		//Test ob2 = null;
		Test ob2;

		ob2 = ob1.incrementByTen();
		System.out.println("ob1.a: " + ob1.a);
		System.out.println("ob2.a: " + ob2.a);

		ob2 = ob2.incrementByTen();
		System.out.println("ob2.a after second increase: " + ob2.a);

	}
}