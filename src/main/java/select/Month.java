package select;

public class Month {
    public static void main(String[] args) {
        Month test = new Month();
        int a=3, b=3;
        System.out.println(test.getDayName(a,b));
    }


    public String getDayName(int a, int b){
    String[] day = {"FRI", "SAT", "SUN", "MON", "TUE", "WED", "THU"};
    int[] month = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
    int date = 0;
        for (int i = 0; i < a - 1; i++) {
        date += month[i];
    }//[4] 31 + 29 = 60 + 1 = 61 % 7 =8...5   31 -1= 30 % 7 = 4
        System.out.println(date);
        date += b - 1;
        System.out.println(date);
        return day[date % 7];
}
}
