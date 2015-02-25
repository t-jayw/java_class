class Test
{
  int x,y;
  int i,k;

  Test(int x, int y)
  {
    System.out.println("entered the 2-param constructor");
    this.x = x;
    this.y = y;
  }

  Test(int x, int y, int i, int k)
  {
    this(x,y);// Must be in first line
    System.out.println("called the this constructor to avoid redundant code");
    this.i = i;
    this.k = k;
    System.out.println("added 2 assignments");
    System.out.println(x + y + i + k);
  }
}

class ThisConstructorDemo
{
   public static void main(String[] args)
   {
      Test myTest = new Test(1,2,3,4);
   }
}