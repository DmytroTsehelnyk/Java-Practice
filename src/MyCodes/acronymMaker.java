package MyCodes;

import java.util.Scanner;

public class acronymMaker {
    public static void main(String[] args) {
        System.out.print("Please, enter your word: ");
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        String output = makeAbbr(input);
        StringBuilder sb = new StringBuilder("Acronym of ");
                sb.append(input);
                sb.append(" is: ");
                sb.append(output);
        String result = sb.toString();
        System.out.print(result);
    }
    public static String makeAbbr(String input) {
        StringBuilder Abbr = new StringBuilder();
        for (String l : input.split(" ")) {
            String abbr = l.substring(0, 1);
            Abbr.append(abbr);
        }
        return Abbr.toString().toUpperCase();
        //String Abbr = input.replaceAll("\\B.|\\P{L}", "").toUpperCase(); // simplified version
    }
}