package InterviewPracticse;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamsCountFrequency {

    public static void main(String[] args) {
        String string = "faalguniiii";


        Map<Character,Long> frequency = string.chars()
                .mapToObj(c->(char)c)
                .collect(Collectors.groupingBy(c->c, LinkedHashMap::new,Collectors.counting()));

        frequency.forEach((k,v)-> System.out.println(k+"="+v));
    }
}
