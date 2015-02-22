class Duck
{
	int weight;
	String style;

	Duck(String style)
	{
		this.style = style;
		System.out.println("I am the " + style + " duck.");
	}
	Duck(int weight)
	{
		this.weight = weight;
		System.out.println("I am the duck who weights " + weight + " kilograms.");
	}
}
class BabyHueyDemo
{
	public static void main(String[] args)
	{
		Duck donald = new Duck("Fighting Sailor");
		Duck daffy = new Duck("Zanny");
		Duck babyHuey = new Duck(200);
	}
}