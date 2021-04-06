
/**
 * Write a description of class Elf here.
 *
 * @author Ben Suarez
 * @version 2021-4-4 v1.0
 */
public class Elf extends Creature
{
    // instance variables - replace the example below with your own
    private static final int MAX_ELF_HP = 25;
    private static final int MIN_ELF_HP = 8;
    private static final int MAX_ELF_STR = 18;
    private static final int MIN_ELF_STR = 5;

    /**
     * The instantiating class asks for a Human and the human class is responsible for
     * return a Human object with values in the appropriate range
     */
    public Elf()
    {
        // initialise instance variables
        super(
            Randomizer.nextInt(MAX_ELF_HP-MIN_ELF_HP)+MIN_ELF_HP,    
            Randomizer.nextInt(MAX_ELF_STR-MIN_ELF_STR)+MIN_ELF_STR
        );
    }
    
    /**
     * damage() represents Elf's 10% chance to do magical damage.
     * @return damage count if magical damage activates.
     */
    public int damage()
    {
        int magicalDamage;
        magicalDamage = super.damage();
        if(Randomizer.nextInt(10)==0){
            System.out.println("Elf magic!!");
            magicalDamage *=2;
        }
        return magicalDamage;
    }
}
