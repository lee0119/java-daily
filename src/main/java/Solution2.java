import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

//자바 모의고사 수포자
//레벌 1 -12
//레벨 1 -13\
//시간없어서 복습 위주.

//레벨  1 -14 소수찾기
//레벨 1-15 평균 구하기
//레벨 1-16
//레벨 1-17 체육복
//레벨 1-18 신고결과받기
//레벨 1 다른방법
//레벨 1-19 비밀지도 
import java.util.*;
    class Solution2 {
        public String[] solution(int n, int[] arr1, int[] arr2) {
            String[] answer = new String[n];

            for(int i=0; i < n; i++){
                String row = String.format(String.format("%%%ds", n), Integer.toBinaryString(arr1[i] | arr2[i]));
                for(int j=0; j < n; j++){
                    answer[i] = row.replace('1', '#').replace('0', ' ');
                }
            }

            return answer;
        }
    }
