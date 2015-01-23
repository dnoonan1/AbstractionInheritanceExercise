package abstraction.inheritance.exercise;

/**
 *
 * @author Dan Noonan
 */
public class Noun extends Nominal {
    // Adjective is another extension of Nominal
    
    private static final String partOfSpeech = "n";
    
    public Noun(String word, Gender gender, NominalCase nominalCase) {
        super(word, gender, nominalCase);
    }
    
    public String getPartOfSpeech() {
        return partOfSpeech;
    }
    
}
