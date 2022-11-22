package Test;

import java.util.HashSet;

public class Poketmon {


    public int solution(int[] nums) {

        int answer = 0;
        //중복 허용 xxx 예시 - 최대한 많은 종류의 폰켓몬을 포함해서 N/2마리를 선택하려 합니다.
        HashSet<Integer> pika = new HashSet<Integer>();

        //배열 다 돌면서  HashSet에 add
        for (int i = 0; i < nums.length; i++) {
            pika.add(nums[i]);
        }

        //  N/2마리의 폰켓몬을 선택하는 방법
        if (pika.size() >= nums.length / 2) answer = nums.length / 2;
        else answer = pika.size();

        return answer;
    }


    public static void main(String[] args) {


     }
    }
