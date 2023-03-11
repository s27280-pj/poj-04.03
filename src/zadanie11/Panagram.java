package zadanie11;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Panagram {

    public static boolean isPangram(String text) {

        Set<Character> set = new HashSet<Character>();

        for (int i = 0; i < text.length(); i++) {

            char ch = text.charAt(i);

            if (Character.isLetter(ch)) {
                ch = Character.toLowerCase(ch);
                set.add(ch);
            }
        }
        return set.size() == 26;
    }

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        String text =  s.nextLine();

        boolean isPangram = isPangram(text);
        System.out.println(isPangram);
    }

}


