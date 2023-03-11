package zadanie10;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        System.out.println("");

        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        int[][] matrix = new int[a][b];

        for (int i = 0; i < a; i++) {

            for (int j = 0; j < b; j++) {

                if (scanner.hasNextInt()) {
                    matrix[i][j] = scanner.nextInt();
                } else {
                    System.out.println("BŁĄD");
                    return;
                }
            }
        }

        for (int j = 0; j < b; j++) {

            for (int i = 0; i < a; i++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
