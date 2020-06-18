package com.oohuo;


import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author
 * @create 2020-06-18 21:02
 * @version 1.0
 **/
public class romanNumerals_0013 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.romanToInt("MCMXCIV"));

    }
    public static class Solution {
        public int romanToInt(String s) {
            if (s == null || s.length()==0) {
                return 0;
            }
            Map<Character, Integer> m = new HashMap<Character, Integer>();
            m.put('I', 1);
            m.put('V', 5);
            m.put('X', 10);
            m.put('L', 50);
            m.put('C', 100);
            m.put('D', 500);
            m.put('M', 1000);

            int length = s.length();
            System.out.println(length);

            int result = m.get(s.charAt(length - 1));
            for (int i = length - 2; i >= 0; i--) {
                if (m.get(s.charAt(i + 1)) <= m.get(s.charAt(i))) {
                    result += m.get(s.charAt(i));
                } else {
                    result -= m.get(s.charAt(i));
                }
            }
            /*int result = 0;
            for (int i = 0; i < s.length()-2; i++) {
                result +=m.get(s.charAt(i));

            }*/
            return result;
        }
    }
}
