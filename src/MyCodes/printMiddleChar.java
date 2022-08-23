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
        int len = input.length();
        if (input.isEmpty()) return "";
        int mid = len / 2;
        return len % 2 == 1 ? input.substring(mid, mid + 1) : input.substring(mid - 1, mid + 1);
    }
}
