package abstraction.inheritance.exercise;

/**
 *
 * @author Dan Noonan
 */
public abstract class Character {

    private String backstory;
    private String name;
    
    public String getBackStory() {
        return backstory;
    }
    
    public String getName() {
        return name;
    }
    
    public abstract void talk();
    
}
