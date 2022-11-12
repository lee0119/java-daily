package studyfor;

public class If4 {
    public static void main(String[] args) {
        String output = makeDigits(5);
        System.out.println(output); // --> "12345"

        output = makeDigits(7);
        System.out.println(output); // --> "1234567"

    }
    public static String makeDigits(int num) {
        String result = "";

        for (int i = 0; i <= num; i++) {
            result += i;
        }
        return result;
    }
}
