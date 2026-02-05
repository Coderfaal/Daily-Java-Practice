package InterviewPracticse;

import java.util.*;
import java.util.stream.Collectors;

public class FilterEvenOddNumbersStreams {

    public static void main(String[] args) {

        List<Integer> nums = Arrays.asList(1,2,3,4,5,6,7,8,9,2,4,6);


        //for even
        List<Integer> even = nums.stream()
                .filter(n->n%2==0)
                .collect(Collectors.toList());
        System.out.println(even);


        //for odd
        List<Integer> odd = nums.stream()
                .filter(n->n%2!=0)
                .collect(Collectors.toList());
        System.out.println(odd);

        System.out.println("________________");



        //duplicates
        Set<Integer> duplicatesremoved = new TreeSet<>(nums);

        System.out.println(duplicatesremoved);

        Set<Integer> seen = new HashSet<>();

        Set<Integer> duplicates = nums.stream()
                .filter(n->!seen.add(n)).collect(Collectors.toSet());
        System.out.println(duplicates);

    }
}
