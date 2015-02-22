/* Demonstrate java.util.Arrays.sort method
http://docs.oracle.com/javase/7/docs/api/java/util/Arrays.html#sort%28java.lang.Object[]%29 */
import java.util.*;

class ArraySorterforString
{
	void stringSorter()
	{
		System.out.println("Type a string and hit Enter (we will do this 3 times)");
		Scanner sc = new Scanner(System.in);
		String s1 = sc.next();
		System.out.println("Type a 2nd string and hit Enter");
		String s2 = sc.next();
		System.out.println("Type the final string and hit Enter");
		String s3 = sc.next();
		String[] arrayOfStrings = {s1, s2, s3};
		for(int i=0; i < arrayOfStrings.length; i++)
		{
		  System.out.print(arrayOfStrings[i] + " ");
		}

		Arrays.sort(arrayOfStrings);
		System.out.println("\nModified String array: ");
		for(int i=0; i < arrayOfStrings.length; i++)
		{
		  System.out.print(arrayOfStrings[i] + " ");
		}
	}
}

class ArraySortDemoWithScanner
{
  public static void main(String[] args)
  {
    ArraySorterforString asfs = new ArraySorterforString();
    asfs.stringSorter();
  }
}