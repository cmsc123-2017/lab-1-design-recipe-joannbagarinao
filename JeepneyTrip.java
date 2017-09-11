class JeepneyTrip {
  double distance;
  int totalPassengers;
  int discountPassengers;
  
  // constants
  final int BASE_KM = 5;
  
  
  JeepneyTrip(double distance, int totalPassengers, int discountPassengers) {
    this.distance = distance;
    this.totalPassengers = totalPassengers;
    this.discountPassengers = discountPassengers;
  }
  
  double fareChange(double payment) {
    if (distance = BASE_KM &&
        totalPassengers = 1 &&
        discountPassengers = 0) {   
      return payment - 7;
    } else
        if (distance = BASE_KM &&
            totalPassengers = 1 &&
            discountPassengers = 1) {   
      return payment - 6;
    } else 
       if (distance = BASE_KM &&
           totalPassengers > 1 &&
           discountPassengers = 0) {   
      return payment - (7 × totalPassengers);
    } else
       if (distance = BASE_KM &&
           totalPassengers > 1 &&
           discountPassengers = 1) {   
      return payment - (6 × totalPassengers);
    } else {   
      return 0;
    }
  }
}
