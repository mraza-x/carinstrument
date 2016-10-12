/**
Mohammed Raza
CSC 162 - Lab7 # 1 (class2)
*/

public class Odometer
{

   public int mileage;


   public Odometer() // Default constructor
   {
	   mileage = 0;
   }


   public Odometer(int m) // Overloaded constructor
   {
	   mileage = m;
   }


   public void setMileage(int m) // Set mileage
   {
      mileage = m;
   }


   public int getMileage() // Increase mileage
   {
      return mileage ++;
   }


   public String toString()
   {
	   String str = " ";
	   return str;
   }


}
