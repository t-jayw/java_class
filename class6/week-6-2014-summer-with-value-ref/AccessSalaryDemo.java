// Public vs private access.
class Salary
{
  private int salary = 77000; // no other class can set the salary

  int getSalary()
  {
    return salary;
  }
}
// Demonstrate that a private variable is not visible outside its class
class AccessSalaryDemo
{
  public static void main(String[] args)
  {
    Salary ob = new Salary();

    /* Access to alpha is allowed only through
       its accessor methods. */
    ob.getSalary();
    System.out.println("ob.getSalary returns this value: " + ob.getSalary());

    /* The compiler error is:
    * error: salary has private access in Salary */
    //ob.salary = 100000; // comment out this line!
   }
}