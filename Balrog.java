
/**
 * This class stores all attributes of Balrog of type Creature.
 *
 * @author Zachary Harris
 * @version 11/15/21
 */
public class Balrog extends Demon
{
    // instance variables - replace the example below with your own
    private static final int MAX_BALROG_HP = 200;
    private static final int MIN_BALROG_HP = 80;
    private static final int MAX_BALROG_STR = 100;
    private static final int MIN_BALROG_STR = 50;

    /**
     * Constructor for objects of class Balrog
     */
    public Balrog()
    {
        super(Randomizer.nextInt(MAX_BALROG_HP-MIN_BALROG_HP)+MIN_BALROG_HP,    
            Randomizer.nextInt(MAX_BALROG_STR-MIN_BALROG_STR)+MIN_BALROG_STR
        );
    }
    
    /**
     * This method doubles the Balrogs outputed damage
     */
    public int damage(){
        
        int outputDmg = Randomizer.nextInt(str);
        outputDmg = outputDmg * 2;
        
        return outputDmg;
    }

}
