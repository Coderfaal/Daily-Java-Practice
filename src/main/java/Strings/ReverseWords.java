package Strings;

public class ReverseWords {


    public static void main(String[] args) {


        String s = "java is powerful";
        System.out.println(reversedWords(s));

    }
    public static String reversedWords(String s){
        StringBuilder words = new StringBuilder();
        StringBuilder result = new StringBuilder();

        for(int i = s.length()-1 ; i>=0 ;i--){
            char c = s.charAt(i);
            if(c != ' '){
                words.append(c);
            }else {

                if(words.length()>0){
                    result.append(words.reverse());
                    result.append(' ');
                    words.setLength(0);
                }
            }
        }

        if(words.length()>0){
            result.append(words.reverse());
        }
        return result.toString();
    }
}
