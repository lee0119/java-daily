package Self;

public class Factorial {
    public static void main(String[] args) {

        int output = factorial(10);
        System.out.println(output); // --> 3628800

    }

    public static int factorial(int num) {
        if (num <= 1) return 1;
        System.out.println(num);

        return num * factorial(num-1);
    }
}
