package day11;

public class IfscValidator {

    public static boolean isValidSbiIfsc(String ifscCode) {
        if (ifscCode == null) {
            return false;
        }
        String code = ifscCode.trim();          // remove spaces once
        if (code.length() != 11) {
            return false;
        }
        if (!code.startsWith("SBIN")) {           // ! means NOT
            return false;
        }
        if (code.charAt(4) != '0') {
            return false;
        }
        return true;                               // passed every rule
    }
    public static void main(String[] args) {
        System.out.println(IfscValidator.isValidSbiIfsc("SBIN0001234")); //expected: true
        System.out.println(IfscValidator.isValidSbiIfsc("SBIN000123")); //expected: false
        System.out.println(IfscValidator.isValidSbiIfsc("HDFC0001234")); //expected: false
        System.out.println(IfscValidator.isValidSbiIfsc("SBIN1001234")); //expected: false
        System.out.println(IfscValidator.isValidSbiIfsc("  SBIN0001234  ")); //expected: true
        System.out.println(IfscValidator.isValidSbiIfsc(  null)); //expected: false







    }
}
