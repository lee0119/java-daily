package studyfor;

public class If3 {
    public static void main(String[] args) {

    String output = repeatString("code", 3);
    System.out.println(output);
    String input = repeatString("hi",3);
    System.out.println(input);
}

    public static String repeatString(String str, int num) {
        String result = "";

        if (str.isEmpty())
            return result;

        for (int i = 0; i < num; i++)
            result = result + str;

        return result;
    }
}