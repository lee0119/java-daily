package Self;

import java.util.Arrays;

public class ArrSum {
    public static void main(String[] args) {
        int output = arrSum(new int[]{-1, -2, 1, 3});
        System.out.println(output); // --> 1
    }

    public static int arrSum(int[] arr){
        if(arr.length ==0 ) return 0;

        int head = arr[0];
        int[] tail = Arrays.copyOfRange(arr, 1, arr.length);
        System.out.println(arr.length);
        System.out.print(arrSum(tail));
        return head + arrSum(tail);
    }
}
