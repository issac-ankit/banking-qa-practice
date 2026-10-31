package day11;

public class StringPractice {

    public static void main(String[] args) {
        String message = "  Transfer SUCCESSFUL. Ref: TXN8891  ";
        String trimmed = message.trim();

        System.out.println(trimmed); //expected: Transfer SUCCESSFUL. Ref: TXN8891
        System.out.println(trimmed.contains("TXN8891")); //expected: true
        System.out.println(trimmed.equalsIgnoreCase("transfer successful. ref: txn8891")); //expected: true
        System.out.println(trimmed.length());//expected: 33

    }
}
