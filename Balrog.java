
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
     * Constructor for objects of class Balrog
     */
    public Balrog()
    {
        // initialise instance variables
        super();
    }
    
    public int damage()
    {
        return super.damage() + super.damage();
    }
}
