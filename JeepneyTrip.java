class JeepneyTrip {
  double distance;
  int totalPassengers;
  int discountPassengers;
  
  // constants
  final int BASE_KM = 5;
  final double BASE_FARE = 7.0;
  final double DISCOUNTED_FARE = 6.0;
  final double EXCESS_FARE = 0.5;
  
  
  JeepneyTrip(double distance, int totalPassengers, int discountPassengers) {
    this.distance = distance;
    this.totalPassengers = totalPassengers;
    this.discountPassengers = discountPassengers;
  }
  
  double excessDistance(double distance) {
     if (distance <= BASE_KM) {
         return 0;
     } else {
         return distance - BASE_KM;
     }
   }

  double computeFare(int totalPassengers, double fare, double distance) {
     return totalPassengers * (fare + (excessDistance(distance) * EXCESS_FARE)) ;
   }

  double totalFare(int totalPassengers, int discountPassengers, double distance) {
     return computeFare(totalPassengers - discountPassengers, BASE_FARE, distance)
          + computeFare(discountPassengers, DISCOUNTED_FARE, distance);
   }

   double fareChange(double payment) {
      return payment - totalFare(totalPassengers, discountPassengers, distance);
   } 
}
