package Self;

import java.util.Arrays;

public class ArrProduct {
    public static void main(String[] args) {
        int output = arrProduct(new int[]{1, -2, 1, 3});
//        System.out.println(output); // --> -6

    }
    public static int arrProduct(int[] arr){

        if(arr.length == 0)  return 1;
        int head = arr[0];
        int[] tail = Arrays.copyOfRange(arr, 1, arr.length);
        System.out.println(arrProduct(tail));
        return head * arrProduct(tail);
    }
}
