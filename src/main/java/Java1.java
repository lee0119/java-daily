import java.util.Scanner;



// 직사각형 별찍기

    class java1 {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            int m = sc.nextInt();

            for(int i=0; i<m; i++) //m줄을 출력해야 하니까 m번 반복
            {
                for(int j=0; j<n; j++) //n개의 별을 출력해야 하니까 n번 반복
                    System.out.print("*");
                System.out.println(""); // n개의 별을 출력하면 다음 줄로 넘김
            }
        }
    }
