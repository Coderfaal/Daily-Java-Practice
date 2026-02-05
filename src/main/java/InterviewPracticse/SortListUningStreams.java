package InterviewPracticse;

import java.util.*;
import java.util.stream.Collectors;

public class SortListUningStreams {

    public static void main(String[] args) {

        List<Integer> nums = Arrays.asList(1,2,3,4,5,6,7,8,9,2,4,6);

        List<Integer> sortedList = nums.stream()
                        .sorted()
                .collect(Collectors.toList());
        System.out.println(sortedList);


        List<Integer> descendingOrder = nums.stream()
                .sorted(Comparator.reverseOrder())
                .collect(Collectors.toList());
        System.out.println(descendingOrder);

        Set<Integer> duplicatedRemoved = new TreeSet<>(nums);
        System.out.println(duplicatedRemoved);

    }
}
