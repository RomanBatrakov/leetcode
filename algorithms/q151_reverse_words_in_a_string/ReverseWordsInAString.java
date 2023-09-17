package q151_reverse_words_in_a_string;

/**
 * Given an input string s, reverse the order of the words.
 * <p>
 * A word is defined as a sequence of non-space characters. The words in s will be separated by at least one space.
 * <p>
 * Return a string of the words in reverse order concatenated by a single space.
 * <p>
 * Note that s may contain leading or trailing spaces or multiple spaces between two words. The returned string
 * should only have a single space separating the words. Do not include any extra spaces.
 */
public class ReverseWordsInAString {
    public String reverseWords(String s) {
        String[] words = s.trim().split("\\s+");

        StringBuilder reversed = new StringBuilder();

        for (int i = words.length - 1; i >= 0; i--) {
            reversed.append(words[i]);
            if (i > 0) {
                reversed.append(" ");
            }
        }

        return reversed.toString();
    }
}
