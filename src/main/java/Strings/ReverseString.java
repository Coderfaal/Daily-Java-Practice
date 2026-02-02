package Strings;

public class ReverseString {


    public static void main(String[] args) {

        String s = "good evening";

        String reverse = new StringBuilder(s).reverse().toString();

        System.out.println(reverse);
    }
}
