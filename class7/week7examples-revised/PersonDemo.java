class Person
{
   String name = "";
   int ssn = 0;
   Person(String name)
   {
      this.name = name;
   }
   Person(int ssn)
   {
      this.ssn = ssn;
   }
}
class Doctor extends Person
{
   Doctor(String name)
  {
      super(name);
   }

   Doctor(int socialSecurityNumber)
   {
      super(socialSecurityNumber);
   }
}
class PersonDemo
{
   public static void main(String[] args)
   {
      Doctor drwatson = new Doctor("Watson");
      drwatson.ssn = 001331234;
      System.out.println(drwatson.name + ": " + drwatson.ssn);

      Doctor drpepper = new Doctor(823556789);
      drpepper.name = "Soft Drink";
      System.out.println(drpepper.name + ": " + drpepper.ssn);
   }
}