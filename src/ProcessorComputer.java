public class ProcessorComputer
{
    private int numberOfProcessor;
    private double speed;
    
    public ProcessorComputer()
    {
        this.numberOfProcessor=0;
        this.speed=0.0;
    }

    public ProcessorComputer(int numberOfProcessor, double speed) {
    	this.numberOfProcessor = numberOfProcessor;
        this.speed = speed;
    }

    public int getNumberOfProcessor() {
        return numberOfProcessor;
    }

    public void setNumberOfProcessor(int numberOfProcessor) {
        this.numberOfProcessor = numberOfProcessor;
    }

    public double getSpeed() {
        return speed;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }
}
