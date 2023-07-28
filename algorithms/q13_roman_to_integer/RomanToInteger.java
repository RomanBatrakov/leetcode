package q13_roman_to_integer;

import java.util.HashMap;

public class RomanToInteger {
    public int romanToInt(String s) {
        int result = 0;
        HashMap<Character, Integer> roman = new HashMap<>();
        roman.put('I', 1);
        roman.put('V', 5);
        roman.put('X', 10);
        roman.put('L', 50);
        roman.put('C', 100);
        roman.put('D', 500);
        roman.put('M', 1000);

        for (int i = 0; i < s.length(); i++) {
            Integer currentValue = roman.get(s.charAt(i));

            if ((i + 1 >= s.length()) || ((i + 1 < s.length()) && (currentValue >= roman.get(s.charAt(i + 1))))) {
                result += currentValue;
            } else {
                int value = roman.get(s.charAt(i + 1)) - currentValue;
                result += value;
                i++;
            }
        }

        return result;
    }
}
