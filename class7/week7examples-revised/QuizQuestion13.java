// Demonstrate that a subclass array cannot store a superclass object
class QuizQuestion12
{
    public static void main(String[] args)
    {
		String[] myStringArray = new String[3];
		Object myObject = new Object();
		myStringArray[0] = myObject;
	}
}