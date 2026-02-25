import java.util.Scanner;

public class PalindromeCheckerApp {

    public static void main(String[] args) {

        // ===== UC1 =====
        System.out.println("Palindrome Checker App");
        System.out.println("UC1: Application Entry & Welcome Message");

        // ===== UC2 =====
        System.out.println("\nUC2: Hardcoded Palindrome Result");

        String word = "madam";
        String reverse = "";

        for(int i = word.length() - 1; i >= 0; i--) {
            reverse = reverse + word.charAt(i);
        }

        if(word.equals(reverse)) {
            System.out.println(word + " is a Palindrome");
        } else {
            System.out.println(word + " is not a Palindrome");
        }

        // ===== UC3 =====
        System.out.println("\nUC3: Palindrome Check Using String Reverse");

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a word: ");
        String input = sc.nextLine();

        String reversed = "";

        for(int i = input.length() - 1; i >= 0; i--) {
            reversed = reversed + input.charAt(i);
        }

        if(input.equals(reversed)) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not a Palindrome");
        }

        sc.close();
        // ===== UC4 =====
        System.out.println("\nUC4: Character Array Based Palindrome Check");

        Scanner sc2 = new Scanner(System.in);
        System.out.print("Enter a word: ");
        String text = sc2.nextLine();

// convert to char array
        char[] chars = text.toCharArray();

        int start = 0;
        int end = chars.length - 1;
        boolean isPalindrome = true;

// two-pointer comparison
        while(start < end) {
            if(chars[start] != chars[end]) {
                isPalindrome = false;
                break;
            }
            start++;
            end--;
        }

// result
        if(isPalindrome) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not a Palindrome");
        }

        sc2.close();
    }
}