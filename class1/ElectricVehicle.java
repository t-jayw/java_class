import java.util.Scanner;

class ElectricVehicle
{
    ElectricVehicle(int idNumber)
    {
        System.out.println("my ID number is " + idNumber);
    }
}

class ElectricVehicleDemo
{
    public static void main(String[] args)
    {
        Scanner myScanner = new Scanner(System.in);
        System.out.println("How many electric vehicles do you want?");
        int userResponse = myScanner.nextInt();

        for(int i = 0; i < userResponse; i++)
        {
            ElectricVehicle ev = new ElectricVehicle(i);
        }
    }
}

