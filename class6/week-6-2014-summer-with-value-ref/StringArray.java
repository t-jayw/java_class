public class StringArray
{
    public static void main(String[] args)
    {
      String myString1 = "Jawa is an island of Indonesia.";
      String myString2 = myString1.toUpperCase();

      int i = myString1.length();
      int j = i-1;

      System.out.println("<<<<<<< original string >>>>>>");
      System.out.println(myString1);
      System.out.println();

      System.out.println("<<<<<<< in UPPER CASE >>>>>>");
      System.out.println(myString2);
      System.out.println();

      System.out.println("<<<< backwards and upper case >>>>");
      for(i=j; i>-1; i--)
         System.out.print(myString2.charAt(i));
   }
}