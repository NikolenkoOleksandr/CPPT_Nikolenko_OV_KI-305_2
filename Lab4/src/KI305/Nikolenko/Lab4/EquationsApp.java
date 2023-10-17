package KI305.Nikolenko.Lab4;
import java.util.Scanner;
import java.io.*;
import static java.lang.System.out;

/**
 * Class <code>EquationsApp</code> Implements driver for Equations class
 * @author Oleksandr Nikolenko
 * @version 1.0
 */
public class EquationsApp {
    public static void main(String[] args) {
        System.out.println("Success");
        try
        {
            out.print("Enter file name: ");
            Scanner in = new Scanner(System.in);
            String fName = in.nextLine();
            PrintWriter fout = new PrintWriter(new File(fName));
            try
            {
                Equations eq = new Equations();
                out.print("Enter X: ");
                int x = in.nextInt();
                fout.print(eq.calculate(x));
                out.print(eq.calculate(x));
            }
            finally
            {
                fout.flush();
                fout.close();
            }
        }
        catch (CalcException | FileNotFoundException ex)
        {
            if (ex instanceof CalcException) {
                out.print(((CalcException)ex).getMessage());
            } else {
                out.print("Exception reason: Perhaps wrong file path");
            }
        }
    }
}
