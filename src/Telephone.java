public class Telephone extends Product {

    private String model;
    private int modelYear;
    private int batteryPower;
    private double price;
    
	private Processor tel;

    public Telephone()
    {
    	super();
        setModel("Unknown");
        setModelYear(0);
        setBatteryPower(0);
        setPrice(0);
        this.tel=new Processor();
    }
    public Telephone(int ID,String name,String model, int modelYear, int batteryPower, double price,double speed,int numberOfProcessor) {
        super(ID,name,2);
    	this.model = model;
        this.modelYear = modelYear;
        this.batteryPower = batteryPower;
        this.price = price;
        this.tel = new Processor(speed,numberOfProcessor);
    }
    public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getModelYear() {
        return modelYear;
    }

    public void setModelYear(int modelYear) {
        this.modelYear = modelYear;
    }

    public int getBatteryPower() {
        return batteryPower;
    }

    public void setBatteryPower(int batteryPower) {
        this.batteryPower = batteryPower;
    }

   
    public void printInfo()
    {
        System.out.println(" Model: "+ model);
        System.out.println(" Model year: "+ modelYear);
        System.out.println(" Battery Power: "+batteryPower);
        System.out.println(" Price is: "+ calculateActualPrice());
        System.out.println(" Name of the Processor: "+tel.getName());
        System.out.println(" Processor Speed: "+tel.getSpeed());
        System.out.println(" Number of Processor: "+tel.getNumberOfProcessor());
        System.out.println();
    }
    @Override
    public double calculateActualPrice() {
    	return price*1.35;
    }
}
