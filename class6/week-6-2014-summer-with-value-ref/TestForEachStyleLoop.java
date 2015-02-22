class TestForEachStyleLoop
{
  public static void main(String[] args)
  {
      String[] daysOfWeek = {"S","M","T","W","R","F","ST"};

      for(String x : daysOfWeek)
      {
         System.out.println(x.toLowerCase());
      }
    }
}