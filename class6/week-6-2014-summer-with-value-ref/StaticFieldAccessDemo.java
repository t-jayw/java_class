// Assign a value to a static field.
class StaticField
{
  static int maximumStories  = 100; // a static field
}

class StaticFieldAccessDemo
{
  public static void main(String[] args)
  {
    System.out.println("The maximum number of stories in an Oakland skyscraper is "
    + StaticField.maximumStories);
  }
}