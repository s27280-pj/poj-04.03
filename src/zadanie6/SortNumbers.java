package zadanie6;

import java.util.Scanner;

public class SortNumbers {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Podaj pierwsza liczbe: ");
        double a = scanner.nextDouble();

        System.out.println("Podaj druga liczbe: ");
        double b = scanner.nextDouble();

        System.out.println("Podaj ostatnia liczbe: ");
        double c = scanner.nextDouble();

        if (a > b) {
            double temp = a;
            a = b;
            b = temp;
        }

        if (b > c) {
            double temp = b;
            b = c;
            c = temp;
        }

        if (a > b) {
            double temp = a;
            a = b;
            b = temp;
        }

        System.out.printf("%.6f %.6f %.6f\n", a, b, c);

        if (a < b) {
            double temp = a;
            a = b;
            b = temp;
        }

        if (b < c) {
            double temp = b;
            b = c;
            c = temp;
        }

        if (a < b) {
            double temp = a;
            a = b;
            b = temp;
        }

        System.out.printf("%.6f %.6f %.6f\n", a, b, c);
    }
}

