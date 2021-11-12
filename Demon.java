
/**
 * Write a description of class Demon here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Demon extends Creature
{
    // instance variables - replace the example below with your own
    

    /**
     * Constructor for objects of class Demon
     */
    public Demon(int str, int hp)
    {
        super(str, hp);
    }
    
    /**
     * Allows a creature to determine how much damage it is causing in this round of battle
     * @return a value between 1 and str to be used to cause damage to another creature
     */
    
    
    public int attack(){
        
        int outputDmg = Randomizer.nextInt(str);
        if(((Randomizer.nextInt(100) + 1) >= 1) && ((Randomizer.nextInt(100) + 1) <= 5)){
            outputDmg = outputDmg * 2;
        }
        
        return outputDmg;
    }
    
}
