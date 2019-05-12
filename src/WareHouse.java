import java.util.*;
public class WareHouse implements Order
{	
	Scanner giris = new Scanner(System.in);
	private int warehouseCapacity;
	private int ID;
	private String name;
	private String address;
	ArrayList<Product> warehouse = new ArrayList<>();
	public WareHouse(){
		this.warehouseCapacity = 0;
		this.ID = 0;
		this.name = "Unknown";
		this.address = "Unknown";
	}
	public WareHouse(int ID,int warehouseCapacity,String name,String address) {
		this.warehouseCapacity = warehouseCapacity;
		this.ID = ID;
		this.name = name;
		this.address = address;
	}
	public int getWarehouseCapacity() {
		return warehouseCapacity;
	}
	public void setWarehouseCapacity(int warehouseCapacity) {
		this.warehouseCapacity = warehouseCapacity;
	}
	public int getID() {
		return ID;
	}
	public void setID(int ID) {
		this.ID = ID;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
 	
  @Override
  public boolean validate() {
    System.out.println("Your order has been validated");
    return true;
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
