/**
 * @ClassName MaxStr
 * @Description TODO
 * @Author ZH
 * @Date 2020-06-19 22:18
 * @Version 1.0
 **/

import java.util.AbstractCollection;

/**
 * 最长公共前缀
 *
 * @author
 * @version 1.0
 * @create 2020-06-19 22:18
 **/
public class MaxStr_0014 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        String[] a = {"abc", "abcd"};
        System.out.println(solution.longestCommonPrefix(a));

    }

    public static class Solution {
        public String longestCommonPrefix(String[] strs) {
            if (strs == null || strs.length == 0) {
                return "";
            }

            String first = strs[0];
            for (int i = 1; i < strs.length; i++) {
                String second = strs[i];
                //标志数
                int sign = 0;
                //标志数小于俩字符串长度且各个位置字符一样时，标志数+1
                while (sign < first.length() && sign < second.length() && first.charAt(sign) == second.charAt(sign)) {
                    sign++;

                }
                //没有一样的
                if (sign == 0) {
                    return "";
                }
                //substring:返回字符串【0，标志数】位置的字符串
                first = second.substring(0, sign);
            }
            return first;

        }
    }
}
