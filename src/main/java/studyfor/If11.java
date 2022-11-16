package studyfor;

public class If11 {
    public static void main(String[] args) {
        int output = countCharacter("I am a hacker", 'a');
        System.out.println(output); // --> 3
    }

    public static int countCharacter(String str, char letter) {

        int result = 0;
        int length = str.length();
        System.out.println(str.length());
        for (int i = 0; i < length; i++) {
            System.out.println(i);
            if(str.charAt(i) == letter)
                result = result + 1;
        }

    return result;
}
}