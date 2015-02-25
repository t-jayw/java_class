class Doctor
{
   Doctor()
   {
      System.out.println("in the constructor of Doctor");
   }

   void makeMoney()
   {
      System.out.println("in Doctor's method");
   }
}

class Surgeon extends Doctor
{
   void makeMoney(int wealth)
   {
      System.out.println("in Surgeon's method with the following number of wealth: " + wealth);
   }
}

class HeartSurgeon extends Surgeon
{
   void makeMoney(int wealth)
   {
      System.out.println("in HeartSurgeon's method with the following number of wealth: " + wealth *3);
   }
}

class ImplicitConstructorCallDoctor
{
   public static void main(String[] args)
   {
      Doctor doctor1 = new Doctor();
      doctor1.makeMoney();
      System.out.println("Before the call the Surgeon constructor ... ");
      Surgeon doctor2 = new Surgeon(); // implicit call to Doctor() to enforce inheritence
      System.out.println("... After the call to the Surgeon constructor");
      doctor2.makeMoney(900000);
	  HeartSurgeon doctor3 = new HeartSurgeon(); // implicit call to Doctor() to enforce inheritence
	  System.out.println("... After the call to the HeartSurgeon constructor");
      doctor3.makeMoney(900000);
   }
}