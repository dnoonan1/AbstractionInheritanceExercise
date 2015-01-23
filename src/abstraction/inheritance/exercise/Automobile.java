package abstraction.inheritance.exercise;

/**
 *
 * @author Dan Noonan
 */
public abstract class Automobile implements Vehicle {
    
    private double speed;
    
    public double getSpeed() {
        return speed;
    }
    
    // Implement Vehicle
    @Override
    public void startUp() {
        startIgnition();
    }
    
    @Override
    public void shutDown() {
        turnOffIgnition();
    }
    
    @Override
    public void accelerate() {
        // speed += someAmount;
    }
    
    @Override
    public void decelerate() {
        // speed -= someAmount;
    }
    
    @Override
    public void move() {
        runEngine();
    }
    
    // New Methods
    public abstract void startIgnition();
    public abstract void turnOffIgnition();
    public abstract void runEngine();
    public abstract void signalTurn();
    public abstract void turn();
    
}
