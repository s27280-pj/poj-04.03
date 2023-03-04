package zadanie3;

import java.util.Scanner;

public class Compare {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Podaj dwa ciągi tekstowe oddzielone spacją: ");
        String input = scanner.nextLine();

        String[] inputs = input.split(" ");
        String napis1 = inputs[0];
        String napis2 = inputs[1];

        String output = String.format("%%%s %s%%", napis2, napis1);
        System.out.println(output);
    }
}
