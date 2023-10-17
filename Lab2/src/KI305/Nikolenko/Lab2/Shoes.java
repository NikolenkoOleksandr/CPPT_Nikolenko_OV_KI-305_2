package KI305.Nikolenko.Lab2;
import java.io.*;
import java.util.List;
import java.util.ArrayList;
/**
 * Class <code>Shoes</code>
 * @author Oleksandr Nikolenko
 * @version 1.0
 */

public class Shoes {
    boolean isPutOn = false;
    int size = 0;
    String material;
    String [] lacingTypes = { "Hash", "Twistie", "Riding bow", "Lattice","Zipper" };
    String lacing = "";
    Wash washed = new Wash();
    Repair repaired = new Repair();
    private PrintWriter fout;
    /**
     * Constructor
     * Creates shoes pair
     */

    public static List<String> getMaterialsList() {
        return materialsList;
    }

    private static List<String> materialsList = new ArrayList<>();

    /**
     * Method for put on shoes
     */
    public void Start(){
        if (isPutOn != true){
            isPutOn = true;
            washed.weared();
            repaired.weared();
            System.out.println("Put on");
            fout.println("Put on");
        }
        else{
            System.out.println("You already put on these shoes");
            fout.println("You already put on these shoes");

        }
    }

    /**
     * Method for taking off the shoes
     */
    public void End(){
        if (isPutOn != false){
            isPutOn = false;
            System.out.println("Take off");
            fout.println("Take off");
        }
        else{
            System.out.println("You took off those shoes");
            fout.println("You took off those shoes");
        }
    }

    /**
     * Method shows lacing type
     */
    public void showLacing(){
        System.out.println(lacing+" lacing");
        fout.println(lacing+" lacing");
    }
    /**
     * Method shows material type
     */
    public void showMaterial(){
        System.out.println("Youre shoes are made of-"+material);
        fout.println("Youre shoes are made of-"+material);
    }
    /**
     * Method changes lacing type
     */
    public void changeLacing(int type){
        lacing = lacingTypes[type-1];
        System.out.println("The lacing type changed to: "+lacing);
        fout.println("The lacing type changed to: "+lacing);
    }

    /**
     * Method shows size
     */
    public void showSize(){
        System.out.println("Shoe size is:"+size);
        fout.println("Shoe size is:"+size);
    }

    /**
     * Method shows if cleaning needed
     */
    public void showClean(){
        System.out.println(washed.isWashed());
        fout.println(washed.isWashed());
    }
    /**
     * Method cleans the shoes
     */
    public void clean(){
        System.out.println(washed.clean());
        fout.println(washed.clean());
    }
    /**
     * Method shows if repair is needed
     */
    public void showRepair(){
        System.out.println(repaired.isRepaired());
        fout.println(repaired.isRepaired());
    }
    /**
     * Method repairs the shoes
     */
    public void repair(){
        System.out.println(repaired.Repair1());
        fout.println(repaired.Repair1());
    }
    /**
     * Method releases used recourses
     */
    public void dispose()
    {
        fout.flush();
        fout.close();
    }
    public Shoes(int s, String m) throws FileNotFoundException {
        lacing = "Hash";
        size = s;
        material = m;
        fout = new PrintWriter(new File("KI305.Nikolenko.Lab2.txt"));

        // Додайте матеріал до списку, якщо розмір більше або рівний 40
        if (size >= 40) {
            materialsList.add(material);
        }
    }

}

