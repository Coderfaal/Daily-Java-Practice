package corejava.strings;

public class PalindromeChecker {
    public static boolean isPalindrome(String str) {
        String reversed = new StringBuilder(str).reverse().toString();
        return str.equalsIgnoreCase(reversed);
     

    }

    public static void main(String[] args) {
        String input = "Madam";
        System.out.println("Is '" + input + "' a palindrome? " + isPalindrome(input));
    }
}
