   Preview changes
1
import junit.framework.TestCase;
2
3
/**
4
 * A JUnit test case class.
5
 * Every method starting with the word "test" will be called when running
6
 * the test with JUnit.
7
 */
8
public class JeepneyTripTest extends TestCase {
9
  
10
  /**
11
   * A test method.
12
   * (Replace "X" with a name describing the test.  You may write as
13
   * many "testSomething" methods in this class as you wish, and each
14
   * one will be called when running JUnit over this class.)
15
   */
16
  public void testTripCreated() {
17
    JeepneyTrip t = new JeepneyTrip(5, 5, 3);
18
    
19
    assertEquals(5.0, t.distance);
20
    assertEquals(5, t.totalPassengers);
21
    assertEquals(3, t.discountPassengers);
22
  }
23
  
24
  public void testChangeNoDiscount() {
25
    JeepneyTrip t = new JeepneyTrip(5, 1, 0);
26
    
27
    assertEquals(3.0, t.fareChange(10));
28
  }
29
  
30
  public void testChangeDiscount() {
31
    JeepneyTrip t = new JeepneyTrip(5, 1, 1);
32
    
33
    assertEquals(4.0, t.fareChange(10));
34
  }
35
}
36
​
@joannbagarinao
Commi
