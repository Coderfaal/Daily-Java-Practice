package InterviewPracticse;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class FirstNonRepaetingCharacter {


    public static void main(String[] args) {

        String s = "aabbiccddeefggh";

        Character result = findFirstNonRepeatingCharacter(s);

        if (result!= null){
            System.out.println("first non repeating charcter : "+ result);
        }else {
            System.out.println("no non repeating character");
        }
    }


    public static Character findFirstNonRepeatingCharacter (String s){


        Map<Character,Integer> map = new LinkedHashMap<>();


        //counting frequency
        for (char c :s.toCharArray()){
            map.put(c,map.getOrDefault(c,0)+1);

        }

        //for count = 1
        for(Map.Entry<Character,Integer> entry : map.entrySet()){
            if(entry.getValue()==1){
                return entry.getKey();
            }
        }


        return null;
    }
}
