public class Engine {
	 private double volume;
	    private int numberOfCylinders;

	    public double getVolume() {
	        return this.volume;
	    }
	    public void setVolume(double volume) {
	        this.volume = volume;
	    }
	    public int getNumberOfCylinders() {
	        return this.numberOfCylinders;
	    }
	    public void setNumberOfCylinders(int numberOfCylinders) {
	        this.numberOfCylinders = numberOfCylinders;
	    }
	    
	    public Engine() { 
	        this.volume = 0.0;
	        this.numberOfCylinders = 0;
	    }
	   
	    public Engine(double volumeParameter, int numberOfCylindersParameter) { 
	        this.setVolume(volumeParameter);
	        this.setNumberOfCylinders(numberOfCylindersParameter);
	    }
}
