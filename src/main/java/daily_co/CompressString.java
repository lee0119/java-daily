package daily_co;

//문제
//문자열을 입력받아 연속되는 문자가 있을 경우, 연속 구간을 반복되는 수와 문자로 조합한 형태로 압축한 문자열을 리턴해야 합니다.
//
//입력
//인자 1 : str
//String 타입의 알파벳 문자열
//출력
//String 타입을 리턴해야 합니다.
//주의 사항
//빈 문자열을 입력받은 경우, 빈 문자열을 리턴해야 합니다.
//3개 이상 연속되는 문자만 압축합니다.

public class CompressString {
    public static void main(String[] args) {
        String output = compressString("abc");
        System.out.println(output); // --> "abc"

        String output1= compressString("wwwggoppopppp");
        System.out.println(output1); // --> "3wggoppo4p"
    }

    public static String compressString(String str) {
        // TODO:
        if(str.length() == 0) return "";
        // 연속되는 문자를 기록하기 위한 변수를 선언하고
        // 첫 번째 문자로 초기화합니다.
        char before = str.charAt(0);
        // 동일한 문자의 반복 횟수를 저장할 변수를 선언, 초기값은 1로 할당합니다.
        int count = 1;
        // 정답으로 리턴할 문자열을 선언합니다. 초기값은 공백으로 할당합니다.
        String result = "";

        // 마지막 부분이 연속된 문자일 경우를 위해 dummy 문자 추가합니다.
        str = str + ' ';
        for (int i = 1; i < str.length(); i++) {
            // 동일한 문자가 반복될 경우
            if (before == str.charAt(i)) {
                //count를 1씩 더해줍니다.
                count++;
            } else {
                // 이전과 다른 문자일 경우,
                // 반복된 횟수가 3 이상일 경우에만 문자열을 압축합니다.
                if (count >= 3) {
                    result = result + count + before;
                } else {
                    //count의 수만큼 결과에 문자열을 저장합니다.
                    for(int j = 0; j < count; j++) {
                        result = result + before;
                    }
                    //자바 11에서 지원하는 String.repeat메소드를 활용하면 조금 더 간단하게 작성이 가능합니다.
                    //result = result + Character.toString(before).repeat(count);
                }
                before = str.charAt(i);
                count = 1;
            }
        }
        return result;
    }
}
