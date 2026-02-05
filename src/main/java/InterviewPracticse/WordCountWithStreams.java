package InterviewPracticse;

import java.util.Arrays;

public class WordCountWithStreams {

    public static void main(String[] args) {

        String s = "  Java   is   fun  ";

        long count = Arrays.stream(s.trim().split("\\s+")).count();

        System.out.println(count);
    }

}
