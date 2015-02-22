/* Demonstrate java.util.Arrays.sort method
http://docs.oracle.com/javase/7/docs/api/java/util/Arrays.html#sort%28java.lang.Object[]%29 */
import java.util.*;

class ArrayUtility
{
	void intSorter()
	{
		System.out.println("Type an integer and hit Enter (we will do this 3 times)");
		Scanner sc = new Scanner(System.in);
		int int1 = sc.nextInt();
		System.out.println("Type a 2nd integer and hit Enter");
		int int2 = sc.nextInt();
		System.out.println("Type the final integer and hit Enter");
		int int3 = sc.nextInt();
		int[] arrayOfInts = {int1, int2, int3};
		for(int i=0; i < arrayOfInts.length; i++)
		{
		  System.out.print(arrayOfInts[i] + " ");
		}

		Arrays.sort(arrayOfInts);
		System.out.println("\nModified String array: ");
		for(int i=0; i < arrayOfInts.length; i++)
		{
		  System.out.print(arrayOfInts[i] + " ");
		}
	}
}

class ArraySortDemoWithScannerForInt
{
  public static void main(String[] args)
  {
    ArrayUtility au = new ArrayUtility();
    au.intSorter();
  }
}