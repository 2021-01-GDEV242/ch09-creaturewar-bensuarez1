
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
     * Constructor for objects of class Demon
     */
    public Demon()
    {
        // initialise instance variables
        super(
            Randomizer.nextInt(MAX_DEMON_HP-MIN_DEMON_HP)+MIN_DEMON_HP,    
            Randomizer.nextInt(MAX_DEMON_STR-MIN_DEMON_STR)+MIN_DEMON_STR
        );
    }
}
