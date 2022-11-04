


//makeMarginalString
//문자열을 입력받아 해당 문자열을 처음부터 한 글자(letter)씩 다시 작성하려고 합니다.
//이 때, 한 글자를 추가할 때마다 부분적으로 완성된 문자열을 전부 이어붙인 문자열을 리턴해야 합니다.
//fibonacci

public class BaekJoon {

    public static void main(String[] args) {
        public int[] mergeArrays (int[] arr1, int[] arr2) {
            // TODO:
            int[] answer = new int[arr1.length + arr2.length];//{0,0,0,0}

            System.arraycopy(arr1, 0 , answer, 0 , arr1.length); //{1,2,0,0}
            System.arraycopy(arr2, 0 , answer, arr1.length, arr2.length); //{1,2,3,4}

            return answer;
        }
    }

