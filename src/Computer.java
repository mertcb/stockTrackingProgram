public class Computer extends Product
{
    private String model;
    private String modelOfChipSet;
    private String nameOfChipSet;
    private int ram;
    private int price;
    private ProcessorComputer proc;
    
    public Computer(){
    	super();
        this.model = "Unknown";
        this.modelOfChipSet = "Unknown";
        this.nameOfChipSet = "Unknown";
        this.ram = 0;
        this.price = 0;
        this.proc = null;
    }
    public Computer(int ID,String name,String model, String modelOfChipSet, String nameOfChipSet, int ram, int price) {
        super(ID,name,3);
    	this.model = model;
        this.modelOfChipSet = modelOfChipSet;
        this.nameOfChipSet = nameOfChipSet;
        this.ram = ram;
        this.price = price;
        this.proc= proc	;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getModelOfChipSet() {
        return modelOfChipSet;
    }

    public void setModelOfChipSet(String modelOfChipSet) {
        this.modelOfChipSet = modelOfChipSet;
    }

    public String getNameOfChipSet() {
        return nameOfChipSet;
    }

    public void setNameOfChipSet(String nameOfChipSet) {
        this.nameOfChipSet = nameOfChipSet;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
    public void PrintComputer(){
        System.out.println(" Model:"+model);
        System.out.println(" Name of Chip set: "+nameOfChipSet);
        System.out.println(" Model of Chip set:"+modelOfChipSet);
        System.out.println(" Ram "+ram);
        System.out.println(" Price"+price);
        System.out.println(" Processor Number:"+proc.getNumberOfProcessor());
        System.out.println(" Processor Speed:"+proc.getSpeed());
        System.out.println();
    }
}
