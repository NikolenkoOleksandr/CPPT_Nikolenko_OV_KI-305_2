package KI305.Nikolenko.Lab3;
import java.io.FileNotFoundException;
import java.util.ArrayList;

interface IBoots
{
    void takeOffInsulation();
    void insulationOnBoots();
}
/**
 * Class <code>Boots</code> extends Shoes and implements IBoots
 * @author Oleksandr Nikolenko
 * @version 1.0
 */
public class Boots extends Shoes implements IBoots {

    boolean insulation = false;

    static ArrayList<String> materialsWithLargerSize = new ArrayList<>();

  public static String l = "";



    public Boots() throws FileNotFoundException{
        super("Airmax97", 35, "leather");

    }
    /**
     * Constructor
     * @param name
     * @param size
     * @param material
     */
    public Boots(String name, int size, String material) throws FileNotFoundException {
        super(name, size, material);
        if (size > 35) {
            l = l + material + ",";

        }
    }

    /**
     * Method takes off insulation
     */
    public void takeOffInsulation()
    {
        if(insulation)
        {
            insulation = false;
            System.out.println("Taking off insulation");
            fout.println("Taking off insulation");
            return;
        }
        System.out.println("insulation removed");
    }
    /**
     * Method adds insulation on boots
     */
    public void insulationOnBoots()
    {
        if(!insulation)
        {
            insulation = true;
        }
        System.out.println("The insulation are on");
    }
}

