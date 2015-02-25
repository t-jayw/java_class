// Field value inherited from the nearest superclass,
// so output says myHybridSportsCar.numberOfPassengers 2
abstract class Automobile
{
	int numberOfWheels = 4;
	int numberOfPassengers = 4;
	int milesPerGallon;

	abstract void propelVehicle();
}
class HybridAutomobile extends Automobile
{
	// no need to reassign the value of numberOfWheels or numberOfPassengers
	int milesPerGallon = 50;
	void propelVehicle()
	{
		System.out.println("A hybrid uses both battery and gasoline.");
	}
}
class HybridSportsCar extends HybridAutomobile
{
	int milesPerGallon = 40;
	int numberOfPassengers = 2;
	// no need to override the propelVehicle method
}
class HybridSportsCarLuxuryModel extends HybridSportsCar
{
	HybridSportsCarLuxuryModel()
	{
		System.out.println("HybridSportsCarLuxuryModel is the same as its superclass except the seats are more comfortable.");
	}
	// no need to override the propelVehicle method
	// add something to the car to make it more expensive
}
class ElectricAutomobile extends Automobile
{
	int milesPerGallon = 9999; // essentially infinite
	void propelVehicle()
	{
		System.out.println("An electric uses no gasoline.");
	}
}

class InheritMostImmediateDemo
{
	public static void main(String[] args)
	{
		HybridAutomobile myHybrid = new HybridAutomobile();
		HybridSportsCar myHybridSportsCar = new HybridSportsCar();
		HybridSportsCarLuxuryModel myHybridSportsCarLuxuryModel = new HybridSportsCarLuxuryModel();
		ElectricAutomobile myElectricAutomobile = new ElectricAutomobile();

		System.out.println("\nmyHybrid.numberOfWheels " + myHybrid.numberOfWheels + "\nmyHybrid.numberOfPassengers " + myHybrid.numberOfPassengers + "\nmyHybrid.milesPerGallon " + myHybrid.milesPerGallon);
		myHybrid.propelVehicle();

		System.out.println("\nmyHybridSportsCar.numberOfWheels " + myHybridSportsCar.numberOfWheels + "\nmyHybridSportsCar.numberOfPassengers " + myHybridSportsCar.numberOfPassengers + "\nmyHybridSportsCar.milesPerGallon " + myHybridSportsCar.milesPerGallon);
		myHybridSportsCar.propelVehicle();


		System.out.println("\nmyHybridSportsCarLuxuryModel.numberOfWheels " + myHybridSportsCarLuxuryModel.numberOfWheels + "\nmyHybridSportsCarLuxuryModel.numberOfPassengers " + myHybridSportsCarLuxuryModel.numberOfPassengers + "\nmyHybridSportsCarLuxuryModel.milesPerGallon " + myHybridSportsCarLuxuryModel.milesPerGallon);
		myHybridSportsCarLuxuryModel.propelVehicle();

		System.out.println("\nmyElectricAutomobile.numberOfWheels " + myElectricAutomobile.numberOfWheels + "\nmyElectricAutomobile.numberOfPassengers " + myElectricAutomobile.numberOfPassengers + "\nmyElectricAutomobile.milesPerGallon " + myElectricAutomobile.milesPerGallon);
		myElectricAutomobile.propelVehicle();
	}
}