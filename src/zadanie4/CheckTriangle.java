package zadanie4;

import java.util.Scanner;

public class CheckTriangle {
    public static void main(String[] args) {
        try {

            Scanner x = new Scanner(System.in);

            System.out.println("Podaj bok a: ");
            int a = x.nextInt();

            System.out.println("Podaj bok b: ");
            int b = x.nextInt();

            System.out.println("Podaj bok c: ");
            int c = x.nextInt();

            if (a > 0 && b > 0 && c > 0) {
                if (a + b > c) {
                    if (b + c > a) {
                        if (a + c > b) {
                            System.out.println("TAK");
                        } else {
                            System.out.println("NIE");
                        }
                    } else {
                        System.out.println("NIE");
                    }
                } else {
                    System.out.println("NIE");
                }
            } else {
                System.out.println("BŁĄD");
            }
        }catch (Exception e){
            System.out.println("BŁĄD");
        }

    }
}
