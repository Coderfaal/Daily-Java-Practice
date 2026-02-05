package InterviewPracticse;

public class ReverseAString {

    public static void main(String[] args) {

        String s ="hello";

        String reveresed = new StringBuilder(s).reverse().toString();

        System.out.println(reveresed);
    }
}
