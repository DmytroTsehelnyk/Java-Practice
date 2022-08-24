package MyCodes;

import java.util.Arrays;

public class getCombinedArrays {
    public static void main(String[] args) {
        int[] firstArray = {1, 2, 3};
        int[] secondArray = {4, 5, 6};
        int[] output = combineArrays(firstArray, secondArray);
        System.out.println(Arrays.toString(output));
    }
    public static int[] combineArrays(int[] firstArray, int[] secondArray) {

        int[] result = new int[firstArray.length + secondArray.length]; // size of new combined array
        int index = 0; // indexes of new combined array
        for (int element : firstArray) { // add elements to result from 1st arr
            result[index] = element;
            index++;
        }
        for (int element : secondArray) { // add elements to result from 2nd arr
            result[index] = element;
            index++;
        }
        return result;
    }
}