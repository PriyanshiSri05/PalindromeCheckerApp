import java.util.Stack;

public class PalindromeCheckerApp {

    public static void main(String[] args) {

        System.out.println("==================================");
        System.out.println("      PALINDROME CHECKER APP      ");
        System.out.println("==================================");
        System.out.println("UC5: Stack-Based Palindrome Checker");
        System.out.println("----------------------------------");

        String word = "madam";

        Stack<Character> stack = new Stack<>();

        // Push characters into stack
        for (int i = 0; i < word.length(); i++) {
            stack.push(word.charAt(i));
        }

        boolean isPalindrome = true;

        // Pop and compare
        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i) != stack.pop()) {
                isPalindrome = false;
                break;
            }
        }

        // Print result
        if (isPalindrome) {
            System.out.println("Result: " + word + " is a Palindrome");
        } else {
            System.out.println("Result: " + word + " is NOT a Palindrome");
        }
    }
}