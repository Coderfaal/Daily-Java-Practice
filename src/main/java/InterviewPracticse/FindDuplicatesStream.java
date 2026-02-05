package InterviewPracticse;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class FindDuplicatesStream {


    public static void main(String[] args) {

        int [] array ={1,3,2,2,4,5,5,6,6,7,8};

        Set<Integer> seen = new HashSet<>();
        Set<Integer> duplicates = Arrays.stream(array).boxed()
                .filter(num->!seen.add(num))
                .collect(Collectors.toSet());


        System.out.println(duplicates);
    }
}
