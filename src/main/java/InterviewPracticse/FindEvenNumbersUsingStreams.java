package InterviewPracticse;

import java.util.Arrays;
import java.util.Set;
import java.util.stream.Collectors;

public class FindEvenNumbersUsingStreams {

    public static void main(String[] args) {

        int[] a = {1, 2, 3, 4, 5, 6,6,7,8};

        Set<Integer> evenNumbers = Arrays.stream(a)
                .filter(n->n%2==0)
                .boxed()
                .collect(Collectors.toSet());

        System.out.println(evenNumbers);
    }
}
