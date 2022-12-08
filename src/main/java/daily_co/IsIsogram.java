package daily_co;

import java.util.HashMap;


//문제
//문자열을 입력받아 아이소그램인지 여부를 리턴해야 합니다. 아이소그램(isogram)은 각 알파벳을 한번씩만 이용해서 만든 단어나 문구를 말합니다.
//
//입력
//인자 1 : str
//String 타입의 공백이 없는 알파벳 문자열
//출력
//boolean 타입을 리턴해야 합니다.
//주의 사항
//빈 문자열을 입력받은 경우, true를 리턴해야 합니다.
//대소문자는 구별하지 않습니다.

public class IsIsogram {
    public static void main(String[] args) {
        boolean output = isIsogram("aba");
        System.out.println(output); // false

        output = isIsogram("Dermatoglyphics");
        System.out.println(output); // true

        output = isIsogram("moOse");
        System.out.println(output); // false
    }
    public static boolean isIsogram(String str) {
        // TODO:

        if(str.length() == 0) return true;

        //사용된 알파벳을 저장할 HashMap을 선언합니다.
        HashMap<Character, String> cache = new HashMap<Character, String>();

        //입력된 전체 문자열을 모두 소문자로 변환합니다.
        str = str.toLowerCase();

        //입력된 문자열을 순회하며
        for(int i = 0; i < str.length(); i++) {
            //HashMap에 이미 해당 알파벳이 저장되어 있다면
            if(cache.containsKey(str.charAt(i))) {
                //false를 리턴합니다.
                return false;
            }
            //HashMap에 해당 문자열이 저장되어 있지 않다면, 저장합니다.
            cache.put(str.charAt(i), "Exists");
        }
        //모든 문자열을 순회한다면 true를 리턴합니다.
        return true;
    }
}

