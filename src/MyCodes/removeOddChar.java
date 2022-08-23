package MyCodes;

import java.util.Scanner;

public class removeOddChar {
    public static void main (String[] args) {
        System.out.print("Please, enter your word: ");
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        String output = removeOdd(input);
        System.out.print(output);
    }
    public static String removeOdd(String input) {
        if (input.isEmpty()) return "";
        StringBuilder noOdd = new StringBuilder();
        for (int i = 0; i < input.length(); i++) {
            if (i % 2 == 0) noOdd.append(input.charAt(i));
        }
        return noOdd.toString();
    }
}
