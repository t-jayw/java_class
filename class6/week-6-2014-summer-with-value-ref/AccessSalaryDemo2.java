class AccessSalaryDemo2
{
  public static void main(String[] args)
  {
	    // For this class, see HumanResourceDemo2 and make sure it has been compiled
		TopSpy matahari = new TopSpy(99);
		System.out.println("The salary of Matahari is: " + matahari.getSalary());
		matahari.applyRaise();
		System.out.println("The salary of Matahari is: " + matahari.getSalary());
		//matahari.setSalary(999999);  // illegal
   }
}