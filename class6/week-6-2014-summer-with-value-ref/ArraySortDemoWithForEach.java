class ArraySorterforString
{
    String[] arrayOfStrings = { "Ringo", "Paul", "John", "George" };
	void stringSorter()
	{
		System.out.println("Original String array: ");
		for(String s : arrayOfStrings)
		{
		  System.out.print(s + " ");
		}

		// sort the arrayOfStringsing array using the API for an object array sort
		// http://docs.oracle.com/javase/7/docs/api/java/util/Arrays.html#sort%28java.lang.Object[]%29
		java.util.Arrays.sort(arrayOfStrings);
		System.out.println("\nModified String array: ");
		for(int i=0; i < arrayOfStrings.length; i++)
		{
		  System.out.print(arrayOfStrings[i] + " ");
		}
	}
}
class ArraySorterForInt
{
    int[] arrayOfInts = { 100, 99, 9, 8 };
	void intSorter()
	{
		System.out.println("\n\nOriginal int array: ");
		for(int i : arrayOfInts)
		{
		  System.out.print(i + " ");
		}
		// sort the arrayOfInts array ascending using the method overload for int array sort
		// http://docs.oracle.com/javase/7/docs/api/java/util/Arrays.html#sort%28java.lang.Object[]%29
		java.util.Arrays.sort(arrayOfInts);
		System.out.println("\nModified int array: ");
		for(int i=0; i < arrayOfInts.length; i++)
		{
		  System.out.print(arrayOfInts[i] + " ");
		}
	}
}
// Instantiate the objects and call the method each object
class ArraySortDemoWithForEach
{
  public static void main(String[] args)
  {
    ArraySorterforString as = new ArraySorterforString();
    as.stringSorter();

    ArraySorterForInt isfi = new ArraySorterForInt();
    isfi.intSorter();
  }
}