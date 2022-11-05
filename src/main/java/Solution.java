import java.util.ArrayList;
import java.util.Collections;

public class Solution {
        public int[] solution(int[] numbers) {

            int[] answer;
            ArrayList<Integer> arrList = new ArrayList<>();

            for(int i=0; i<numbers.length; i++){
                for(int j=i+1; j<numbers.length; j++){

                    if(!arrList.contains(numbers[i]+numbers[j])){
                        arrList.add(numbers[i]+numbers[j]);
                    }
                }
            }
            Collections.sort(arrList);

            int cnt = 0;
            answer = new int[arrList.size()];
            for(int arr : arrList){
                answer[cnt++] = arr;
            }
//            System.out.println(solution(int[] a);
            return answer;
        }
    }