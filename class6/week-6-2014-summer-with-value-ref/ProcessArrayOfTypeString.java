class ProcessArrayOfTypeString
{
  public static void main(String[] args)
  {
    char[] helloArrayOfChars = { 'h', 'e', 'l', 'l', 'o', '.'};
    String helloString = new String(helloArrayOfChars);

	String secondString = "goodbye";
	String[] myStringArray = {helloString, secondString, "good night", "Cecilia"};

	int i = 0;
	for(int counter = 0; counter < myStringArray.length; counter++)
	{
		System.out.println("String is: " + myStringArray[counter]);
		System.out.println("The char is: " + myStringArray[counter].charAt(1));
		System.out.println("Unicode code point for the second letter is " + myStringArray[counter].codePointAt(1));
		i++;
	}
  }
}

