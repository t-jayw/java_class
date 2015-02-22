// Prerequisite: compile HumanResourceDemo.java
// The applyRaise method constrains the amount of the raise
class TopSpy
{
	protected int employeeId = 0;
	//protected int salary = 777777;
	private int salary = 777777;

	TopSpy(int employeeId)
	{
		this.employeeId = employeeId;
		System.out.println("The ID is: " + this.employeeId);
	}
	int getSalary()
	{
		return this.salary;
	}
	private void setSalary(int s)
    {
		this.salary = s;
	}
	protected void applyRaise()
	{
		salary *= 1.1;
	}
}

public class HumanResourceDemo2
{
	public static void main(String[] args)
	{
		TopSpy jamesBond = new TopSpy(007);
		System.out.println("The salary of James Bond is: " + jamesBond.getSalary());
		jamesBond.applyRaise();
		System.out.println("The salary of James Bond is: " + jamesBond.getSalary());
	}
}