package stream;

import java.util.Arrays;
import java.util.List;

public class Stream1 {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);
        int output = computeSumOfAllElements(list);
        System.out.println(output); // --> 15
    }

    public static int computeSumOfAllElements(List<Integer> list) {
        return list.stream()
                .mapToInt(m -> m)// 스트림을 IntStream으로 변환합니다.
                .sum(); // 최종 연산으로 총 합을 구합니다.
    }
}