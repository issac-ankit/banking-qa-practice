package day19;

public class PalindromeCheck {

    public static boolean isPalindrome(String input) {
        if (input == null) {
            return false;
        }

        String reversed = "";
        for (int i = input.length() - 1; i >= 0; i--) {
            reversed = reversed + input.charAt(i);

        }
        return reversed.equalsIgnoreCase(input);
    }

    public static void main(String[] args) {
        System.out.println(isPalindrome("MADAM"));   // Expected: true
        System.out.println(isPalindrome("Madam"));   // Expected: true
        System.out.println(isPalindrome("BANK"));    // Expected: false
        System.out.println(isPalindrome("A"));       // Expected: true
        System.out.println(isPalindrome(""));        // Expected: true
        System.out.println(isPalindrome(null));      // Expected: false
    }
}