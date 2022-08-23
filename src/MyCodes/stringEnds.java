package MyCodes;

import java.util.Arrays;
import java.util.Scanner;

public class stringEnds {
    public static void main (String[] args) {
        System.out.print("Please, enter your word: ");
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        System.out.print(Arrays.toString(markStringEnds(input)));
    }
    public static String[] markStringEnds(String input) {
        String let1 = input.substring(0, 1).toUpperCase();
        String let2 = input.substring(input.length() - 1).toUpperCase();
        String s1 = let1 + input.substring(1);
        String s2 = input.substring(0, input.length() - 1) + let2;
        return new String [] {s1, s2};
    }
}
