class Waiter
{
  Waiter()
  {
      System.out.println("I'm just a waiter now, but just you wait, some day, I'll be CEO and the waiters will wait on me!");
  }
  void bringWater()
  {
	  System.out.println("Yes Sir. Here's your water.");
  }
}

class CEO
{
	public static void main(String[] args)
	{
    	Waiter myWaiter = new Waiter();
    	myWaiter.bringWater();
	}
}




