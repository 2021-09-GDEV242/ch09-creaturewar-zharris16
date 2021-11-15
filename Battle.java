import java.util.ArrayList;
import java.util.Iterator;

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
    
    public static void main(String args[]){
        Battle battleX = new Battle();
        
        battleX.populateGoodArmy();
        battleX.populateEvilArmy();
        
        Iterator<Creature> goodCreatureIter = (battleX.getGoodArmy()).iterator();
        Iterator<Creature> evilCreatureIter = (battleX.getEvilArmy()).iterator();
        
        Creature goodCreature = goodCreatureIter.next();
        Creature evilCreature = evilCreatureIter.next();
        
        System.out.println("good army size: " + battleX.getGoodArmy().size());
        System.out.println("evil army size: " + battleX.getEvilArmy().size());
        while(goodCreatureIter.hasNext() && evilCreatureIter.hasNext()){
            
            goodCreature.takeDamage(evilCreature.damage());
            evilCreature.takeDamage(goodCreature.damage());
            
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
                System.out.println("Current evil creature got knocked!");
                evilCreatureIter.remove();
                if(!evilCreatureIter.hasNext()){
                    System.out.println("The Evil Army has fallen!");
                    System.exit(0);
                }else{
                    evilCreature = evilCreatureIter.next();
                }
            }
            System.out.println(battleX.getGoodArmy().size());
            System.out.println(battleX.getEvilArmy().size());
        }
        
    }
    
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
    
    public ArrayList<Creature> getGoodArmy(){
        return goodArmy;
    }
    
    public ArrayList<Creature> getEvilArmy(){
        return evilArmy;
    }

}
