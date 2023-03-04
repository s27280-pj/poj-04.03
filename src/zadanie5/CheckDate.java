package zadanie5;

import java.util.Scanner;

public class CheckDate {
    public static void main(String[] args) {

        try {

            Scanner scanner = new Scanner(System.in);

            System.out.println("Podaj numer miesiąca: ");
            int month = scanner.nextInt();

            int days;

            switch (month) {
                case 1:
                    System.out.println("Styczeń: 31 dni");
                    break;
                case 2:
                    System.out.println("Luty: 28 dni");
                    break;
                case 3:
                    System.out.println("Marzec: 31 dni");
                    break;
                case 4:
                    System.out.println("Kwiecień: 30 dni");
                    break;
                case 5:
                    System.out.println("Maj: 31 dni");
                    break;
                case 6:
                    System.out.println("Czerwiec: 30 dni");
                    break;
                case 7:
                    System.out.println("Lipiec: 31 dni");
                    break;
                case 8:
                    System.out.println("Sierpień: 31 dni");
                    break;
                case 9:
                    System.out.println("Wrzesień: 30 dni");
                    break;
                case 10:
                    System.out.println("Październik: 31 dni");
                    break;
                case 11:
                    System.out.println("Listopad: 30 dni");
                    break;
                case 12:
                    System.out.println("Grudzień: 31 dni");
                    break;
                default:
                    System.out.println("BŁĄD");
                    break;
            }

        }catch (Exception e){
            System.out.println("BŁĄD");
        }
    }
}
