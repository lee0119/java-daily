package studyfor;

public class If {
    public static void main(String[] args) {
        boolean output = isOdd(17);
        System.out.println(output); // --> true

        output = isOdd(-8);
        System.out.println(output); // --> false
    }

    public static boolean isOdd(int num) {
        if (num < 0) {
            num = -num;
        }

        while (num > 0) {
            if (num == 1){
                return true;}

            num = num - 2;}

        return false;


        }
    }


