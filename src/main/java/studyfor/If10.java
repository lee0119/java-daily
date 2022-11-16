package studyfor;

public class If10 {
    public static void main(String[] args) {
        int output = findTheBug("wo#rd");
        System.out.println(output); // --> 2

        output = findTheBug("#hello");
        System.out.println(output); // --> 0

        output = findTheBug("bug");
        System.out.println(output); // --> -1
    }


    public static int findTheBug(String word) {
        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i) == '#') {
                return i;
            }
        }
        return -1;
    }
}
