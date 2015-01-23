package abstraction.inheritance.exercise;

/**
 *
 * @author Dan Noonan
 */
public abstract class Word {
    
    private String word;
    
    public Word(String word) {
        this.word = word;
    }
    
    public String get() {
        return word;
    }
    
    public abstract String getPartOfSpeech();
    
}
