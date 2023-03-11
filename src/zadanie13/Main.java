package zadanie13;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Podaj rozmiar tablicy: ");
        int size = input.nextInt();

        int[] array = new int[size];

        System.out.println("Podaj elementy tablicy:");
        for (int i = 0; i < size; i++) {
            array[i] = input.nextInt();
        }

        int max = findMax(array);
        System.out.println("Największy element tablicy to: " + max);
    }

    public static int findMax(int[] array) {
        return findMaxRec(array, 0, array.length - 1);
    }

    public static int findMaxRec(int[] array, int left, int right) {
        if (left == right) {
            return array[left];
        }

        int mid = (left + right) / 2;
        int leftMax = findMaxRec(array, left, mid);
        int rightMax = findMaxRec(array, mid + 1, right);

        return Math.max(leftMax, rightMax);
    }
}
