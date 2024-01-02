package q28_find_the_ndex_of_the_first_occurrence_in_a_string;

/**
 * Given two strings needle and haystack, return the index of the first occurrence of needle in haystack, or -1 if
 * needle is not part of haystack.
 * <p>
 * Example 1:
 * <p>
 * Input: haystack = "sadbutsad", needle = "sad"
 * Output: 0
 * Explanation: "sad" occurs at index 0 and 6.
 * The first occurrence is at index 0, so we return 0.
 * Example 2:
 * <p>
 * Input: haystack = "leetcode", needle = "leeto"
 * Output: -1
 * Explanation: "leeto" did not occur in "leetcode", so we return -1.
 */
public class FindtheIndexoftheFirstOccurrenceinaString {
    public int strStr(String haystack, String needle) {
       return haystack.indexOf(needle);
    }
}
