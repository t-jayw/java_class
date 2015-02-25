abstract class BusinessExpense
{
	void calculateShippingExpense(double shippingBillAmount) { };
	abstract double calculateSalesTax(double purchase1);
}

class BaseTax extends BusinessExpense
{
	public double baseTaxRate, baseTax, purchase1;

	BaseTax()
	{
		System.out.println("superclass needs a constructor that is similar to the default constructor by being parameterless");
	}
	BaseTax(double baseTaxRate)
	{
		// assign a value to the field
		this.baseTaxRate = baseTaxRate;
		System.out.println("Base Sales Tax in is " + baseTaxRate + " %");
	}
    // change return type from void to double
	double calculateSalesTax(double purchase1)
	{
		double baseTax = (baseTaxRate/100) * purchase1;
		System.out.println("You made a $" + purchase1 + " purchase, so the sales tax is $" + baseTax);
		return baseTax;
	}
}

class MontanaTax extends BaseTax
{
	public double rateMontana, montanaTax;
	// need a field for purchase amount
	double purchase1;
	double taxDifference;

	MontanaTax()
	{
		System.out.println("subclass needs a constructor that is similar to the default constructor by being parameterless");
	}
	MontanaTax(double rateMontana)
	{
		// assign a value to the field
		this.rateMontana = rateMontana;
		System.out.println("Sales Tax in Montana is " + rateMontana + " %");
	}
    // change return type from void to double
	double calculateSalesTax(double purchase1)
	{
		// assign value to the field
		this.purchase1 = purchase1;
		double montanaTax = (rateMontana/100) * purchase1;
		System.out.println("You made a $" + purchase1 + " purchase, so the sales tax is $" + montanaTax);
		return montanaTax;
	}
	/*void calculateTaxDifference()
	{
		//double taxDiff = this.calculateSalesTax() - super.calculateSalesTax();
	}*/
}

class TaxDifferenceDemoWithAbstract
{
	public static void main(String[] args)
	{
		BaseTax t1 = new BaseTax(5.0);
		MontanaTax t2 = new MontanaTax(6.0);
		double baseSalesTax = t1.calculateSalesTax(20.0);
		double specializedSalesTax = t2.calculateSalesTax(20.0);
		double taxDifference = specializedSalesTax - baseSalesTax;
		System.out.println("The difference in total tax amount is $" + taxDifference);
	}
}