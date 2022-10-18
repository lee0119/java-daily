import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.time.LocalDate;
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
//복습복습
//레벨 1-20 2106년
//다시 풀기 2106
//자바의 정석 예제
//파이널 전이라 복습만 
import java.util.*;
class Solution2 {
    public String solution2(int a, int b) {
        String answer[] = {"SUN","MON","TUE","WED","THU","FRI","SAT"};
        Calendar calendar = Calendar.getInstance();
        // calendar 클래스의 month는 1월부터 12월을 0부터 11까지로 표현해야 됨
        calendar.set(2016, a-1, b);
        int res = calendar.get(Calendar.DAY_OF_WEEK);
        return answer[res-1];
    }
}
//다른 풀이
class Solution {
    public String solution(int a, int b) {
        return LocalDate.of(2016, a, b).getDayOfWeek().toString().substring(0,3);
    }
}
