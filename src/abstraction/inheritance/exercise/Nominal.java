package abstraction.inheritance.exercise;

/**
 *
 * @author Dan Noonan
 */
public abstract class Nominal extends Word {
    
    private Gender gender;
    private NominalCase nominalCase;
    private GrammaticalNumber number;
    
    public Nominal(String word, Gender gender, NominalCase nominalCase) {
        super(word);
        this.gender = gender;
        this.nominalCase = nominalCase;
    }
    
    public Gender getGender() {
        return gender;
    }

    public NominalCase getCase() {
        return nominalCase;
    }

    public GrammaticalNumber getNumber() {
        return number;
    }
    
}
