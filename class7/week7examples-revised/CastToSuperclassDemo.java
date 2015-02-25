class Doctor {}
class HeartTransplantSurgeon extends Doctor
{
}
class CastToSuperclassDemo
{
  public static void main(String[] args)
  {
	Object[] myObjectArray = new Object[4];
    HeartTransplantSurgeon hts = new HeartTransplantSurgeon();
	Doctor wellbe = new Doctor();
    myObjectArray[0] = hts;
    myObjectArray[1] = wellbe;
    myObjectArray[2] = new String();
    myObjectArray[3] = (Object)new String();

    for(Object o : myObjectArray)
    {
		System.out.println(o.getClass());
	}

  }
}