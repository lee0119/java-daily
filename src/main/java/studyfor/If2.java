package studyfor;

public class If2 {

    public static void main(String[] args) {
        int output = factorial(4);
        System.out.println(output); // --> 120

    }
    public static int factorial(int num) {
//        int result = 1;
//        for (int i = 1; i <=num; i++) {
//            result = result* i;
//
//        }
//        return result;
//    }
    int ss = 1;
        for (int i = 1; i < num ; i++) {
            ss = ss* i;
        }
        System.out.printf("값은");
        return ss;

        }


}


