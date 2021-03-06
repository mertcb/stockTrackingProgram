public class Processor {

    private double Speed;
    private int numberOfProcessor;
    private String name;

    public Processor(){
    	super();
        this.Speed=0.0;
        this.numberOfProcessor=0;
        this.name="Unknown";
    }
    public Processor(double speed, int numberOfProcessor) {
    	Speed = speed;
        this.numberOfProcessor = numberOfProcessor;
    }

    public double getSpeed() {
        return Speed;
    }

    public void setSpeed(double speed) {
        Speed = speed;
    }

    public int getNumberOfProcessor() {
        return numberOfProcessor;
    }

    public void setNumberOfProcessor(int numberOfProcessor) {
        this.numberOfProcessor = numberOfProcessor;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
