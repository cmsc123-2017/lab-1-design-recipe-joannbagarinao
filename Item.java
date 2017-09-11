class Item {
   double price;
   double sale;
  
  Item (double price, double sale) {
    this.price = price;
    this.saale = sale;
  }
  
  final int SALE_LIMIT 1000;

  double computeSalePrice(double price, double sale) {
    return price - (sale * price);
  }


  double salePrice1000(double price, double sale) {
     if (price > SALE_LIMIT) {
       return computeSalePrice(price, sale);
     } else {
       return price;
     }
  }
}
