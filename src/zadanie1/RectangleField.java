package zadanie1;

import java.util.Scanner;

public class RectangleField {
    public static void main(String[] args) {

        Scanner x = new Scanner(System.in);

        System.out.println("Podaj dlugosc boku a:");
        int a = x.nextInt();

        System.out.println("Podaj długość boku b:");
        int b = x.nextInt();

        int result = a * b;

        System.out.println("Pole prostokata wynosi: " + result);

    }
}
