import java.util.Scanner;

interface PalindromeStrategy {
    boolean checkPalindrome(String str);
}

class ReverseStrategy implements PalindromeStrategy {

    public boolean checkPalindrome(String str) {
        String reversed = new StringBuilder(str).reverse().toString();
        return str.equals(reversed);
    }
}

class TwoPointerStrategy implements PalindromeStrategy {

    public boolean checkPalindrome(String str) {

        int start = 0;
        int end = str.length() - 1;

        while (start < end) {
            if (str.charAt(start) != str.charAt(end))
                return false;

            start++;
            end--;
        }

        return true;
    }
}

class PalindromeContext {

    private PalindromeStrategy strategy;

    public void setStrategy(PalindromeStrategy strategy) {
        this.strategy = strategy;
    }

    public boolean executeStrategy(String str) {
        return strategy.checkPalindrome(str);
    }
}

public class PalindromeCheckerApp {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("PALINDROME CHECKER APP - UC12");
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        PalindromeContext context = new PalindromeContext();

        context.setStrategy(new ReverseStrategy());
        boolean result1 = context.executeStrategy(input);

        context.setStrategy(new TwoPointerStrategy());
        boolean result2 = context.executeStrategy(input);

        System.out.println("Reverse Strategy Result: " + result1);
        System.out.println("Two Pointer Strategy Result: " + result2);

        scanner.close();
    }
}