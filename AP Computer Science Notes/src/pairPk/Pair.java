package pairPk;

public class Pair
{
	
	double first;
	double second;
	
   /**
      Constructs a pair.
      @param aFirst the first value of the pair
      @param aSecond the second value of the pair
   */
   public Pair(double aFirst, double aSecond) {
	   
	  first = aFirst;
	  second = aSecond;
	  
   }

   /**
      Computes the sum of the values of this pair.
      @return the sum of the first and second values
   */
   public double getSum() {
	   
	   double sum = first + second;
	   return sum;
	   
   }
   
   /**
   Computes the difference of the values of this pair.
   @return the difference of the first and second values
*/
   public double getDifference() {
	   
	   double diff = first - second;
	   return diff;
	   
   }
   
   /**
   Computes the product of the values of this pair.
   @return the product of the first and second values
*/
   public double getProduct() {
	   
	   double product = first*second;
	   return product;
	   
   }

   /**
   Computes the average of the values of this pair.
   @return the average of the first and second values
*/
   public double getAverage() {
	   
	   double avg = (first + second)/2;
	   return avg;
	   
   }
   
   
   /**
   Computes the distance of the values of this pair.
   @return the distance of the first and second values
*/
   public double getDistance() {
	   
	   double distance = Math.abs(getDifference());
	   return distance;
	   
   }
   
   /**
   Determines the larger of the values of this pair.
   @return the larger of the first and second values
*/
   public double getMaximum() {
	   
	   double max = Math.max(first, second);
	   return max;
	   
   }
   
   /**
   Determines the smaller of the values of this pair.
   @return the smaller of the first and second values
*/
   public double getMinimum() {
	   
	   double min = Math.min(first, second);
	   return min;
	   
   }
}
