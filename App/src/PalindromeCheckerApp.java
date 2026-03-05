public class PalindromeCheckerApp {

    public static void main(String[] args) {

        // ===== UC1 =====
        System.out.println("=================================");
        System.out.println("      Palindrome Checker App     ");
        System.out.println("=================================");

        System.out.println("Welcome to the Palindrome Checker Application!");
        System.out.println("This program will check whether a word is a palindrome.");


        // ===== UC2 =====
        System.out.println("\nUC2: Hardcoded Palindrome Result");

        String word = "madam";
        String reverse = "";

        for (int i = word.length() - 1; i >= 0; i--) {
            reverse += word.charAt(i);
        }

        if (word.equals(reverse)) {
            System.out.println(word + " is a Palindrome");
        } else {
            System.out.println(word + " is not a Palindrome");
        }

    }
}
