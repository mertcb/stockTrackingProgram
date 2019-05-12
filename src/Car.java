public class Car extends Product{
	   private int modelYear;
	    private String model;
	    private double topSpeed;
	    private double price;
	    private Engine eng; 

	    public Car() { 
	    	super();
	        setModelYear(0);
	        setModel("Unknown");
	        this.setTopSpeed(0.0);
	        this.setPrice(0.0);
	        this.eng = new Engine();
	    
	    }
	    public Car(int ID,String name,int modelYear, String model, double topSpeed, double price, Engine eng) {
	    	super(ID,name,20);
	        this.setModelYear(modelYear);
	        setModel(model);
	        this.topSpeed = topSpeed;
	        setPrice(price);
	        this.eng = eng;	        
	    }

	    public Engine getEng() {
	        return this.eng;
	    }
	    public void setEng(Engine parameterEng) {
	        this.eng = parameterEng;
	    }
	    public int getModelYear() {
	        return this.modelYear;
	    }
	    public void setModelYear(int modelYear) {
	        this.modelYear = modelYear;
	    }
	    public String getModel() {
	        return this.model;
	    }
	    public void setModel(String model) {
	        this.model = model;
	    }
	    public double getTopSpeed() {
	        return this.topSpeed;
	    }
	    public void setTopSpeed(double topSpeed) {
	        this.topSpeed = topSpeed;
	    }
	    public double getPrice() {
	        return this.price;
	    }
	    public void setPrice(double parameterPrice) {
	        if(parameterPrice<0.0) 
	            parameterPrice = 0.0;
	        this.price = parameterPrice;
	    }
	    public void printInfo(){
	        System.out.println("CAR INFO");
	        System.out.println("--------");
	        System.out.println("MODEL     : " + model);
	        System.out.println("YEAR      : " + modelYear);
	        System.out.println("TOP-SPEED : " + topSpeed);
	        System.out.println("PRICE     : " + price);
	        System.out.println("ENGINE    : ");
	        System.out.println("  -->VOLUME         : " + eng.getVolume());
	        System.out.println("  --># of CYLINDERS : " + eng.getNumberOfCylinders());
	        System.out.println();
	    }
	    @Override
	    public double calculateActualPrice() {
	    	return price*1.25;
	    }
	
}
