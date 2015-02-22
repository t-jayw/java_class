class SodaPop
{
	int size = 10;

	SodaPop(String syropType, String diluent)
	{
		System.out.println("constructing this sodapop object with concentrated syrop from headquarters and local liquid, namely, " + syropType + " and " + diluent);
	}

	SodaPop getSodaPop()
	{
		System.out.println("The size is " + this.size);
		return this;
	}
}
class ObjectReturnForSodaPopDemo
{
	public static void main(String[] args)
	{
		SodaPop drUlcer = new SodaPop("molasses", "muddyWater");

		System.out.println(drUlcer.getSodaPop());
		System.out.println(drUlcer.getSodaPop().getClass());
	}
}