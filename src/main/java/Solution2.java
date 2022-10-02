import java.util.*;

//자바 모의고사 수포자
//레벌 1 -12
//레벨 1 -13\
//시간없어서 복습 위주.

//레벨  1 -14 소수찾기
class Solution2 {
    public int solution(int n) {
        int answer = 0;

        for(int i = 2; i<=n;i++){
            int temp = 0;
            answer++;
            for(int j=1;j<i;j++){
                if(temp>1) {
                    answer--;
                    break;
                }else if(i%j == 0) {
                    temp++;
                }
            }

        }

        return answer;
    }
}