package daily;

import java.util.HashMap;

public class Test {
    public static void main(String[] args) {

        // HashMap 생성
        HashMap<String, Integer> map = new HashMap<>();

        // Entry 객체 저장
        map.put("피카츄", 85);
        map.put("피카츄", 6);
        map.put("꼬부기", 95);
        map.put("야도란", 75);
        map.put("파이리", 65);
        map.put("피존투", 15);

        // 저장된 총 Entry 수 얻기
//        System.out.println("총 entry 수: " + map.size());
        System.out.println(new HashMap<>(map));
    }
}