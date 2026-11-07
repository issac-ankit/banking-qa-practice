package day12;

public class StringReverse {

    public static String reverse(String text) {
        String result = "";
        for (int i = text.length()-1; i >=0; i--) {
            result = result + text.charAt(i);
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(reverse("SBIN"));   // Expected: NIBS
        System.out.println(reverse("HDFC"));   // Expected: CFDH_
    }
}