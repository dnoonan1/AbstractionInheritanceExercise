package abstraction.inheritance.exercise;

/**
 *
 * @author Dan Noonan
 */
public abstract class Hammer implements Tool {
    // other extensions include Sledgehammer, Warhammer
    
    public void use() {
        hammer();
    }
    
    // Hammers are for "hammering" (pounding, hitting, etc.).
    // Each subclass can implement it's method of hammering.
    public abstract void hammer();
    
}
