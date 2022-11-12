package studyfor;

public class If8 {
    public static void main(String[] args) {
        int output = makeMultiplesOfDigit2(8, 12);
        System.out.println(output); // --> 3

        output = makeMultiplesOfDigit2(12, 8);
        System.out.println(output); // --> 3

        output = makeMultiplesOfDigit2(1, 3);
        System.out.println(output); // --> 1

        output = makeMultiplesOfDigit2(0, 0);
        System.out.println(output); // --> 0

        output = makeMultiplesOfDigit2(2, 2);
        System.out.println(output); // --> 1
    }


    public static int makeMultiplesOfDigit2(int num1, int num2) {

        int s = 0;
        int start = num1;
        int end = num2;

        if (num1 > num2) {
            start = num2;
            end = num1;
        }
        if (start == 0) {
            start = 3;
        }
        for (int i = start; i <= end; i++) {
            if (i % 2 == 0) {
                s = s +1;
            }
        }
        return s;
    }

}
