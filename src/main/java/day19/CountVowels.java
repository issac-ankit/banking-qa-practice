package day19;

public class CountVowels {

    public static int countVowels(String input) {
        if (input == null) {
            return 0;                          // blank 1: what do we return for null?
        }
        int count = 0;                         // blank 2: start value
        for (int i = 0; i < input.length(); i++) {
            char c = Character.toLowerCase(input.charAt(i));
            if ("aeiou".indexOf(c) != -1) {
                count = count + 1;          // blank 3: add one
            }
        }
        return count;                           // blank 4: what do we give back?
    }

    public static void main(String[] args) {
        System.out.println(countVowels("Banking"));   // Expected: 2
        System.out.println(countVowels("AEIOU"));     // Expected: 5
        System.out.println(countVowels("xyz"));       // Expected: 0
        System.out.println(countVowels(""));          // Expected: 0
        System.out.println(countVowels(null));        // Expected: 0
    }
}
