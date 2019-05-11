public class WareHouse
{
	private int warehouseCapacity;
	private int ID;
	private String name;
	private String address;
	private Product proc;
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
}
