class ASuperClass
{
    boolean aVariable;
    int superInt = 17;

    void aMethod()
    {
		System.out.println("ASuperClass: the value of this.superInt: " + 	this.superInt);
		aVariable = true;
		System.out.println("ASuperClass: the value of this.aVariable: " + this.aVariable);
	}
}
class ASubclass extends ASuperClass
{
	boolean aVariable;
	int superInt;

	void aMethod()
	{
		System.out.println("ASubClass: the value of this.superInt: " + 	this.superInt);
		aVariable = true;
		System.out.println("ASubClass: the value of super.superInt: " + super.superInt);
		this.aVariable = false;
		super.aMethod(); // !
		System.out.println("ASubClass: the value of this.aVariable: " + this.aVariable);
		System.out.println("ASubClass: the value of super.aVariable: " + super.aVariable);
	}
}
class UseOfSuperDemo
{
	public static void main(String[] args)
	{
		ASuperClass superclass = new ASuperClass();
		ASubclass subclass = new ASubclass();
		System.out.println("superclass.aMethod() ");
		superclass.aMethod();
		System.out.println("subclass.aMethod() ");
		subclass.aMethod();
	}
}