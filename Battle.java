import java.util.ArrayList;

/**
 * Thsi class is used to initiate the battle between creatrue armies.
 *
 * @author Zachary Harris
 * @version 11/11/21
 */
public class Battle
{
    // instance variables - replace the example below with your own
    private ArrayList<Creature> goodArmy;
    private ArrayList<Creature> evilArmy;
    
    private Human human;
    private Elf elf;
    private CyberDemon cyberdemon;
    private Balrog balrog;
    private Battle popGood;
    private Battle popEvil;
    
    /**
     * Constructor for objects of class Battle
     */
    public Battle()
    {
        // initialise instance variables
        popGood = new Battle();
        popEvil = new Battle();
        
        goodArmy = new ArrayList<Creature>();
        evilArmy = new ArrayList<Creature>();
        
        human = new Human();
        elf = new Elf();
        cyberdemon = new CyberDemon();
        balrog = new Balrog();
    }
    
    public void main(String args[]){
        populateGoodArmy();
        populateEvilArmy();
    
    }
    
    public void populateGoodArmy(){
        
        for(int i = 0; i < 100; i++){
            
            int randNum = Randomizer.nextInt(10)+1;
            
            if((randNum >= 1) && (randNum <= 6)){
                goodArmy.add(human);
            } else if((randNum >= 7) && (randNum <= 10)){
                goodArmy.add(elf);
            }
        }
    }
    
    public void populateEvilArmy(){
        
        for(int i = 30; i <= 50; i++){
            
            int randNum = Randomizer.nextInt(25)+1;
            
            if((randNum >= 1) && (randNum <= 15)){
                evilArmy.add(human);
            } else if((randNum >= 16) && (randNum <= 20)){
                evilArmy.add(cyberdemon);
            } else if((randNum >= 21) && (randNum <= 25)){
                evilArmy.add(balrog);
            }
        }
    }

}
