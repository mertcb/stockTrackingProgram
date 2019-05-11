
public abstract class Product {
	protected final int ID;
	protected String name;
	protected final int capacity;
	
	public Product() {
		this.ID = 0;
		this.capacity = 0;
		this.name = "Unknown";
	}
	public Product(int ID,String name,int capacity){
		this.ID = ID;
		this.name = name;
		this.capacity = capacity;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getID() {
		return ID;
	}

	public int getCapacity() {
		return capacity;
	}
	
	
}	
