/* Demonstrate that an array can store objects of its subclass but not of its superclass */
class Doctor {}
class HeartTransplantSurgeon extends Doctor
{
}
class DoctorArrayAcceptsSubclassDemo
{
  public static void main(String[] args)
  {
	Doctor[] myDoctorArray = new Doctor[3];
    HeartTransplantSurgeon hts = new HeartTransplantSurgeon();
    myDoctorArray[0] = hts;
	System.out.println(myDoctorArray[0].getClass());
	HeartTransplantSurgeon[] mySurgeonArray = new HeartTransplantSurgeon[3];
	Doctor wellbe = new Doctor();
    mySurgeonArray[0] = wellbe;
  }
}