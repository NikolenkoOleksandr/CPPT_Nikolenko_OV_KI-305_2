package KI305.Nikolenko.Lab2;
/**
 * Class <code>Wash</code>
 * @author Oleksandr Nikolenko
 * @version 1.0
 */
public class Wash {
    int washed;
    /**
     * Implements washing by default
     */
    public Wash(){
        washed = 100;
    }
    /**
     * Implements washing by value
     */
    public Wash(int x){
        washed = x;
    }

    /**
     * Method shows if washing is needed
     */
    public String isWashed(){
        return ("Your shoes are "+washed+"% clean");
    }
    /**
     * Method cleans the shoes
     */
    public String clean(){
        washed = 100;
        return ("Your shoes are now clean!");
    }
    /**
     * Method change wash value
     */
    public void weared(){
        washed -= 2;
        if (washed <= 0){
            washed = 0;
        }
    }
}

