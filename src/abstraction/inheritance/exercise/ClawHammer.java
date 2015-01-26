package abstraction.inheritance.exercise;

/**
 *
 * @author Dan Noonan
 */
public class ClawHammer extends Hammer {
    
    // A claw hammer has two functions (uses):
    //   (1) pounding nails
    //   (2) removing nails
    private int currentFunction; // ideally not an int, but for the exercise it
                                 // works
    
    private void setCurrentFunction(int currentFunction) {
        this.currentFunction = currentFunction;
    }
    
    // Override to give ClawHammer two uses
    @Override
    public void use() {
        switch (currentFunction) {
            case 0:
                poundNail();
                break;
            case 1:
                removeNail();
                break;
            default:
                throw new IllegalStateException("Illegal value for property "
                        + "currentFunction: " + currentFunction);
        }
    }
    
    public void hammer() {
        poundNail();
    }
    
    public void poundNail() {
        // implement pounding a nail here
    }
    
    public void removeNail() {
        // implement removing a nail here
    }
    
}
