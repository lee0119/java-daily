package daily_co;

public class LetterCapitalize {
    public static void main(String[] args) {
        String output1 = letterCapitalize("hello world");
        System.out.println(output1); // "Hello World"
        String output2 = letterCapitalize("java  is good");
        System.out.println(output2); // "Java  Is Good"
    }

        public static String letterCapitalize(String str) {


            if(str.length() == 0) return "";

            String[] words = str.split(" ");
            String result = "";

            for(int i = 0; i < words.length; i++) {
                if(words[i].isEmpty()) {
                    words[i] = words[i];
                } else {
                    words[i] = String.valueOf(words[i].charAt(0)).toUpperCase() + words[i].substring(1);
                }
            }

            result = String.join(" ", words);

            return result;
        }
    }

