public class PalindromeCheckerApp {

    public static void main(String[] args) {

        System.out.println("==================================");
        System.out.println("      PALINDROME CHECKER APP      ");
        System.out.println("==================================");
        System.out.println("UC4: Character Array Based Palindrome Check");
        System.out.println("----------------------------------");

        String word = "radar";

        // Convert string to character array
        char[] characters = word.toCharArray();

        int start = 0;
        int end = characters.length - 1;

        boolean isPalindrome = true;

        // Two-pointer comparison
        while (start < end) {
            if (characters[start] != characters[end]) {
                isPalindrome = false;
                break;
            }
            start++;
            end--;
        }

        // Display result
        if (isPalindrome) {
            System.out.println("Result: " + word + " is a Palindrome");
        } else {
            System.out.println("Result: " + word + " is NOT a Palindrome");
        }
    }
}