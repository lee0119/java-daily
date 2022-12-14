package daily_co;


//문제
//암호화된 문자열과 암호화 키를 입력받아 복호화된 문자열을 리턴해야 합니다.
//카이사르 암호(Caesar cipher)는 평문(plaintext)을 암호키 secret개만큼 (오른쪽으로) 평행이동시켜 암호화 합니다. 복호화는 암호화된 문자열을 원래의 평문으로 복원하는 것을 말합니다.
//
//'hello'를 secret 3으로 암호화한 경우: 'khoor'
//'codestates'를 secret 11로 암호화한 경우: 'nzopdelepd'
//입력
//인자 1 : str
//String 타입의 알파벳 소문자 문자열
//인자 2 : secret
//int 타입의 암호화 키
//출력
//String 타입을 리턴해야 합니다.
//주의 사항
//빈 문자열을 입력받은 경우, 빈 문자열을 리턴해야 합니다.
//공백은 그대로 두어야 합니다.
//입력된 문자열은 모두 소문자만 입력됩니다.

public class DecryptCaesarCipher {
    public static void main(String[] args) {
        String output = decryptCaesarCipher("khoor", 3);
        System.out.println(output); // --> hello

        output = decryptCaesarCipher("zruog", 3);
        System.out.println(output); // --> world
    }

    public static String decryptCaesarCipher(String str, int secret) {
        // TODO:
        //알파벳을 모두 String으로 선언, 할당합니다.
        String alpha = "abcdefghijklmnopqrstuvwxyz";

        //결과를 담을 String을 선언합니다.
        String result = "";

        //입력된 str만큼 순회하며
        for(int i = 0; i < str.length(); i++) {
            //해당 문자열이 공백일 경우
            if(str.charAt(i) == ' ') {
                //결과에 공백을 그대로 추가합니다.
                result = result + str.charAt(i);
            } else {
                //이외의 경우, alpha에서 현재 문자열의 index를 찾아준 이후,
                int asis = alpha.indexOf(str.charAt(i));
                //복호화는 반대 방향으로 이루어기 때문에 seceret을 빼주게 됩니다.
                //전체 길이를 더하고, 나머지를 구하는 이유는 해당 문자열의 index를 벗어날 경우를 고려한 계산식입니다.
                int tobe = (asis - secret + alpha.length()) % alpha.length();
                //복호화한 문자열을 result에 추가합니다.
                result = result + alpha.charAt(tobe);
            }
        }
        //복호화된 문자열이 저장된 변수를 리턴합니다.
        return result;
    }
}
