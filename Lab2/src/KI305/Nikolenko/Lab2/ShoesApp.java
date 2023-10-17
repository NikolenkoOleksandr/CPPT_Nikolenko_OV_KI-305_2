package KI305.Nikolenko.Lab2;
import java.io.*;

/**
 * Shoes Application class implements main method for Shoes class possibilities demonstration
 * @author Oleksandr Nikolenko
 * @version 1.0
 */
public class ShoesApp {
    /**
     * @param args
     * @throws FileNotFoundException
     */
    public static void main(String[] args) throws FileNotFoundException {
        try {
            Shoes Nike = new Shoes(38, "Leather");
            Shoes Jordan = new Shoes(42, "Synthetic");
            Shoes Adidas = new Shoes(35, "Mesh");
            Shoes Puma = new Shoes(45, "Leather");
            Shoes DC = new Shoes(40, "Canvas");
            f1();
            // Виведення списку матеріалів кросівок розміром більше 40
            System.out.println("Матеріали кросівок розміром більше 40:");
            for (String material : Shoes.getMaterialsList()) {
                System.out.println(material);
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }
    public static void f1() throws FileNotFoundException
    {
        Shoes DC = new Shoes(40, "Canvas1");
    }
}

