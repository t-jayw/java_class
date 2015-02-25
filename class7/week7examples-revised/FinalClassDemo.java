final class Authentication
{
   void verifyPassword()
   {
	   System.out.println("this is a stub for user authentication");
   }
}

class SecurityBreach extends Authentication
{
	// hacker code here
}

class FinalClassDemo
{
   public static void main(String[] args)
   {
       SecurityBreach sb = new SecurityBreach();
   }
}