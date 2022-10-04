import java.util.*;

//자바 모의고사 수포자
//레벌 1 -12
//레벨 1 -13\
//시간없어서 복습 위주.

//레벨  1 -14 소수찾기
//레벨 1-15 평균 구하기
class Solution2 {
    public double solution(int[] arr) {
        double sum=0;
        //for (int i=0;i<arr.length;i++){
        //    sum += arr[i];
        //}
        for (int i : arr){
            sum += i;
        }
        return sum/arr.length;
    }
}