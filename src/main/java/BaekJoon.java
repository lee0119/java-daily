


//makeMarginalString
//문자열을 입력받아 해당 문자열을 처음부터 한 글자(letter)씩 다시 작성하려고 합니다.
//이 때, 한 글자를 추가할 때마다 부분적으로 완성된 문자열을 전부 이어붙인 문자열을 리턴해야 합니다.
//fibonacci

public class BaekJoon {

    public static void main(String[] args) {
        public int[] fibonacci(int num) {
            // TODO:

            int[] fibo = new int[num + 1 ];

                for (int i=0; i<=num; i++){
                if (i<= 1) fibo[i] = i;
                else fibo[i] =fibo[i - 2] + fibo[i -1 ];
            }
            return fibo;
        }
    }
}

