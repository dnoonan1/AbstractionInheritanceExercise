package abstraction.inheritance.exercise;

/**
 *
 * @author Dan Noonan
 */
public class Pronoun extends Nominal {
    // other extensions include Noun, Adjective
    
    private static final String partOfSpeech = "pro.";
    
    public Pronoun(String word, Gender gender, GrammaticalCase nominalCase) {
        super(word, gender, nominalCase);
    }
    
    public String getPartOfSpeech() {
        return partOfSpeech;
    }
    
}
