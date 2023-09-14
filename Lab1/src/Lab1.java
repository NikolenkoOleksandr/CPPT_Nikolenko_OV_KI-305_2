import java.io.*;
import java.util.*;
/**
 * Клас Lab1 реалізує програму до лабораторної роботи №1
 *
 * @author Oleksandr Nikolenko
 * @version 1.0
 * @since version 1.0
 *
 */

public class Lab1 {
    private static Scanner in;

    /**
     * Статичний метод main є точкою входу в програму
     *
     * @param args
     * @throws FileNotFoundException
     *
     */
    public static void main(String[] args) throws FileNotFoundException {
        int nRows;
        int h;
        int bridge = 0;
        char[][] arr;
        String filler;
        boolean check = true;
        in = new Scanner(System.in);
        File dataFile = new File("Lab1.txt");
        PrintWriter fOut = new PrintWriter(dataFile);


        do {
            System.out.print("Input odd number(>=3), which will be responsible for the size of the matrix: ");
            nRows = in.nextInt();
            in.nextLine();

            if(nRows<3 || nRows%2==0){
                System.out.println("Your number is incorrect, please try again");
            }
            else{
                check = false;
            }
        }while(check);
        h=nRows-1;
        nRows-=1;
        arr = new char[nRows][];
        for (int i =0;i<nRows;i++){
            arr[i] = new char[h];
            if(i<nRows/2){
                h-=2;
                if(i==(nRows/2)-1){
                    h=2;
                }
            }else if(i == nRows/2){
                h=2;
            } else {
                h+=2;
                arr[i] = new char[h];
            }
        }

        do {
            System.out.print("Input filler symbol: ");
            filler = in.nextLine();
            if(filler.length() == 1){
                check = false;
            }else if(filler.length() == 0){
                System.out.println("No symbol found");
                System.exit(0);
            }
            else{
                System.out.println("Too much symbols");
                System.exit(0);
            }
        }while(check);

        for(int i = 0; i<nRows; i++){
            for(int j =0;j< arr[i].length/2;j++){
                arr[i][j] = (char) filler.codePointAt(0);
                System.out.print(arr[i][j] + " ");
                fOut.print(arr[i][j] + " ");
                bridge = j;
            }
            for(int a = 0;a<(nRows+1)-arr[i].length;a++){
                System.out.print("  ");
                fOut.print("  ");
            }
            for(int j = bridge+1;j<arr[i].length;j++){
                arr[i][j] = (char) filler.codePointAt(0);
                System.out.print(arr[i][j] + " ");
                fOut.print(arr[i][j] + " ");
            }
            if(i==(nRows/2)-1){
                System.out.println();
                fOut.println();
            }
            System.out.println();
            fOut.println();
        }
        fOut.flush();
        fOut.close();
    }
}
