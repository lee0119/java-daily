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
//레벨 1-18 신고결과받기
import java.util.*;
class Solution2 {
    public int[] solution(String[] id_list, String[] report, int k) {

        Map<String,List<String>> map= new HashMap<>();
        Map<String,Integer> mail_map = new HashMap<>();
        for(String user: id_list){
            List<String> list = new LinkedList<>();
            map.put(user,list);
            mail_map.put(user,0);
        }
        for(String temp: report){
            String[] arr=temp.split(" ");
            String attacker=arr[0];
            String defender=arr[1];
            List<String> list =map.get(defender);
            if(list.contains(attacker)){
                continue;
            }
            list.add(attacker);
            map.put(defender,list);
        }
        for(String data: map.keySet()){
            List<String> list =map.get(data);
            if(list.size()>=k){
                for(String user: list){
                    int count =mail_map.get(user)+1;
                    mail_map.put(user,count);
                }
            }
        }
        int i=0;
        int[] answer = new int[id_list.length];
        for(String data: id_list){
            answer[i]= mail_map.get(data);
            i++;
        }
        return answer;
    }
}
