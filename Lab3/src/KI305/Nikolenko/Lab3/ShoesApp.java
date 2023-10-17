/**
 * lab 4 package
 */
package KI305.Nikolenko.Lab3;

import java.io.*;
import java.util.*;

/**
 * Class <code>ShoesApp</code>
 * @author Oleksandr Nikolenko
 * @version 1.0
 */
public class ShoesApp {
    private static ArrayList<String> materialsWithLargerSize = new ArrayList<>();

    /**
     * @param args
     */
    public static void main(String[] args) {
        try {
            Boots ChuckTaylor = new Boots("ChuckTaylor", 35, "leather");
            Boots Bri = new Boots("Bri", 39, "leather");
            Boots Adidas = new Boots("Adidas", 35, "canvas");
            Boots Gucci = new Boots("Gucci", 42, "leather");
            Boots Armani = new Boots("Armani", 35, "rubber");
main1();
            ArrayList<Boots> bootsList = new ArrayList<>();
            bootsList.add(ChuckTaylor);
            bootsList.add(Bri);
            bootsList.add(Adidas);
            bootsList.add(Gucci);
            bootsList.add(Armani);

            // Знайти матеріали взуття розмір яких більший за 35
            ArrayList<String> materialsWithLargerSize = findMaterialsWithLargerSize(bootsList, 35);
            System.out.println("Матеріали взуття розмір яких більше за 36: " + Boots.l);
           

        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public static void main1() throws FileNotFoundException{
            Boots Adidas1 = new Boots("Adidas", 37, "canvas1");

    }

    // Метод для знаходження матеріалів взуття розмір яких більший за вказаний
    public static ArrayList<String> findMaterialsWithLargerSize(ArrayList<Boots> bootsList, int size) {
        ArrayList<String> materialsWithLargerSize = new ArrayList<>();

        // Додати матеріали з розміром більшим за вказаний
        for (Boots boots : bootsList) {
            if (boots.getSize() > size) {
                materialsWithLargerSize.add(boots.getMaterial());
            }
        }

        return materialsWithLargerSize;
    }
}
