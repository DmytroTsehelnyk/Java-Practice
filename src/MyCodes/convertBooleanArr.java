package MyCodes;

import java.util.Arrays;

public class convertBooleanArr {
    public static void main(String[] args) {
        boolean[] values = {true, false};
        String[] output = getStringArray(values);
        System.out.println(Arrays.toString(output));
    }

    public static String[] getStringArray(boolean[] values) {
        String[] result = new String[values.length];
        for (int i = 0; i < values.length; i++) {
            result[i] = values[i] ? "Yes" : "No";
        }
        return result;
    }
}

// Small method to know centuries from years
//    public static int getCentury(int year) {
//        if (year % 100 == 0) return year / 100;
//        else return year / 100 + 1;
//    }
//}