package InterviewPracticse;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class StreamsSecondHaighest {

    public static void main(String[] args) {

        List<Integer>nums = Arrays.asList(98,99,89,89,98,56,55,89,76,23,90,45,66,98,77,99);

        Optional<Integer> secondHghest = nums.stream()
                .distinct()
                .sorted(Comparator.reverseOrder())
                .skip(1)
                .findFirst();

     secondHghest.ifPresent(System.out::println);
    }
}
