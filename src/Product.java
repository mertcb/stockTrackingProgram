
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
		if(capacity<0) {
			System.out.println("Capacity cannot be less than zero.");
			this.capacity = 0;
		}
		else{
			this.capacity = capacity;
		}
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
	public abstract double calculateActualPrice();
	public abstract void printInfo();
}	
