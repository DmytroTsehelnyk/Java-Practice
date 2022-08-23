package MyCodes;

import java.util.Scanner;

public class printMiddleChar {
    public static void main(String[] args) {
        System.out.print("Please, enter your word: ");
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        String output = printMiddle(input);
        System.out.print(output);
    }

    public static String printMiddle(String input) {
        int pos;
        int len;
        if (input.isEmpty()) return "";
        if (input.length() % 2 == 0) {
            pos = input.length() / 2 - 1;
            len = 2;
        } else {
            pos = input.length() / 2;
            len = 1;
        }
        return input.substring(pos, pos + len);
    }
}
