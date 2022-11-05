package Solutions;


//프로그래머스 - 짝수와 홀수
//first study 
public class  Solution {
    public String solution(String s) {

    String answer = "";

    //짝수
        if(s.length() % 2 == 0){

        answer+=s.charAt(s.length()/2-1);
        answer+=s.charAt(s.length()/2);
        //  홀수
    }else{

        answer+=s.charAt(s.length()/2);
    }
        System.out.println(answer);
        return answer;

 }
}
