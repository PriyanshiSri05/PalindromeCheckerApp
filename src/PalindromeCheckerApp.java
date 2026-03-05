import java.util.Scanner;

public class PalindromeCheckerApp {

    public static boolean method1(String str) {

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

    public static boolean method2(String str) {

        String reversed = new StringBuilder(str).reverse().toString();
        return str.equals(reversed);
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("PALINDROME CHECKER APP - UC13");
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        long start1 = System.nanoTime();
        boolean result1 = method1(input);
        long end1 = System.nanoTime();

        long start2 = System.nanoTime();
        boolean result2 = method2(input);
        long end2 = System.nanoTime();

        System.out.println("Method 1 Result: " + result1);
        System.out.println("Execution Time: " + (end1 - start1) + " ns");

        System.out.println("Method 2 Result: " + result2);
        System.out.println("Execution Time: " + (end2 - start2) + " ns");

        scanner.close();
    }
}