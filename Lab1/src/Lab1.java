import java.io.*;
import java.util.Scanner;

public class Lab1 {
    private static Scanner in;

    public static void main(String[] args) throws IOException {
        int nRows;
        int h;
        int bridge = 0;
        char[][] arr;
        String filler;
        boolean check = true;
        in = new Scanner(System.in);
        File dataFile = new File("Lab1.txt");
        RandomAccessFile raFile = new RandomAccessFile(dataFile, "rw");

        do {
            System.out.print("Input odd number (>=3), which will be responsible for the size of the matrix: ");
            nRows = in.nextInt();
            in.nextLine();

            if (nRows < 3 || nRows % 2 == 0) {
                System.out.println("Your number is incorrect, please try again");
            } else {
                check = false;
            }
        } while (check);
        h = nRows - 1;
        nRows -= 1;
        arr = new char[nRows][];
        for (int i = 0; i < nRows; i++) {
            arr[i] = new char[h];
            if (i < nRows / 2) {
                h -= 2;
                if (i == (nRows / 2) - 1) {
                    h = 2;
                }
            } else if (i == nRows / 2) {
                h = 2;
            } else {
                h += 2;
                arr[i] = new char[h];
            }
        }

        do {
            System.out.print("Input filler symbol: ");
            filler = in.nextLine();
            if (filler.length() == 1) {
                check = false;
            } else if (filler.length() == 0) {
                System.out.println("No symbol found");
                System.exit(0);
            } else {
                System.out.println("Too many symbols");
                System.exit(0);
            }
        } while (check);

        for (int i = 0; i < nRows; i++) {
            for (int j = 0; j < arr[i].length / 2; j++) {
                arr[i][j] = ' ';  // Замінюємо ліву частину пробілами
                bridge = j;
            }
            for (int a = 0; a < (nRows + 1) - arr[i].length; a++) {
                raFile.writeBytes(" ");
            }
            for (int j = bridge + 1; j < arr[i].length; j++) {
                arr[i][j] = (char) filler.codePointAt(0);
                raFile.writeBytes(String.valueOf(arr[i][j]));
            }
            if (i == (nRows / 2) - 1) {
                raFile.write('\n');
            } else {
                raFile.write('\r');
                raFile.write('\n');
            }
        }

        raFile.close();
    }
}
