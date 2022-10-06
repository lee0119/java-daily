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
//체육복 복습 -실전프로젝트로 시간 부족 ㅠㅠㅠ
class Solution2 {
    // 소수를 판별하기 위한 메서드
    int solution2(int n, vector<int> lost, vector<int> reserve) {
        int answer = 0;
        int student[ n + 2]; // 0,n+1 추가로
        fill_n(student, n + 2, 1); //체육복 모두 가지고 있는 상태

        for (int i : lost) student[i]--;
        for (int i : reserve) student[i]++;

        for (int i = 1; i <= n; i++) {
            if (student[i] == 0) {
                if (student[i - 1] == 2) student[i] = student[i - 1] = 1; //나눠가짐
                else if (student[i + 1] == 2) student[i] = student[i + 1] = 1;
            }
        }
        for (int i = 1; i <= n; i++) {
            if (student[i] > 0) answer++;
        }
        return answer;
    }
}