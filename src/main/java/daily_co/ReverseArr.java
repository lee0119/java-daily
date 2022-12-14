package daily_co;

import java.util.Arrays;

//문제
//배열을 입력받아 순서가 뒤집힌 배열을 리턴해야 합니다.
//
//입력
//인자 1 : arr
//int타입의 요소를 갖는 배열
//출력
//순서가 뒤집힌 배열을 리턴해야 합니다.
//[arr[n-1], arr[n-2], ... , arr[0]]
//arr.length는 n
//주의 사항
//함수 reverseArr는 재귀함수의 형태로 작성합니다.
//반복문(for, while) 사용은 금지됩니다.
//입력받은 배열은 함수의 호출 뒤에도 처음 상태를 유지해야 합니다(immutability).
//빈 배열은 빈 배열 그대로를 리턴해야 합니다.

public class ReverseArr {
    public static void main(String[] args) {
        int[] output = reverseArr(new int[]{1,2,3});
        System.out.println(Arrays.toString(output)); // --> [3, 2, 1]
    }

    public static int[] reverseArr(int[] arr){
        if(arr.length == 0) return new int[]{};
        int[] head = Arrays.copyOfRange(arr, arr.length-1, arr.length);
        int[] tail = reverseArr(Arrays.copyOfRange(arr, 0, arr.length-1));

        int[] dest = new int[head.length + tail.length];
        System.arraycopy(head, 0, dest, 0, head.length);
        System.arraycopy(tail, 0, dest, head.length, tail.length);
        return dest;
    }
}

