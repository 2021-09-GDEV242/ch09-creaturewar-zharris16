import java.util.ArrayList;
import java.util.Iterator;

/**
 * This class is used to initiate the battle between creature armies.
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
    
    /**
     * Constructor for objects of class Battle
     */
    public Battle()
    {
        // initialise instance variables
        goodArmy = new ArrayList<Creature>();
        evilArmy = new ArrayList<Creature>();
        
        human = new Human();
        elf = new Elf();
        cyberdemon = new CyberDemon();
        balrog = new Balrog();
    }
    
    /**
     * The main for the Battle Class.
     * Conducts the logical applicaiton of combat.
     */
    public static void main(String args[]){
        Battle battleX = new Battle();
        
        int skirmishCounter = 0;
        
        battleX.populateGoodArmy();
        battleX.populateEvilArmy();
        
        Iterator<Creature> goodCreatureIter = (battleX.getGoodArmy()).iterator();
        Iterator<Creature> evilCreatureIter = (battleX.getEvilArmy()).iterator();
        
        Creature goodCreature = goodCreatureIter.next();
        Creature evilCreature = evilCreatureIter.next();
        
        System.out.println("Good Army size: " + battleX.getGoodArmy().size());
        System.out.println("Evil Army size: " + battleX.getEvilArmy().size());
        
        while(goodCreatureIter.hasNext() && evilCreatureIter.hasNext()){
            
            skirmishCounter++;
            
            System.out.println();
            System.out.println("\t - Battle " + skirmishCounter + " -");
            System.out.println("Current Good Army size: " + battleX.getGoodArmy().size());
            System.out.println("Current Evil Army size: " + battleX.getEvilArmy().size());
            
            int evilDamage = evilCreature.damage();
            int goodDamage = goodCreature.damage();
            
            goodCreature.takeDamage(evilDamage);
            evilCreature.takeDamage(goodDamage);
            
            System.out.println("*Both creatures have attacked*");
            
            if(goodCreature.isKnockedOut()){
                System.out.println("Current good creature got knocked out!");
                goodCreatureIter.remove();
                if(!goodCreatureIter.hasNext()){
                    System.out.println("The Good Army has fallen!");
                    System.exit(0);
                }else{
                    goodCreature = goodCreatureIter.next();
                }
            }
            if(evilCreature.isKnockedOut()){
                System.out.println("Current evil creature got knocked out!");
                evilCreatureIter.remove();
                if(!evilCreatureIter.hasNext()){
                    System.out.println("The Evil Army has fallen!");
                    System.exit(0);
                }else{
                    evilCreature = evilCreatureIter.next();
                }
            }
            
        }
        
        System.out.println();
        if(battleX.getGoodArmy().size() > battleX.getEvilArmy().size()){
            System.out.println("The Good Army won this war!");
            System.out.println("The Good army had " + battleX.getGoodArmy().size() + 
                                " remaining creatures");
        } else{
            System.out.println("The Evil Army won this war!");
            System.out.println("The Evil army had " + battleX.getEvilArmy().size() + 
                                " remaining creatures");
        }
        
    }
    
    /**
     * This method populates the Good Army consisting of Humans and Elfs
     */
    public void populateGoodArmy(){
        
        for(int i = 0; i < 100; i++){
            
            int randNum = Randomizer.nextInt(10)+1;
            
            if((randNum >= 1) && (randNum <= 6)){
                goodArmy.add(human);
            } else if((randNum >= 7) && (randNum <= 11)){
                goodArmy.add(elf);
            }
        }
    }
    
    
    /**
     * This method populates the Evil Army consisting of Humans, CyberDemons, and Balrogs
     */
    public void populateEvilArmy(){
        
        for(int i = 0; i < 50; i++){
            
            int randNum = Randomizer.nextInt(25)+1;
            
            if((randNum >= 1) && (randNum <= 15)){
                evilArmy.add(human);
            } else if((randNum >= 16) && (randNum <= 20)){
                evilArmy.add(cyberdemon);
            } else if((randNum >= 21) && (randNum <= 26)){
                evilArmy.add(balrog);
            }
        }
    }
    
    /**
     * Getter for ArrayList<Creature> goodArmy.
     * @return goodArmy - The ArrayList of creatures related to the Good Army.
     */
    public ArrayList<Creature> getGoodArmy(){
        return goodArmy;
    }
    
    /**
     * Getter for ArrayList<Creature> evilArmy.
     * @return evilArmy - The ArrayList of creatures related to the Evil Army.
     */
    public ArrayList<Creature> getEvilArmy(){
        return evilArmy;
    }

}
