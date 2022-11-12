package studyfor;

public class If7 {
    public static void main(String[] args) {
        String output = makeMultiplesOfDigit(7);
        System.out.println(output); // --> "36"

        output = makeMultiplesOfDigit(19);
        System.out.println(output); // --> "369121518"

        output = makeMultiplesOfDigit(2);
        System.out.println(output); // --> ""

    }

    public static String makeMultiplesOfDigit(int num) {
        String result = "";
        // 스트링 리턴, "" 초기화
        // 변수 선언을 바로하기 3의 배수니까 3,6,9
        for (int i = 3; i <= num; i = i + 3) {
            result += i;
        }
        return result;
    }
}