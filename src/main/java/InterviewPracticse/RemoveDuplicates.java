package InterviewPracticse;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;

public class RemoveDuplicates {

    public static void main(String[] args) {
        int [] a ={4,2,2,3,4,5,6,6,5,1};



        List<Integer> duplicates = Arrays.stream(a).boxed().collect(Collectors.toList());
        Set<Integer> removedDuplicates = new TreeSet<>(duplicates);

        System.out.println(removedDuplicates);
    }
}
