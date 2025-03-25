import java.util.Scanner;

class PalindromeChecker {
    String str;

    PalindromeChecker(String str) {
        this.str = str;
    }

    boolean isPalindrome() {
        String reversedText = new StringBuilder(str).reverse().toString();
        return str.equalsIgnoreCase(reversedText);
    }

    void displayResults() {
        if (isPalindrome()) {
            System.out.println(str + " is a Palindrome");
        } else {
            System.out.println(str + " is not a Palindrome");
        }
    }
}

public class PalindromTest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the String: ");
        String str = input.nextLine();

        PalindromeChecker checker = new PalindromeChecker(str);
        checker.displayResults();

        input.close();
    }
}
