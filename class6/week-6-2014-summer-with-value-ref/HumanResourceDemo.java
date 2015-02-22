// Human Resource application developers have full access
// to the code for the Salary class, including the setSalary method.
class Employee
{   // protected is a level between public and private
	protected int employeeId = 0;
	protected int salary = 0;

	Employee(int employeeId)
	{
		this.employeeId = employeeId; // assign value to field
		System.out.println("The ID is: " + this.employeeId); // access field value
	}

	protected void setSalary(int s)
	{
	  salary = s;
	}

	int getSalary()
	{
		return salary;
	}
}
public class HumanResourceDemo
{
	public Employee jamesBond = null; // any object can be a null object

	public static void main(String[] args)
	{
		Employee jamesBond = new Employee(007);
		jamesBond.setSalary(1000000);
		System.out.println("The salary of James Bond is: " + jamesBond.getSalary());
	}
}