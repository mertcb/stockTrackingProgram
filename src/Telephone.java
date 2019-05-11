public class Telephone extends Product {

    private String model;
    private int modelYear;
    private int batteryPower;
    private int priceOfTelephone;
    private Processor tel;

    public Telephone()
    {
    	super();
        setModel("Unknown");
        setModelYear(0);
        setBatteryPower(0);
        setPriceOfTelephone(0);
        this.tel=new Processor();
    }
    public Telephone(String model, int modelYear, int batteryPower, int priceOfTelephone) {
        this.model = model;
        this.modelYear = modelYear;
        this.batteryPower = batteryPower;
        this.priceOfTelephone = priceOfTelephone;
        this.tel= tel;
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

    public int getPriceOfTelephone() {
        return priceOfTelephone;
    }

    public void setPriceOfTelephone(int priceOfTelephone) {
        this.priceOfTelephone = priceOfTelephone;
    }
    public void printInfo()
    {
        System.out.println(" Model: "+ model);
        System.out.println(" Model year:"+ modelYear);
        System.out.println(" Battery Power: "+batteryPower);
        System.out.println(" Price is:"+priceOfTelephone);
        System.out.println(" Name of the Processor: "+tel.getName());
        System.out.println(" Processor Speed: "+tel.getSpeed());
        System.out.println(" Number of Processor: "+tel.getNumberOfProcessor());
        System.out.println();
    }
}
