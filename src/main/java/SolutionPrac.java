import java.util.ArrayList;
import java.util.Collections;

public class SolutionPrac {
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
            return answer;
        }

    public static void main(String[] ars) {
        SolutionPrac numberss = new SolutionPrac();
        //입력요소를 선언해줘야 출력값이 나옴
        int[] numbers = {5, 9, 7, 10};
        int[] b = {5,0,2,7};
    }
}
