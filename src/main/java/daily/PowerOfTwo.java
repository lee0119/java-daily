package daily;


//수를 입력받아 2의 거듭제곱인지 여부를 리턴해야 합니다.
public class PowerOfTwo {
    public static void main(String[] args) {
        boolean output1 = powerOfTwo(16);
        System.out.println(output1); // true
        boolean output2 = powerOfTwo(22);
        System.out.println(output2); // false
    }

    public static boolean powerOfTwo(long num) {

        if (num == 1) return true;
        if (num % 2 != 0) return false;

        long power = 2;
        while (power < num) {
            System.out.println(power);
            power = power * 2;
        }
        return power == num;
    }
}