class PopulateArrayWithNewStrings
{
   public static void main(String[] args)
   {
      String[] strs = {"Jack Nickolson's","movie","The Shinning","had a","famous","word:","ACTOR"};
      for(String s: strs) //using the for-each style for loop go thru entire array
      {
        System.out.print(s + " ");
	  }
      System.out.println("\n");

      //changing string values w/new values
      strs[0] = "Famous actor's";
      strs[1] = "cinema";
      strs[2] = "forgot the name:";
      strs[6] = "Movie Star:";

      for(int i=0;i<3;i++) //only printing out first 3 strings of the array
      {
        System.out.print(strs[i] + " ");
	  }
      System.out.println("\n");

      for(String s: strs) //using the for-each style for loop go thru entire array
      {
        System.out.print(s + " ");
	  }
      System.out.println("\n");

      strs[6] = "Movie Star";  //changed last string in my array
      System.out.print(strs[6]+'\n');
   }
}

