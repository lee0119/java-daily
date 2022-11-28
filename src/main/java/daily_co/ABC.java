package daily_co;

import java.util.ArrayList;
import java.util.Arrays;

public class ABC {


    public static ArrayList<String[]> rockPaperScissors(int rounds) {
        ArrayList<String[]> outcomes = new ArrayList<>();

        // 리턴 왜? 횟수 / 가위바위보 중 뭐를 냈는지? 요소 / 결과를 담을 리스트
        return permutation(rounds, new String[]{}, outcomes);
    }


        public static ArrayList<String[]> permutation(int roundsToGo, String[] playedSoFar, ArrayList<String[]> outcomes) {
            // rounds가 0일 경우 outcones 배열에 삽입하고, 재귀에서 빠져나옵니다.
            //사실상 끝
            if(roundsToGo == 0) {
                outcomes.add(playedSoFar);
                return outcomes;
            }





            // 여기서 계속 돈다 재귀와 반복문
            String[] rps = new String[]{"rock", "paper", "scissors"};

            // rps 배열을 한 번씩 순회합니다. 0,1,2
            for(int i = 0; i < rps.length; i++) {
                // rps의 i번째 요소를 변수에 담아서
                String currentPlay = rps[i];

                // permutate(본인)에 기존 rounds에서 하나 뺀 숫자와, 일회용 배열 playedSoFar에 currentPlay를 삽입하여 재귀를 실행합니다.
                // rounds에서 하나를 빼는 이유는, 일회용 배열의 크기를 rounds만큼 맞춰주기 위함입니다. [rock, rock, rock]

                //null ,
                String[] concatArray = Arrays.copyOf(playedSoFar, playedSoFar.length + 1);  //배열의 크기를 하나 늘리고, currentPlay를 요소로 넣어줍니다.
               // {null}, {rock}
                System.out.println(playedSoFar);
                // {null}
                 // concatArray.length = 1 ;
                // {null}, {rock}
                // concatArray.length = 2 ;

                //concatArray[0] =currentPlay;
                //0번째 배열이 최근꺼다 {null, rock  [1]번재 배열이 최근이다.

                concatArray[concatArray.length - 1] = currentPlay;
                System.out.println();
                //{rock,rock, }
                //*** 3판 {rock} / list
                //2  0
                outcomes = permutation(roundsToGo - 1, concatArray, outcomes);
            }
            // 계속 돌아간다.
            // {null, null ,rock}->x절대 아니다        /       {rock} - 40줄에서 처럼 length +1






            for(String[] data: outcomes) {
                //5번 가위바위보 했을때 경우의 수들
//                System.out.println(Arrays.toString(data));
            }
            // outcomes를 반환합니다.
            return outcomes;
        }



    public static void main(String[] args) {


        ArrayList<String[]> output = rockPaperScissors(3);

        }
    }

