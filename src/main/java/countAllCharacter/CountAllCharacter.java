package countAllCharacter;

import java.util.HashMap;



public class CountAllCharacter {
    public static void main(String[] args) {
        HashMap<Character, Integer> output = countAllCharacter("banana");
        System.out.println(output); // --> {b=1, a=3, n=2}

    }
    public static HashMap<Character, Integer> countAllCharacter(String str) {
    if(str =="") return null;
    HashMap<Character, Integer> map = new HashMap<>();
    //str을 순회하면서
        for (int i = 0; i < str.length(); i++){
        char character = str.charAt(i);
        //str.charAt(i)가 hashMap에 이미 있다면 , 기존의 값 1 증가시켜주기
        if(map.containsKey(character)){
            map.put(character, map.get(character) +1);
        }
        //그렇지 않다면, 새로운 엔트리를 만들어주기 ->str.charAt(i)가 키, 1을 값으로 가지는 엔트리
        else map.put(character, 1);
    }
        return str.isEmpty() ? null :map;
            }
        }




