
/**
 * Write a description of class Balrog here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Balrog extends Demon
{
    // instance variables - replace the example below with your own
    private static final int MAX_BALROG_HP = 30;
    private static final int MIN_BALROG_HP = 10;
    private static final int MAX_BALROG_STR = 18;
    private static final int MIN_BALROG_STR = 5;

    /**
     * Constructor for objects of class Balrog
     */
    public Balrog()
    {
        super(Randomizer.nextInt(MAX_BALROG_HP-MIN_BALROG_HP)+MIN_BALROG_HP,    
            Randomizer.nextInt(MAX_BALROG_STR-MIN_BALROG_STR)+MIN_BALROG_STR
        );
    }
    
    public int damage(){
        
        int outputDmg = Randomizer.nextInt(str);
        outputDmg = outputDmg * 2;
        
        return outputDmg;
    }

}
