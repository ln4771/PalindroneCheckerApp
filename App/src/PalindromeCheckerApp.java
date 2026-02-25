public class PalindromeCheckerApp {
    public static void main(String[] args){
        System.out.println("Welcome to palindrome checker app");
        // ===== UC2 : Hardcoded Palindrome Check =====
        System.out.println("\nUC2: Print a Hardcoded Palindrome Result");

        String word = "madam";   // hardcoded string
        String reverse = "";

        // reverse the string
        for(int i = word.length() - 1; i >= 0; i--) {
            reverse = reverse + word.charAt(i);
        }

        // check palindrome
        if(word.equals(reverse)) {
            System.out.println(word + " is a Palindrome");
        } else {
            System.out.println(word + " is not a Palindrome");
        }
    }
}
