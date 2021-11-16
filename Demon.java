
/**
 * This class stores all attributes of Demon of type Creature.
 *
 * @author Zachary Harris
 * @version 11/15/21
 */
public class Demon extends Creature
{
    

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
    public int damage(){
        
        int outputDmg = Randomizer.nextInt(str);
        if(((Randomizer.nextInt(100) + 1) >= 1) && ((Randomizer.nextInt(100) + 1) <= 5)){
            outputDmg = outputDmg + 50;
        }
        
        return outputDmg;
    }
    
}
