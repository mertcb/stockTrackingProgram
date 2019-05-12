public class Computer extends Product
{
    private String model;
    private int ram;
    private double price;
    private ProcessorComputer proc;
    
    public Computer(){
    	super();
        this.model = "Unknown";
        this.ram = 0;
        this.price = 0;
        this.proc = null;
    }
    public Computer(int ID,String name,String model, int ram, double price,int numberOfProcessor,double speed) {
        super(ID,name,3);
    	this.model = model;
    	this.ram = ram;
        this.price = price;
        this.proc = new ProcessorComputer(numberOfProcessor,speed);
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
    public void printInfo(){
        System.out.println(" Model:"+model);
        System.out.println(" Ram "+ram);
        System.out.println(" Price"+price);
        System.out.println(" Processor Number:"+proc.getNumberOfProcessor());
        System.out.println(" Processor Speed:"+proc.getSpeed());
        System.out.println();
    }
    
    @Override
    public double calculateActualPrice() {
    	return price*1.18;
    }
}
