package Strings;

import java.util.*;
import java.util.stream.Collectors;

public class randomtrails {


    public static void main(String[] args) {


        List<Integer> numbers = Arrays.asList(1,1,2,3,4,5,5,7,6,7,7,8,3,2,0);

        System.out.println(numbers);

        Set<Integer> noDuplicates = new HashSet<>(numbers);

        System.out.println("without duplicates :" +noDuplicates);
//
//        for(Integer n : numbers){
//            noDuplicates.add(n);
//            System.out.println(n);
//        }

        Set<Integer> streamType = numbers.stream().collect(Collectors.toSet());
        System.out.println(streamType);

      //  System.out.println(noDuplicates);
    }
}
