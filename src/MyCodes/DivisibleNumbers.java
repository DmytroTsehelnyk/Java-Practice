package MyCodes;

import java.util.Arrays;

public class DivisibleNumbers {
    public static void main(String[] args) {
        int divider = 2;
        int[] numbers = {2, 5, 8, 0, 7, 1, -4};
        int[] output = getDivNum(numbers, divider);
        System.out.println(Arrays.toString(output));
    }
    public static int[] getDivNum(int[] numbers, int divider) {
        int size = 0;
        int counter = 0;
        for (int i : numbers) {
            if (i > 0 && i % divider == 0) {
                size++;
            }
        }
        int[] result = new int[size];
        for (int i : numbers) {
            if (i > 0 && i % divider == 0) {
                result[counter++] = i;
            }
        }
        return result;
    }
}
