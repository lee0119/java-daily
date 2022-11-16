package stream;

import java.util.Arrays;
import java.util.List;

public class Stream2 {
    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);
        double output = computeAverageOfNumbers(list);
        System.out.println(output); // --> 3
    }

    public static double computeAverageOfNumbers(List<Integer> list) {

        return list.stream()
                .mapToInt(m ->  m)
                .sum();
    }
}
