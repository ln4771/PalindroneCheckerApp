import java.util.*;

public class PalindromeCheckerApp {

    public static boolean recursiveCheck(String s, int start, int end) {
        if (start >= end)
            return true;

        if (s.charAt(start) != s.charAt(end))
            return false;

        return recursiveCheck(s, start + 1, end - 1);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Palindrome Checker App");

        // UC2
        String word = "madam";
        String reverse = "";

        for (int i = word.length() - 1; i >= 0; i--)
            reverse += word.charAt(i);

        System.out.println("UC2: " + word.equals(reverse));

        // UC3
        System.out.print("Enter word: ");
        String input = sc.nextLine();

        String rev = "";

        for (int i = input.length() - 1; i >= 0; i--)
            rev += input.charAt(i);

        System.out.println("UC3: " + input.equals(rev));

        // UC4
        char[] chars = input.toCharArray();
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

        System.out.println("UC4: " + isPalindrome);

        // UC5
        Stack<Character> stack = new Stack<>();

        for (char c : input.toCharArray())
            stack.push(c);

        String stackRev = "";

        while (!stack.isEmpty())
            stackRev += stack.pop();

        System.out.println("UC5: " + input.equals(stackRev));

        // UC6
        String qInput = "civic";

        Queue<Character> q = new LinkedList<>();
        Stack<Character> s = new Stack<>();

        for (char c : qInput.toCharArray()) {
            q.add(c);
            s.push(c);
        }

        boolean qPal = true;

        while (!q.isEmpty()) {
            if (q.remove() != s.pop()) {
                qPal = false;
                break;
            }
        }

        System.out.println("UC6: " + qPal);

        // UC7
        Deque<Character> d = new ArrayDeque<>();

        String dq = "refer";

        for (char c : dq.toCharArray())
            d.add(c);

        boolean dPal = true;

        while (d.size() > 1) {
            if (d.removeFirst() != d.removeLast()) {
                dPal = false;
                break;
            }
        }

        System.out.println("UC7: " + dPal);

        // UC8
        LinkedList<Character> list = new LinkedList<>();

        String l = "level";

        for (char c : l.toCharArray())
            list.add(c);

        boolean lPal = true;

        while (list.size() > 1) {
            if (list.removeFirst() != list.removeLast()) {
                lPal = false;
                break;
            }
        }

        System.out.println("UC8: " + lPal);

        // UC9
        String rec = "madam";
        System.out.println("UC9: " + recursiveCheck(rec, 0, rec.length() - 1));

        // UC10
        String phrase = "A man a plan a canal Panama";
        String normalized = phrase.replaceAll("[^a-zA-Z]", "").toLowerCase();

        boolean normPal = true;

        for (int i = 0; i < normalized.length() / 2; i++) {
            if (normalized.charAt(i) != normalized.charAt(normalized.length() - 1 - i)) {
                normPal = false;
                break;
            }
        }

        System.out.println("UC10: " + normPal);

        // UC11
        PalindromeService service = new PalindromeService();
        System.out.println("UC11: " + service.checkPalindrome("racecar"));

        // UC12 Strategy Pattern
        PalindromeStrategy strategy = new StackStrategy();
        System.out.println("UC12: " + strategy.check("level"));

        // UC13 Performance Comparison
        String test = "level";

        long startTime = System.nanoTime();
        strategy.check(test);
        long endTime = System.nanoTime();

        System.out.println("UC13 Execution Time: " + (endTime - startTime) + " ns");

        sc.close();
    }
}

class PalindromeService {

    public boolean checkPalindrome(String input) {

        int start = 0;
        int end = input.length() - 1;

        while (start < end) {

            if (input.charAt(start) != input.charAt(end))
                return false;

            start++;
            end--;
        }

        return true;
    }
}

interface PalindromeStrategy {
    boolean check(String input);
}

class StackStrategy implements PalindromeStrategy {

    public boolean check(String input) {

        Stack<Character> stack = new Stack<>();

        for (char c : input.toCharArray())
            stack.push(c);

        for (char c : input.toCharArray()) {
            if (c != stack.pop())
                return false;
        }

        return true;
    }
            }
