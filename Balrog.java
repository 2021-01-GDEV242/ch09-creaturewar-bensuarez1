
/**
 * Write a description of class Balrog here.
 *
 * @author Ben Suarez
 * @version 2021-4-4 v1.0
 */
public class Balrog extends Demon
{
    // instance variables - replace the example below with your own
    private static final int MAX_BALROG_HP = 200;
    private static final int MIN_BALROG_HP = 80;
    private static final int MAX_BALROG_STR = 100;
    private static final int MIN_BALROG_STR = 20;

    /**
     * The instantiating class asks for a Balrog and the balrog class is responsible for
     * return a Balrog object with values in the appropriate range
     */
    public Balrog()
    {
        // initialise instance variables
        super();
    }
    
    /**
     * damage() represents Balrog's double attack for each round.
     * @return damage count after Balrog attacks twice.
     */
    public int damage()
    {
        return super.damage() + super.damage();
    }
}
