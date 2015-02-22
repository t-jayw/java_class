class PresidentsDay
{
	static String[][] firstAndLastName = {{"George", "Washington"},{"Abraham", "Lincoln"}};
}

class StaticArrayDemo
{
   public static void main(String[] args)
   {
	  for(int i = 0; i < PresidentsDay.firstAndLastName.length; i++)
	  {
			System.out.println(PresidentsDay.firstAndLastName[i][0]);
			System.out.println(PresidentsDay.firstAndLastName[i][1]);
	  }
   }
}