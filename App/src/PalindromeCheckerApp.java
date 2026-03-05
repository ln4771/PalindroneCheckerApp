import java.util.Scanner;

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

        if (word.equals(reverse)) {
            System.out.println(word + " is a Palindrome");
        } else {
            System.out.println(word + " is not a Palindrome");
        }

        // ================= UC3 =================
        System.out.println("\nUC3: Palindrome Check Using String Reverse");

        System.out.print("Enter a word: ");
        String input = sc.nextLine();

        String reversed = "";

        for (int i = input.length() - 1; i >= 0; i--) {
            reversed += input.charAt(i);
        }

        if (input.equals(reversed)) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not a Palindrome");
        }

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

        if (isPalindrome) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not a Palindrome");
        }

        sc.close();
    }
}        System.out.println("\nUC2: Hardcoded Palindrome Result");

        String word = "madam";
        String reverse = "";

        for (int i = word.length() - 1; i >= 0; i--)
            reverse += word.charAt(i);

        if (word.equals(reverse))
            System.out.println(word + " is a Palindrome");
        else
            System.out.println(word + " is not a Palindrome");


        // ================= UC3 =================
        System.out.println("\nUC3: Palindrome Check Using String Reverse");

        System.out.print("Enter a word: ");
        String input = sc.nextLine();

        String reversed = "";

        for (int i = input.length() - 1; i >= 0; i--)
            reversed += input.charAt(i);

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
        String inputWord = sc.nextLine();

        Stack<Character> stack = new Stack<>();

        for (char c : inputWord.toCharArray())
            stack.push(c);

        String reversedWord = "";

        while (!stack.isEmpty())
            reversedWord += stack.pop();

        System.out.println(inputWord.equals(reversedWord) ? "Palindrome" : "Not a Palindrome");


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

        System.out.println(palindromeQS ? "Palindrome" : "Not a Palindrome");


        // ================= UC7 =================
        System.out.println("\nUC7: Deque-Based Optimized Palindrome Checker");

        System.out.print("Enter a word: ");
        String dequeInput = sc.nextLine();

        Deque<Character> deque = new ArrayDeque<>();

        for (char c : dequeInput.toCharArray())
            deque.addLast(c);

        boolean palindromeDeque = true;

        while (deque.size() > 1) {
            if (!deque.removeFirst().equals(deque.removeLast())) {
                palindromeDeque = false;
                break;
            }
        }

        System.out.println(palindromeDeque ? "Palindrome" : "Not a Palindrome");


        // ================= UC8 =================
        System.out.println("\nUC8: Linked List Based Palindrome Checker");

        System.out.print("Enter a word: ");
        String llInput = sc.nextLine();

        // Build linked list
        Node head = null, tail = null;

        for (char c : llInput.toCharArray()) {
            Node newNode = new Node(c);
            if (head == null) {
                head = tail = newNode;
            } else {
                tail.next = newNode;
                tail = newNode;
            }
        }

        // Find middle using slow & fast pointers
        Node slow = head, fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        // Reverse second half
        Node prev = null, curr = slow;

        while (curr != null) {
            Node nextTemp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = nextTemp;
        }

        // Compare halves
        Node firstHalf = head;
        Node secondHalf = prev;
        boolean palindromeLL = true;

        while (secondHalf != null) {
            if (firstHalf.data != secondHalf.data) {
                palindromeLL = false;
                break;
            }
            firstHalf = firstHalf.next;
            secondHalf = secondHalf.next;
        }

        System.out.println(palindromeLL ? "Palindrome" : "Not a Palindrome");

        sc.close();
    }
}
