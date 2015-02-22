class Waiter
{
  Waiter(String nationality)
  {
	  if(nationality == "French")
	  {
      	System.out.println("I am a French-speaking waiter");
	  }
	  if(nationality == "Italian")
	  {
			System.out.println("I am an Italian-speaking waiter");
	  }
  }
  Waiter(int yearsOfExperience)
  {
  	  if(yearsOfExperience > 3)
  	  {
        	System.out.println("I am a Senior-level waiter");
  	  }
  	  else
  	  {
  			System.out.println("I am a typical waiter");
  	  }
  }
  void bringWater()
  {
	  System.out.println("Yes Sir. Here's your water.");
  }
  void bringWine(int price)
  {
  	 if(price < 60)
  	 {
  	 	System.out.println("Here is your cheap wine.");
	 }
	 else
	 {
	   	System.out.println("Here is your expensive wine.");
	 }
  }
  void bringWine(String color)
  {
	 if(color=="red")
     {
        System.out.println("Here is your red wine, fine choice, Monsieur.");
	 }
     else
    {
      System.out.println("Here is your non-red wine - I wouldn't drink it, though.");
    }
  }
}

class CEOAtUpscaleRestaurant
{
	public static void main(String[] args)
	{
    	Waiter myWaiter1 = new Waiter("French");
    	myWaiter1.bringWater();
    	myWaiter1.bringWine("red");
        System.out.println();
    	Waiter myWaiter2 = new Waiter(6);
    	myWaiter2.bringWine(100);
        System.out.println();
    	Waiter myWaiter3 = new Waiter(2);
        myWaiter3.bringWine("rose");
	}
}




