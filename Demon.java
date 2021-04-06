
/**
 * Write a description of class Demon here.
 *
 * @author Ben Suarez
 * @version 2021-4-4 v1.0
 */
public class Demon extends Creature
{
    // instance variables - replace the example below with your own
    private static final int MAX_DEMON_HP = 100;
    private static final int MIN_DEMON_HP = 50;
    private static final int MAX_DEMON_STR = 75;
    private static final int MIN_DEMON_STR = 25;

    /**
     * The instantiating class asks for a Demon and the demon class is responsible for
     * return a Demon object with values in the appropriate range
     */
    public Demon()
    {
        // initialise instance variables
        super(
            Randomizer.nextInt(MAX_DEMON_HP-MIN_DEMON_HP)+MIN_DEMON_HP,    
            Randomizer.nextInt(MAX_DEMON_STR-MIN_DEMON_STR)+MIN_DEMON_STR
        );
    }
    
    /**
     * damage() represents Demon's 10% chance to do magical damage,
     * @return damage count if magical damage activates.
     */
    public int damage()
    {
        int magicalDamage;
        magicalDamage = super.damage();
        if(Randomizer.nextInt(20)==0){
            System.out.println("Strength of a Demon!!");
            magicalDamage +=50;
        }
        return magicalDamage;
    }
}
