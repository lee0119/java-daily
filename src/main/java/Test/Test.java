package Test;

import java.util.ArrayList;
import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
            Test test = new Test();

            int[] answers = { 1, 2, 3, 4, 5 };

            System.out.println(Arrays.toString(test.Test1(answers)));

            int[] answers2 = { 1, 3, 2, 4, 2 };
            System.out.println(Arrays.toString(test.Test1(answers2)));

        }

    public static int[] Test1(int[] answers) {


        int[] person1 = {1, 2, 3, 4, 5};
        int[] person2 = {2, 1, 2, 3, 2, 4, 2, 5};
        int[] person3 = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};

        int[] score = {0, 0, 0};

        for(int i = 0; i < answers.length; i++){
            if(answers[i] == person1[i%5])
                score[0]++;
            if(answers[i] == person2[i%8])
                score[1]++;
            if(answers[i] == person3[i%10])
                score[2]++;

        }

        // 최대값 찾기
        int max = 0;
        for(int i = 0; i < 3; i++){
            if(score[i] > max)
                max = score[i];
        }

        // 최대값과 같은 수포자 찾기
        ArrayList<Integer> tmp = new ArrayList<>();
        for(int i = 0; i < 3; i++){
            if(score[i] == max){
                tmp.add(i+1);
            }
        }

        // 최대값과 같은 수포자 answer에 넣기.
        int[] answer = new int[tmp.size()];
        for(int i = 0; i < tmp.size(); i++)
            answer[i] = tmp.get(i);

        System.out.println(answer);
        return answer;
    }
}

