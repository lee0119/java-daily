//package stack;
//
//import java.util.ArrayList;
//import java.util.Arrays;
//import java.util.List;
//
//public class Queue {
//    public static void main(String[] args) {
//        int[] boxes = new int[]{5, 1, 4, 6};
//        int output = paveBox(boxes);
//        System.out.println(output); // 3
//
//        int[] boxes2 = new int[]{1, 5, 7, 9};
//        int output2 = paveBox(boxes);
//        System.out.println(output2); // 1
//    }
//
//
//    //queue 시간 순서대로 사용해야 할 때 사용한다.
//
//
//    public static int paveBox(Integer[] boxes) {
//        ArrayList<Integer> answer = new ArrayList<>();
//        List<Integer> arrayList = new ArrayList<Integer>(Arrays.asList(boxes));
//
//
//        //0보다 클 때 크기만큼 for문 ->
//        while (arrayList.size() > 0) {
//            for(int i = 0; i < arrayList.size(); i++) {
//                if(arrayList.get(i) > arrayList.get(0)) {
//                    answer.add(i);
//                    arrayList = arrayList.subList(i , arrayList.size());
//                    break;
//                }
//
//                if(i == arrayList.size() - 1) {
//                    answer.add(arrayList.size());
//                    arrayList.clear();
//                }
//            }
//        }
//        return answer.stream().max(Integer::compare).orElse(-1);
//    }
//}
//
//
