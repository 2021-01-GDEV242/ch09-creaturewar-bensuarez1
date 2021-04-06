import java.util.ArrayList;

/**
 * Write a description of class War here.
 *
 * @author Ben Suarez
 * @version 2021-4-5 v1.0
 */
public class War
{
    // instance variables - replace the example below with your own
    private ArrayList<Creature> armyOne = new ArrayList<Creature>();
    private ArrayList<Creature> armyTwo = new ArrayList<Creature>();

    /**
     * Constructor for objects of class War - consisting of the fight, and the creation of both armies
     * return a War object with all values that represent the battle simulation.
     */
    public War()
    {
        // initialise instance variables
        CreateArmyOne(100);
        CreateArmyTwo(50);
        Fight();
    }

    /**
     * CreateArmyOne - The overall creation of the first army.
     * @param numberOfCreatures the total number of creatures in the first army.
     */
    private void CreateArmyOne(int numberOfCreatures)
    {
        // put your code here
        for(int i = 0; i < numberOfCreatures; i++){
            int temp = Randomizer.nextInt(10);
            if(temp <= 6){
                armyOne.add(new Human());
            }
            else if(temp <= 8){
                armyOne.add(new Elf());
            }
            else{
                armyOne.add(new Elf());
            }
        }
    }
    
    /**
     * CreateArmyTwo - The overall creation of the second army.
     * @param numberOfCreatures the total number of creatures in the second army.
     */
    private void CreateArmyTwo(int numberOfCreatures)
    {
        // put your code here
        for(int i = 0; i < numberOfCreatures; i++){
            int temp = Randomizer.nextInt(25);
            if(temp <= 18){
                armyOne.add(new Human());
            }
            else if(temp <= 24){
                armyOne.add(new CyberDemon());
            }
            else{
                armyOne.add(new Balrog());
                System.out.println("Beware of the Balrog!!");
            }
        }
    }
    
    /**
     * Fight - The overall code for the battle simulation betwen the two armies.
     * returns the victor (or draw) from the war.
     */
    public void Fight()
    {
        Creature armyOneCreature = null;
        Creature armyTwoCreature = null;
        boolean armyOneAlive = false;
        boolean armyTwoAlive = false;
        do
        {
            if((armyOneCreature == null) && (armyOne.size() > 0)) {armyOneCreature = armyOne.remove(0); armyOneAlive = armyOneCreature.isAlive();}
            if((armyTwoCreature == null) && (armyTwo.size() > 0)) {armyTwoCreature = armyTwo.remove(0); armyTwoAlive = armyTwoCreature.isAlive();}
            while(armyOneCreature.isAlive() && armyTwoCreature.isAlive()){
                armyOneCreature.takeDamage(armyTwoCreature.damage());
                armyTwoCreature.takeDamage(armyOneCreature.damage());
                String s = "\t";
                s += armyOneCreature.getClass();
                s += (armyOneCreature.isAlive()? "is still standing (":" has been killed (");
                s += ("Health: " + armyOneCreature.getHealth() + ")");
                s += "\t" + "::" + "\t";
                s += armyTwoCreature.getClass();
                s += (armyTwoCreature.isAlive()? "is still standing (":" has been killed (");
                s += ("Health: " + armyTwoCreature.getHealth() + ")");
                System.out.println(s);
            }
            if(armyOneCreature.isKnockedOut()) {armyOneAlive = armyOneCreature.isAlive(); armyOneCreature = null;}
            if(armyTwoCreature.isKnockedOut()) {armyTwoAlive = armyTwoCreature.isAlive(); armyTwoCreature = null;}
            System.out.println("Army One: " + armyOne.size() + "\t::\t" + "Army Two: " + armyTwo.size());
        }while((armyOne.size() > 0 && armyTwo.size() > 0) || ((armyOne.size() > 0 && armyTwoAlive) || (armyTwo.size() > 0 && armyOneAlive)));
        
        if(armyOne.size() > 0){
            System.out.println("Army One takes victory!");
        }
        else if(armyTwo.size() > 0) {
            System.out.println("Army Two is the winner!");
        }
        else{
            System.out.println("Both armies have fallen, There is no victor!");
        }
    }
}
