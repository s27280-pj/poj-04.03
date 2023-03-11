package zadanie7;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Podaj n i m: ");
        int n = sc.nextInt();
        int m = sc.nextInt();

        if (n <= 0 || m <= 0) {
            System.out.println("BŁĄD: n i m muszą być dodatnie.");
            return;
        }

        int[] A = new int[n];
        int[] B = new int[m];

        System.out.println("Wczytaj n liczb do tablicy A:");
        for (int i = 0; i < n; i++) {
            A[i] = sc.nextInt();
        }

        System.out.println("Wczytaj m liczb do tablicy B:");
        for (int i = 0; i < m; i++) {
            B[i] = sc.nextInt();
        }

        if (n > m) {
            System.out.println("BŁĄD: n nie może być większe od m.");
            return;
        } else if (n < m) {
            System.out.println("BŁĄD: m nie może być większe od n.");
            return;
        }

        int product = 0;
        for (int i = 0; i < n; i++) {
            product += A[i] * B[i];
        }

        System.out.println("Iloczyn skalarny tablic A i B wynosi: " + product);
    }
}
