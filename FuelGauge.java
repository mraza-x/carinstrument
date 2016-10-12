/**
Mohammed Raza
CSC 162 - Lab7 # 1 (class1)
*/

public class FuelGauge
{

   public int gal;
   public int maxgal;


   public FuelGauge()  // Default constructor
   {
		gal = 0;
		maxgal = 15;
   }

   public FuelGauge(int g) // Overloaded constructor
   {
		   gal = g;
   }


   public void setGallons(int g)  // Setting gallons
   {
		gal = g;
   }


   public int increaseGallons() // Increment gallons by 1
   {
      return gal ++;
   }

   public int decreaseGallons() // Decrement gallons by 1
   {
	   return gal --;
   }


   public String toString()
   {
	   String str = " ";
	   return str;
   }


}
