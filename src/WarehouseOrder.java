
public class WarehouseOrder implements Order {

  	
  @Override
  public void validate() {
    System.out.println("Your order has been validated");
  }

  @Override
  public void process() {
    System.out.println("Order is shipping...");
    try {
		Thread.sleep(1000);
	} catch (InterruptedException e) {
		e.printStackTrace();
	}
    System.out.println("Order has been shipped...");
  }
}