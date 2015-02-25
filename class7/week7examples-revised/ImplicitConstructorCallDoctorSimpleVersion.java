class Doctor
{
   Doctor()
   {
      System.out.println("in the constructor of Doctor: I did 4 years in medical school");
   }
}

class Surgeon extends Doctor
{
   Surgeon()
   {
	  System.out.println("in the constructor of Surgeon: I did another 2 years");
   }
}

class HeartSurgeon extends Surgeon
{
   HeartSurgeon()
   {
	  System.out.println("in the constructor of HeartSurgeon: I did yet another 3 years");
   }
}

class ImplicitConstructorCallDoctorSimpleVersion
{
   public static void main(String[] args)
   {
	  HeartSurgeon hs = new HeartSurgeon();
   }
}