import java.util.*;

public class PalindromeCheckerApp {

    // UC9 recursive method
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

        System.out.println(word.equals(reverse));

        // UC3
        System.out.print("Enter word: ");
        String input = sc.nextLine();

        String rev = "";

        for (int i = input.length() - 1; i >= 0; i--)
            rev += input.charAt(i);

        System.out.println(input.equals(rev));

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

        System.out.println(isPalindrome);

        // UC5
        Stack<Character> stack = new Stack<>();

        for (char c : input.toCharArray())
            stack.push(c);

        String stackRev = "";

        while (!stack.isEmpty())
            stackRev += stack.pop();

        System.out.println(input.equals(stackRev));

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

        System.out.println(qPal);

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

        System.out.println(dPal);

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

        System.out.println(lPal);

        // UC9
        String rec = "madam";

        System.out.println(recursiveCheck(rec, 0, rec.length() - 1));

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

        System.out.println(normPal);

        // UC11
        PalindromeService service = new PalindromeService();

        String oopInput = "racecar";

        System.out.println(service.checkPalindrome(oopInput));

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
