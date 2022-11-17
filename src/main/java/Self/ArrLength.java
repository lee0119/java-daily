package Self;

import java.util.Arrays;

public class ArrLength {
    public static void main(String[] args) {
        int output = arrLength(new int[]{1, -2, 1, 3});
        System.out.println(output); // --> 4
    }

    public static int arrLength(int[] arr) {
        if(arr.length == 0) return 0;


        return arrLength(Arrays.copyOfRange(arr, 1 , arr.length));

    }
}
