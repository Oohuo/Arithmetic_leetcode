package com.oohuo;
/**
 *
 * @Description: 给出一个 32 位的有符号整数，你需要将这个整数中每位上的数字进行反转。
 *
 * 示例 1:
 *
 * 输入: 123
 * 输出: 321
 *  示例 2:
 *
 * 输入: -123
 * 输出: -321
 * 示例 3:
 *
 * 输入: 120
 * 输出: 21
 * 注意:
 *
 * 假设我们的环境只能存储得下 32 位的有符号整数，则其数值范围为 [−2^31,  2^31 − 1]。请根据这个假设，如果反转后整数溢出那么就返回 0。
 *
 * @auther: ZH
 * @date: 19:52 2020-06-18
 * @param:
 * @return:
 *
 */
public class int_reverse_0007 {

    public static void main(String[] args) {
       Solution solution = new Solution();
    //   int a = solution.reverse(123);
    //    int b = solution.reverse(-123);
        int c = solution.reverse(-2147483648);
     //   System.out.println(a);
//        System.out.println(b);
        System.out.println(c);

	// write your code here
    }
    static class Solution {
        public int reverse(int x) {
            int res = 0;
            while (x != 0) {
                int t = x % 10;
                int newRes = res * 10 + t;

                //2147483648

                //最后一步时
                // newRes=126087180
                // res=-846384741
                // 溢出后不等，退出返回0
                if ((newRes - t) / 10 != res) {
                    return 0;
                }
                res = newRes;
                x = x / 10;
            }
            return res;


        }
    }
}
