import java.util.Scanner;

public class MyMain {
    // Counts the number of 'a', 'b', and 'c' chars in str
    public static int countABC(final String str) {
        int a = 0;
        int len = str.length();
        for (int i = 0; i < len; i++) {
            if (str.charAt(i) == 'a') {
                a = a + 1;
            }
            else if (str.charAt(i) == 'b') {
                a = a + 1;
            }
            else if (str.charAt(i) == 'c') {
                a = a + 1;
            
            
            }
        }
        return a;
    }

    // Checks to see whether or not str contains 'The' or 'the'
    public static boolean containsThe(final String str) {
        String str2 = str.toLowerCase();
        int idx1 = str2.indexOf("the");
        if (idx1 == -1) {
            return false;
        }
        else {
            return true;
        }
       
    }

    // Checks whether str is a palindrome or not
    public static boolean isPalindrome(final String str) {
        int len2 = str.length();
        int a = 0;
        for (int i = len2 -1; i >= 0; i--) {
            if (str.charAt(i) == str.charAt(a)) {
                if (i-a == 1 || i-a == 0) {
                    return true;
                }
                a = a + 1;
            }
            else {
                return false;

            }
        }
        return false;

    }

    public static void main(final String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter a string: ");
        String str = scan.nextLine();
        System.out.println("Your string contains " + countABC(str) + " a's b's or c's");
        if (containsThe(str)) {
            System.out.println("Your string DOES contain the");
        }
        else {
            System.out.println("Your string DOES NOT contain the");
        }
        if (isPalindrome(str)) {
            System.out.println("Your string IS a palindrome");
        }
        else {
            System.out.println("Your string IS NOT a palindrome");
        }
    }
}