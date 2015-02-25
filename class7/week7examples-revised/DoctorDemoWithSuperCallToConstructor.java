class Doctor
{
  Doctor()
  {
    System.out.println("Constructing a generic Doctor.");
  }
  Doctor(String title)
  {
      System.out.println("Constructing a generic Doctor with the title " + title);
  }
}
class Surgeon extends Doctor
{
  Surgeon()
  {
	super("SuperDoc");
    System.out.println("Constructing Surgeon.");
  }
}
class HeartSurgeon extends Surgeon
{
  HeartSurgeon()
  {
	super();
    System.out.println("Constructing HeartSurgeon.");
  }
}
class HeartTransplantSurgeon extends HeartSurgeon {
	HeartTransplantSurgeon()
	{
		super();
		System.out.println("Constructing HeartTransplantSurgeon");
  }
}
class DoctorDemoWithSuperCallToConstructor
{
  public static void main(String[] args)
  {
    HeartTransplantSurgeon hts = new HeartTransplantSurgeon();
  }
}
// see OrderOfConstruction.java