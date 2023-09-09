package q345_reverse_vowels_of_a_string;

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
