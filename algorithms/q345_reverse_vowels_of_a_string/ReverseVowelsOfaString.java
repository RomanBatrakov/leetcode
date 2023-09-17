package q345_reverse_vowels_of_a_string;

/**
 * Given a string s, reverse only all the vowels in the string and return it.
 *
 * The vowels are 'a', 'e', 'i', 'o', and 'u', and they can appear in both lower and upper cases, more than once.
 */
public class ReverseVowelsOfaString {
    public String reverseVowels(String s) {
        char[] arr = s.toCharArray();
        int i = 0, j = arr.length - 1;
        String vowels = "aeiouAEIUO";

        while (i < j) {

            while (i < j) {
                char ch = arr[i];

                if (vowels.indexOf(ch) != -1) break;
                i++;
            }

            while (i < j) {
                char ch = arr[j];

                if (vowels.indexOf(ch) != -1) break;
                j--;
            }

            if (i < j) {
                char tmp = arr[i];
                arr[i] = arr[j];
                arr[j] = tmp;
                i++;
                j--;
            }

        }

        return new String(arr);
    }
}
