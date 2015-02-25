/* Demonstrate that an array can store objects of its subclass but not of its superclass */
class Doctor {}
class HeartTransplantSurgeon extends Doctor
{
}
class DoctorArrayDemo
{
  public static void main(String[] args)
  {
    HeartTransplantSurgeon hts = new HeartTransplantSurgeon();
    Doctor[] mySuperClassArray = {hts};
    Doctor drWellBe = new Doctor();
    HeartTransplantSurgeon[] mySubClassArray = {drWellBe};
  }
}