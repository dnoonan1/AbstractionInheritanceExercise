package abstraction.inheritance.exercise;

/**
 *
 * @author Dan
 */
public class Hammer extends HandTool {
    
    private int currentFunction; // ideally not an int, but for the exercise it
                                 // works
    
    private void setCurrentFunction(int currentFunction) {
        this.currentFunction = currentFunction;
    }
    
    public void use() {
        switch (currentFunction) {
            case 0:
                hitNail();
                break;
            case 1:
                removeNail();
                break;
            default:
                throw new IllegalStateException("Illegal value for "
                        + "currentFunction: " + currentFunction);
        }
    }
    
    public void hitNail() {
        // implement hitting a nail here
    }
    
    public void removeNail() {
        // implement removing a nail here
    }
    
}
