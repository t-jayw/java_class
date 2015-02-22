/**************************************************************************************
 * Output:
 * Printing Week Days:
 * Sunday Monday Tuesday Wednesday Thursday Friday Saturday
 * Printing Abbreviated Week Days:
 * Sun Mon Tue Wed Thu Fri Sat
 * Splitting and printing a string into an array, based on ',' delimiter:
 * 12.45 33.25 487.12 98.85 95.65 458.74 65.36
 * 111-45-9999 a valid SSN format
 * 11-134-1234 not a valid SSN format
 * 111-34-1234 a valid SSN format
 **************************************************************************************/
public class StringAlong
{
	static String[] weekDays = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};
	static String csvNumbers = "12.45,33.25,487.12,98.85,95.65,458.74,65.36";

	static void printStrings(String[] array)
	{
		for (String s : array)
		{
			System.out.print(s + " ");
		}
		System.out.println();
	}

	static String[] truncateStrings(String[] array)
	{
		String[] ret = new String[array.length];

		// Had to use a For loop here and NOT a foreach loop because I need to have an index/increment variable
		for (int i = 0; i< array.length; i++)
		{
			ret[i] = array[i].substring(0, 3);
		}
		return ret;
	}

	static String formatSSN(String ssn)
	{
		String newSSN = new String();

		// Remove all non-digit characters from string
		// using the isDigit method of java.lang.Character
		for (int i = 0; i< ssn.length(); i++)
		{
			if (Character.isDigit(ssn.charAt(i)))
				newSSN = newSSN + ssn.charAt(i);
		}

		String fs = String.format("%s-%s-%s", newSSN.substring(0, 3), newSSN.substring(3, 5), newSSN.substring(5));
		return fs;
	}

	public static void main(String[] args)
	{

		System.out.println("Printing Week Days:");
		printStrings(weekDays);
		System.out.println("Printing Abbreviated Week Days:");
		printStrings(truncateStrings(weekDays));
		System.out.println("Splitting and printing a string into an array, based on ',' delimiter:");
		printStrings(csvNumbers.split(","));

		String ssn = "111-45-9999";
		// using public boolean matches(String regex)
		System.out.printf("%s %s valid SSN format\n", ssn, ssn.matches("[0-9]{3}-[0-9]{2}-[0-9]{4}") ? "a" : "not a");
		ssn = "11-134-1234";
		System.out.printf("%s %s valid SSN format\n", ssn, ssn.matches("[0-9]{3}-[0-9]{2}-[0-9]{4}") ? "a" : "not a");

		String formattedSSN = formatSSN(ssn);
		System.out.printf("%s %s valid SSN format\n", formattedSSN, formattedSSN.matches("[0-9]{3}-[0-9]{2}-[0-9]{4}") ? "a" : "not a");
	}
}
