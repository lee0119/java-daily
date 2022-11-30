package daily_co;

public class InsertDash {
    public static void main(String[] args) {
        String output = insertDash("454793");
//        System.out.println(output); // --> 4547-9-3
    }
    public static String insertDash(String str) {
        if(str.length()== 0) return null;

        String result = "" + str.charAt(0);
//        System.out.println(result);

        for(int i = 1; i < str.length(); i++) {
            int preNumber = Character.getNumericValue(str.charAt(i - 1)) % 2;
            int curNumber = Character.getNumericValue(str.charAt(i)) % 2;
            if(preNumber != 0 && curNumber != 0) {
                result = result + "-";
            }
//            System.out.println(result);
            result = result + str.charAt(i);
            System.out.println(i);
            System.out.println(result);
        }
        return result;
    }
}


