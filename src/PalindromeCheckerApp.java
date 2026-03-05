import java.util.Scanner;

public class PalindromeCheckerApp {

    public static boolean recursivePalindrome(String str, int start, int end) {
        if (start >= end)
            return true;

        if (str.charAt(start) != str.charAt(end))
            return false;

        return recursivePalindrome(str, start + 1, end - 1);
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("PALINDROME CHECKER APP - UC9");
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        boolean result = recursivePalindrome(input, 0, input.length() - 1);

        if (result)
            System.out.println("Result: " + input + " is a Palindrome");
        else
            System.out.println("Result: " + input + " is NOT a Palindrome");

        scanner.close();
    }
}