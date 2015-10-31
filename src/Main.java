import java.util.*;

public class Main {
    public static void main(String[] args) {

        // №1
        int mas[] = new int[50];
        mas[0] = 1;

        for (int x = 1; x < mas.length; x++) {
            mas[x] = mas[x - 1] + 2;
        }
        System.out.println(" Task 1");
        for (int x = 0; x < mas.length; x++) {
            System.out.print(mas[x] + " ");
        }
        System.out.println();
        for (int x = mas.length - 1; x >= 0; x--) {
            System.out.print(mas[x] + " ");
        }
        System.out.println();

        // №2
        int randomMas[] = new int[15];
        int t = 0;

        System.out.println("\n Task 2");
        for (int x = 0; x < randomMas.length; x++) {
            randomMas[x] = (int) (Math.random() * 10);
        }

        for (int x = 0; x < randomMas.length; x++) {
            System.out.print(randomMas[x] + " ");
            if (randomMas[x] % 2 == 0 && randomMas[x] != 0) t += 1;
        }
        System.out.println();
        System.out.println("Even numbers in the array " + t);

        // №3
        int simple[][] = new int[2][15];
        System.out.println("\n Task 3");

        for (int y = 0; y < 15; y++) {
            for (int x = 0; ; x++) {
                int r = (int) (Math.random() * 8) + 2;
                int r2 = (int) (Math.random() * 8) + 2;
                if (!((r == simple[0][x] && r2 == simple[1][x]) || (r2 == simple[0][x] && r == simple[1][x]))) {
                    simple[0][y] = r;
                    simple[1][y] = r2;
                    break;
                }
            }
        }

        for (int x = 0; x < simple.length; x++) {
            for (int y = 0; y < simple[x].length; y++) {
                System.out.print(simple[x][y] + "| ");
            }
            System.out.println();
        }

        // №4
        int mss[][] = new int[6][7];
        System.out.println("\n Task 4");

        for (int x = 0; x < mss.length; x++) {
            for (int y = 0; y < mss[x].length; y++) {
                mss[x][y] = (int) (Math.random() * 10);
            }
        }

        for (int x = 0; x < mss.length; x++) {
            for (int i = mss[x].length - 1; i > 0; i--) {
                for (int j = 0; j < i; j++) {
                    if (mss[x][j] < mss[x][j + 1]) {
                        int tmp = mss[x][j];
                        mss[x][j] = mss[x][j + 1];
                        mss[x][j + 1] = tmp;
                    }
                }
            }
        }

        for (int x = 0; x < mss.length; x++) {
            for (int y = 0; y < mss[x].length; y++) {
                System.out.print(mss[x][y] + "| ");
            }
            System.out.println();
        }

    }

}
