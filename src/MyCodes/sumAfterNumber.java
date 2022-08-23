package MyCodes;

public class sumAfterNumber {
    public static void main(String[] args) {
        int startValue = 2;
        int[] values = {1, 2, 3, 4, 5};
        int output = getSum(values, startValue); // {1,2,3,4,5}, 2
        System.out.println(output);
    }
   public static int getSum(int[] values, int startValue) {
        if(values.length == 1) return 0; // if array size = 1
        int len = values.length; // 5
        int i = 0;
        while (i < len && values[i] != startValue) i++; // while 0 < 5 and 1/2/3/4/5 not = 2
        int startValueIndex = i; // 1
        int sum = 0;
        for (int el = startValueIndex + 1; el < len; el++) sum += values[el]; // 0 + indexes [2][3][4] (3 + 4 + 5)
        return sum; // 12
    }
}
