package studyfor;

public class If5 {
    public static void main(String[] args) {
        String output = makeDigits2(5);
        System.out.println(output); // --> "1-2-3-4-5"

        output = makeDigits2(7);
        System.out.println(output); // --> "1-2-3-4-5-6-7"
    }


    public static String makeDigits2(int num) {
        String result = "1";

        int index = 1;
        while (index <= num) {
            result = result + "-" + index;
            index++;

        }
        return result;

    }
}
