package studyfor;

public class If6 {
    public static void main(String[] args) {
        String output = makeOddDigits(3);
        System.out.println(output); // --> "135"

        output = makeOddDigits(5);
        System.out.println(output); // --> "13579"
    }

    public static String makeOddDigits(int num) {

        String result = "";

        int last = 2;
        int i = 1;
        while (last < num) {
            result += i;
            i += 2;
            last++;
        }

        return result;
    }
}
