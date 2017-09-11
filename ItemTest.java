import junit.framework.TestCase

public class Item extends TestCase {

 public void itemTestCreated() {
    Item s = new Item(800.0, 0.10);
    
    assertEquals(800.0, s.price);
    assertEquals(0.10, s.sale);
  }
  
  public void itemNoSale() {
    Item s = new Item(800.0, 0.10);
    
    assertEquals(800.0, salePrice1000(800.0, 0.10));
  }
  
  public void itemSale() {
    Item s = new Item(1500.0, 0.10);
    
    assertEquals(1350.0, salePrice1000(1500, 0.10));
  }
    
}
