import java.util.*;

//자바 모의고사 수포자 
class Solution2 {
    public int[] solution2(int[] answers) {
        HashMap<Integer, Integer> map = new HashMap<>();
        List<Integer> list = new ArrayList<>();

        int[] a = {1, 2, 3, 4, 5};
        int[] b = {2, 1, 2, 3, 2, 4, 2, 5};
        int[] c = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};

        map.put(1,0);
        map.put(2,0);
        map.put(3,0);

        for(int i=0; i<answers.length; i++) {
            if(answers[i] == a[i%a.length]) map.put(1, map.get(1)+1);
            if(answers[i] == b[i%b.length]) map.put(2, map.get(2)+1);
            if(answers[i] == c[i%c.length]) map.put(3, map.get(3)+1);
        }

        int bigger = Math.max(Math.max(map.get(1), map.get(2)),map.get(3));
        for(int i=0; i<3; i++) {
            if(bigger == map.get(i+1)) list.add(i+1);
        }

        int[] ret = new int[list.size()];
        for(int i=0; i<list.size(); i++) {
            ret[i] = list.get(i);
        }

        Arrays.sort(ret);
        return ret;
    }
}