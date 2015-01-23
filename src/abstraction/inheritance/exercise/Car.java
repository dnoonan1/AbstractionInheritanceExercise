package abstraction.inheritance.exercise;

/**
 *
 * @author Dan Noonan
 */
public class Car extends Automobile {
    // other extensions could be Truck or Bus
    
    private String model;
    private int year;
    
    public String getModel() {
        return model;
    }
    
    public int getYear() {
        return year;
    }
    
    @Override
    public void startIgnition() {
        // start the car
    }
    
    @Override
    public void turnOffIgnition() {
        // stop the car
    }
    
    public void runEngine() {
        // run this particular engine
    }
    
    public void signalTurn() {
        // blink turn signal
    }
    
    public void turn() {
        // turn the car
    }
    
}
