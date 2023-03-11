package zadanie9;

import java.util.Scanner;

public class Palindrom {
    public static boolean czyPalindrom(char[] slowo) {
        int dlugosc = slowo.length;

        for (int i = 0; i < dlugosc / 2; i++) {

            if (slowo[i] != slowo[dlugosc - i - 1]) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Podaj słowo: ");

        String slowo = scanner.next();
        char[] tablica = slowo.toCharArray();

        if (czyPalindrom(tablica)) {
            System.out.println("TAK");
        } else {
            System.out.println("NIE");
        }
    }
}
