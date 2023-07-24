package q383_ransom_note;

/**Given two strings ransomNote and magazine, return true if ransomNote can be constructed by using the letters from
 * magazine and false otherwise.
 * Each letter in magazine can only be used once in ransomNote.
 */

public class RansomNote {
    public static boolean canConstruct(String ransomNote, String magazine) {
        if (ransomNote.length() > magazine.length()) return false;
        int[] alphabets_counter = new int[26]; //количество строчных букв в английском алфавите

        for (char c : magazine.toCharArray())
            alphabets_counter[c-'a']++; //Индекс каждого элемента в массиве соответствует коду символа в таблице ASCII, преобразованного так, чтобы 'a' было в 0, 'b' в 1 и так далее.

        for (char c : ransomNote.toCharArray()){
            if (alphabets_counter[c-'a'] == 0) return false; //После этого выполняется проход по символам строки ransomNote, и для каждого символа уменьшается соответствующий элемент в массиве alphabets_counter.
            alphabets_counter[c-'a']--;
        }
        return true;
    }
}
