package daily_co;
//문제
//문자열을 요소로 갖는 배열을 입력받아 가장 짧은 문자열과 가장 긴 문자열을 제거한 배열을 리턴해야 합니다.
//
//입력
//인자 1 : arr
//String 타입을 요소로 갖는 배열
//arr[i].length()는 20 이하
//출력
//배열을 리턴해야 합니다.
//주의 사항
//가장 짧은 문자열의 길이와 가장 긴 문자열의 길이가 같은 경우는 없습니다.
//가장 짧은 문자열 또는 가장 긴 문자열이 다수일 경우, 나중에 위치한 문자열을 제거합니다.
//공백을 입력받을 경우, null을 반환합니다.

public class RemoveExtremes {
    public static void main(String[] args) {
        String[] output = removeExtremes(new String[]{"a", "b", "c", "def"});
        System.out.println(output); // --> ["a"', "b"]

        output = removeExtremes(new String[]{"where", "is", "the", "longest", "word"});
        System.out.println(output); // --> ["where", "the", "word"]
    }


    public static String[] removeExtremes(String[] arr) {
        // TODO:
        if(arr.length == 0)  return null;


        int shortestLen = 20;
        int longestLen = 0;
        int shortestIdx = 0;
        int longestIdx = 0;


        for (int i = 0; i < arr.length; i++) {

            if (arr[i].length() >= longestLen) {
                longestLen = arr[i].length();
                longestIdx = i;
            }

            if (arr[i].length() <= shortestLen) {
                shortestLen = arr[i].length();
                shortestIdx = i;
            }
        }

        String[] result = new String[arr.length - 2];
        int curIndex = 0;

        for (int i = 0; i < arr.length; i++) {
            if (i != shortestIdx && i != longestIdx) {
                result[curIndex] = arr[i];
                curIndex++;
            }
        }

        return result;
    }
}


