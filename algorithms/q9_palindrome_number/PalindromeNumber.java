package q9_palindrome_number;

public class PalindromeNumber {
    public boolean isPalindrome(int x) {
        char[] chars = ("" + x).toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] != chars[chars.length - i - 1]) return false;
        }
        return true;
    }
}
