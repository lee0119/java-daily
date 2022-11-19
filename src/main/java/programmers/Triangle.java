package programmers;

public class Triangle {


    //삼각형의 완성조건(2)
    public int solution(int[] sides) {
        int answer = 0;
        int sum = sides[0] + sides[1];
        int bigger = Math.max(sides[0], sides[1]);
        int smaller = Math.min(sides[0], sides[1]);
        //한 변씩 가장 큰 길이라 가정 -> 나머지 두 개 합쳐도 가장 큰 것보다 작아야함
        for (int i = 0; i < bigger; i++) {
            if (bigger < smaller + i){
                answer++;
            }
        }
        //[3,6] 4,5,6,7,8

        //[11,7] 5,6,7,8,9 ,10,11,12,13,14, 15,16,17

        // sides에 없는 나머지 한 변이 더 가장 길 때
        for (int i = bigger; i < sum; i++) {
            if (i < sum) {
                answer++;
            }
        }
        return answer;
    }
}

