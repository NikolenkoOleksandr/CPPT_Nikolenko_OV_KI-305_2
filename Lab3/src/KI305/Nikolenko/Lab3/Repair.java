package KI305.Nikolenko.Lab3;

/**
 * Class <code>Repair</code>
 * @author Oleksandr Nikolenko
 * @version 1.0
 */
public class Repair {
    int repaired;
    /**
     * Implements repair default
     */
    public Repair(){
        repaired = 100;
    }
    /**
     * Implements repair by value
     */
    public Repair(int x){
        repaired = x;
    }

    /**
     * Method shows if repair is needed
     */
    public String isRepaired(){
        return("Your shoes on "+repaired+"% unharmed");
    }
    /**
     * Method repairs the shoes
     */
    public String Repair1(){
        repaired = 100;
        return("Your shoes have been repaired!");
    }
    /**
     * Method change repair value
     */
    public void weared(){
        repaired -= 1;
        if (repaired <= 0){
            repaired = 0;
            System.out.println("Your shoes are beyond repair:(");
        }
    }
}
