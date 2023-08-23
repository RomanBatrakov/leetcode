package q1768_merge_strings_alternately;

/**
 * You are given two strings word1 and word2. Merge the strings by adding letters in alternating order, starting with
 * word1. If a string is longer than the other, append the additional letters onto the end of the merged string.
 * <p>
 * Return the merged string.
 */
public class MergeStringsAlternately {
    public String mergeAlternately(String word1, String word2) {
        int size = Math.max(word1.length(), word2.length());
        StringBuilder builder = new StringBuilder();

        for (int i = 0; i < size; i++) {
            if(word1.length() > i) builder.append(word1.charAt(i));

            if(word2.length() > i) builder.append(word2.charAt(i));
        }

        return String.valueOf(builder);
    }
}
