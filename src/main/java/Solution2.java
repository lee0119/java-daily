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
class Solution2 {
    // 소수를 판별하기 위한 메서드
    public static boolean PrimeNumber(int number) {
        // number가 1인경우 소수가 아니기 때문에 false
        if (number < 2) {
            return false;
        }

        // 2부터 i의 제곱이 넘어온 number변수보다 작을 경우 반복문을 수행
        for (int i = 2; i * i <= number; i++) {
            // 나머지가 0일 경우 소수가 아니므로 false
            if (number % i == 0) {
                return false;
            }
        }

        // 그 외의 경우 number는 소수이기 때문에 true
        return true;
    }

    public static void main(String args[]) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 사용자로부터 숫자 두 개를 입력받고 M과 N에 변환을 한 후 대입
        String[] strArray = br.readLine().split(" ");

        int M = Integer.parseInt(strArray[0]);
        int N = Integer.parseInt(strArray[1]);

        // M부터 N까지 반복문 수행
        for (int i = M; i <= N; i++) {
            // true일 경우, 소수이기 때문에 출력
            if (PrimeNumber(i) == true) {
                System.out.println(i);
            }
        }
    }
}
