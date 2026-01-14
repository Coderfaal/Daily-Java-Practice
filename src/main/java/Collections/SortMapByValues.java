package Collections;

import java.util.*;

public class SortMapByValues {

    public static void main(String[] args) {


        Map<String, Integer> map = new HashMap<>();

        map.put("b", 1);
        map.put("c", 2);
        map.put("a", 3);
        map.put("f",0);


        Map<String,Integer> sortedMap = new TreeMap<>(map);

        System.out.println(sortedMap+" -> :sorted by keys");

        System.out.println("________");


        List<Map.Entry<String ,Integer>> list = new ArrayList<>(map.entrySet());

        list.sort(Map.Entry.comparingByValue());


        Map<String,Integer> sortedMap2 = new LinkedHashMap<>();
        for(Map.Entry<String,Integer> e : list){
            sortedMap2.put(e.getKey(), e.getValue());
        }
        System.out.println(sortedMap2 +" -> :sorted by values");
    }
}
