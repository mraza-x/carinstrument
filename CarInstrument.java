
import java.util.Scanner;

/**
  Mohammed Raza
  CSC 162 - Lab7 #1 (main)
*/

public class CarInstrument
{
   public static void main(String[] args)
   {

	  int miles = 0;
	  int f = 0;
	  int addfuel;

	  Scanner keyboard = new Scanner(System.in);

	  System.out.print("Enter the starting mileage: ");
	  miles = keyboard.nextInt();

	  System.out.print("Enter the starting gallons: ");
      f = keyboard.nextInt();

      FuelGauge obj1 = new FuelGauge(f);

      Odometer obj2 = new Odometer(miles);

 	  System.out.println(" ");


 	  if (f > 0 && f <= 15)
 	  {

 	  		for (int LCV = 0; LCV <= f; LCV ++)
 	  		{

 	  			System.out.println("Mileage: " + obj2.getMileage());

      			System.out.println("Fuel Level: " + obj1.decreaseGallons());

      			System.out.println(" ");

	  		}
	 }

	 else if (f < 0)
	 {
	 			System.out.println("Error: Fuel level is 0. Please Increase fuel level.");

	 			System.out.println("Enter the amount of fuel to add: ");
	 			addfuel = keyboard.nextInt();

	 			FuelGauge obj3 = new FuelGauge(addfuel);

	 			if (addfuel > 0 && addfuel <= 15)
				{

				 	 for (int LCV = 0; LCV <= addfuel; LCV ++)
				 	 {

						obj3.increaseGallons();

				 	  	System.out.println("Mileage: " + obj2.getMileage());

				      	System.out.println("Fuel Level: " + obj1.decreaseGallons());

				      	System.out.println(" ");

					 }
	            }


	 }
	 else if (f > 15)
	 {
	 			System.out.println("Error: Fuel level is too high. Overflow.");
	 }



   }
}
