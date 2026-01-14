package Collections;

import java.util.HashMap;
import java.util.Map;

public class FrequencyOfNonRepeatingChars {


    public static void main(String[] args) {

        String s = "aabccdeaff";

        Map<Character,Integer> frequency = new HashMap<>();

        for(char c : s.toCharArray()){

            frequency.put(c,frequency.getOrDefault(c,0)+1);


        }
        System.out.println(frequency +"-> Repeated characters ");

        for(Map.Entry<Character,Integer> e : frequency.entrySet()){
            if(e.getValue()==1){
                System.out.println(e.getKey());
                break;
            }

            System.out.println("....");

        }

    }
}
