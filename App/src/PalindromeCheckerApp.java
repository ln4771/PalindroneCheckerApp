import java.util.Scanner;
import java.util.Stack;
import java.util.Queue;
import java.util.LinkedList;
import java.util.Deque;
import java.util.ArrayDeque;

public class PalindromeCheckerApp {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // ================= UC1 =================
        System.out.println("Palindrome Checker App");
        System.out.println("UC1: Application Entry & Welcome Message");

        // ================= UC2 =================
        System.out.println("\nUC2: Hardcoded Palindrome Result");

        String word = "madam";
        String reverse = "";

        for (int i = word.length() - 1; i >= 0; i--) {
            reverse += word.charAt(i);
        }

        if (word.equals(reverse))
            System.out.println(word + " is a Palindrome");
        else
            System.out.println(word + " is not a Palindrome");


        // ================= UC3 =================
        System.out.println("\nUC3: Palindrome Check Using String Reverse");

        System.out.print("Enter a word: ");
        String input = sc.nextLine();

        String reversed = "";

        for (int i = input.length() - 1; i >= 0; i--) {
            reversed += input.charAt(i);
        }

        System.out.println(input.equals(reversed) ? "Palindrome" : "Not a Palindrome");


        // ================= UC4 =================
        System.out.println("\nUC4: Character Array Based Palindrome Check");

        System.out.print("Enter a word: ");
        String text = sc.nextLine();

        char[] chars = text.toCharArray();
        int start = 0, end = chars.length - 1;
        boolean isPalindrome = true;

        while (start < end) {
            if (chars[start] != chars[end]) {
                isPalindrome = false;
                break;
            }
            start++;
            end--;
        }

        System.out.println(isPalindrome ? "Palindrome" : "Not a Palindrome");


        // ================= UC5 =================
        System.out.println("\nUC5: Stack-Based Palindrome Checker");

        System.out.print("Enter a word: ");
        String stackInput = sc.nextLine();

        Stack<Character> stack = new Stack<>();

        for (char c : stackInput.toCharArray()) {
            stack.push(c);
        }

        String reversedStack = "";

        while (!stack.isEmpty()) {
            reversedStack += stack.pop();
        }

        System.out.println(stackInput.equals(reversedStack) ? "Palindrome" : "Not a Palindrome");


        // ================= UC6 =================
        System.out.println("\nUC6: Queue + Stack Based Palindrome Check");

        String queueStackInput = "civic";

        Queue<Character> queue = new LinkedList<>();
        Stack<Character> stack2 = new Stack<>();

        for (char c : queueStackInput.toCharArray()) {
            queue.add(c);
            stack2.push(c);
        }

        boolean isPal = true;

        while (!queue.isEmpty()) {
            if (queue.remove() != stack2.pop()) {
                isPal = false;
                break;
            }
        }

        System.out.println("Input : " + queueStackInput);
        System.out.println("Is Palindrome? : " + isPal);


        // ================= UC7 =================
        System.out.println("\nUC7: Deque-Based Optimized Palindrome Checker");

        String dequeInput = "refer";

        Deque<Character> deque = new ArrayDeque<>();

        for (char c : dequeInput.toCharArray()) {
            deque.add(c);
        }

        boolean isDequePalindrome = true;

        while (deque.size() > 1) {
            if (deque.removeFirst() != deque.removeLast()) {
                isDequePalindrome = false;
                break;
            }
        }

        System.out.println("Input : " + dequeInput);
        System.out.println("Is Palindrome? : " + isDequePalindrome);

        sc.close();
    }
}        String input = sc.nextLine();

        String reversed = "";

        for (int i = input.length() - 1; i >= 0; i--)
            reversed += input.charAt(i);

        if (input.equals(reversed))
            System.out.println("Palindrome");
        else
            System.out.println("Not a Palindrome");


        // ================= UC4 =================
        System.out.println("\nUC4: Character Array Based Palindrome Check");

        System.out.print("Enter a word: ");
        String text = sc.nextLine();

        char[] chars = text.toCharArray();

        int start = 0;
        int end = chars.length - 1;
        boolean isPalindrome = true;

        while (start < end) {
            if (chars[start] != chars[end]) {
                isPalindrome = false;
                break;
            }
            start++;
            end--;
        }

        if (isPalindrome)
            System.out.println("Palindrome");
        else
            System.out.println("Not a Palindrome");


        // ================= UC5 =================
        System.out.println("\nUC5: Stack-Based Palindrome Checker");

        System.out.print("Enter a word: ");
        String inputWord = sc.nextLine();

        Stack<Character> stack = new Stack<>();

        for (char c : inputWord.toCharArray())
            stack.push(c);

        String reversedWord = "";

        while (!stack.isEmpty())
            reversedWord += stack.pop();

        if (inputWord.equals(reversedWord))
            System.out.println("Palindrome");
        else
            System.out.println("Not a Palindrome");


        // ================= UC6 =================
        System.out.println("\nUC6: Queue + Stack Based Palindrome Check");

        System.out.print("Enter a word: ");
        String qsInput = sc.nextLine();

        Queue<Character> queue = new LinkedList<>();
        Stack<Character> stack2 = new Stack<>();

        for (char c : qsInput.toCharArray()) {
            queue.add(c);
            stack2.push(c);
        }

        boolean palindromeQS = true;

        while (!queue.isEmpty()) {
            if (queue.remove() != stack2.pop()) {
                palindromeQS = false;
                break;
            }
        }

        if (palindromeQS)
            System.out.println("Palindrome");
        else
            System.out.println("Not a Palindrome");


        // ================= UC7 =================
        System.out.println("\nUC7: Deque-Based Optimized Palindrome Checker");

        System.out.print("Enter a word: ");
        String dequeInput = sc.nextLine();

        Deque<Character> deque = new ArrayDeque<>();

        // insert characters
        for (char c : dequeInput.toCharArray())
            deque.addLast(c);

        boolean palindromeDeque = true;

        // compare front & rear
        while (deque.size() > 1) {
            if (!deque.removeFirst().equals(deque.removeLast())) {
                palindromeDeque = false;
                break;
            }
        }

        if (palindromeDeque)
            System.out.println("Palindrome");
        else
            System.out.println("Not a Palindrome");

        sc.close();
    }
}
