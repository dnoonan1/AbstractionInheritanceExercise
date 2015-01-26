package abstraction.inheritance.exercise;

/**
 *
 * @author Dan Noonan
 */
public abstract class Nominal extends Word {
    
    private Gender gender;
    private GrammaticalCase grammaticalCase;
    private GrammaticalNumber number;
    
    public Nominal(String word, Gender gender, GrammaticalCase nominalCase) {
        super(word);
        this.gender = gender;
        this.grammaticalCase = nominalCase;
    }
    
    public Gender getGender() {
        return gender;
    }

    public GrammaticalCase getCase() {
        return grammaticalCase;
    }

    public GrammaticalNumber getNumber() {
        return number;
    }
    
}
