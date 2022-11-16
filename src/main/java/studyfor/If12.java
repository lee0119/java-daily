package studyfor;

public class If12 {
    public static void main(String[] args) {
        int output = getMaxNumberFromString("53862");
        System.out.println(output); // --> 8

//        output = getMaxNumberFromString("4321");
//        System.out.println(output); // --> 4
    }


    public static int getMaxNumberFromString(String str) {

        int result = 0;
        int length = str.length();

        for (int i = 0; i < length ; i++) {
//            System.out.print(i);
            char strings = str.charAt(i);

            int num = Character.getNumericValue(strings);
            System.out.println(strings);

            //if 문으로 반복하기 
            if (num > result) {
                result = num;
            }
        }
            return result;
        }
}
