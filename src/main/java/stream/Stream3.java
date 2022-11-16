package stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

//import static stream.Stream2.computeAverageOfNumbers;

public class Stream3 {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);
        List<Integer> output = computeAverageOfNumbers(list);
        System.out.println(output); // --> [2, 4]
    }

    public static List<Integer> computeAverageOfNumbers(List<Integer> list) {
        return list.stream()
                .filter(e -> e % 2 == 0) // 각 요소를 순회하며 짝수인지 검사합니다.
                .collect(Collectors.toList()); // 최종적으로 리스트의 형태로 만듭니다.
    }
}