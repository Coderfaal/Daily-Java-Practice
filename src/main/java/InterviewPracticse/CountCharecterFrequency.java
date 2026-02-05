package InterviewPracticse;

import java.util.LinkedHashMap;
import java.util.Map;

public class CountCharecterFrequency {

    public static void main(String[] args) {
        String s = "faalgunii";


        Map<Character,Integer> frequencyMap = new LinkedHashMap<>();

        for(char c :s.toCharArray()){
            frequencyMap.put(c,frequencyMap.getOrDefault(c,0)+1);
        }

        for(Map.Entry<Character,Integer>entry :frequencyMap.entrySet()){
            System.out.println(entry.getKey()+"="+ entry.getValue());
        }

    }
}
