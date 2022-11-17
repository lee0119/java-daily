package Self;

public class IsOdd {
    public static void main(String[] args) {
        boolean output = isOdd(17);
        System.out.println(output); // --> true

        output = isOdd(-8);
        System.out.println(output); // --> false
    }

    public static boolean isOdd(int num) {
        if (num == 0 ) return false;
        if (num == 1 ) return true;

        if ( num < 0)return isOdd(-num);
        System.out.println(num);
        return isOdd(num -2 );
    }
}