package zadanie12;

import java.util.Scanner;

public class AgeCalculator {
    public static void main(String[] args) {

        System.out.println("Podaj wiek w sekundach a następnie wybraną planete: G");

        Scanner s = new Scanner(System.in);
        long seconds = s.nextLong();
        String planet = s.nextLine();

        double age = calculateAge(seconds, planet);
        System.out.printf("Wiek na planecie %s: %.2f lat", planet, age);
    }

    public static double calculateAge(long seconds, String planet) {

        double earthSecondsInYear = 31557600;
        double earthYears = seconds / earthSecondsInYear;
        double age = 0;

        switch (planet) {
            case "Merkury":
                age = earthYears / 0.2408467;
                break;
            case "Wenus":
                age = earthYears / 0.61519726;
                break;
            case "Mars":
                age = earthYears / 1.8808158;
                break;
            case "Jowisz":
                age = earthYears / 11.862615;
                break;
            case "Saturn":
                age = earthYears / 29.447498;
                break;
            case "Uran":
                age = earthYears / 84.016846;
                break;
            case "Neptun":
                age = earthYears / 164.79132;
                break;
            case "Ziemia":
                age = earthYears;
                break;
            default:
                System.out.println("Nieznana planeta!");
        }
        return age;
    }
}

