import java.util.Scanner;

public class PalindromeCheckerApp {

    public static boolean checkPalindromeIgnoreCaseSpace(String str) {

        String normalized = str.replaceAll("\\s+", "").toLowerCase();

        int start = 0;
        int end = normalized.length() - 1;

        while (start < end) {
            if (normalized.charAt(start) != normalized.charAt(end))
                return false;

            start++;
            end--;
        }

        return true;
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("PALINDROME CHECKER APP - UC10");
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        boolean result = checkPalindromeIgnoreCaseSpace(input);

        if (result)
            System.out.println("Result: " + input + " is a Palindrome");
        else
            System.out.println("Result: " + input + " is NOT a Palindrome");

        scanner.close();
    }
}