//Main 클래스에서 Solution클래스 선언

//프로그래머스 삼총사 
public class Main {
        class Solution {
            public int solution(int[] number) {
                int answer = 0;

                for (int i = 0; i < number.length; i++) {
                    for (int j = i + 1; j < number.length; j++) {
                        for (int k = j + 1; k < number.length; k++) {
                            if (number[i] + number[j] + number[k] == 0) {
                                answer++;
                            }
                        }
                    }
                }
                return answer;
            }
        }
    }

