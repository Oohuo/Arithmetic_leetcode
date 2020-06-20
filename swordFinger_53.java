/**
 * @ClassName swordFinger_53
 * @Description TODO
 * @Author ZH
 * @Date 2020-06-20 20:57
 * @Version 1.0
 **/

/**
 * @author
 * @version 1.0
 * @create 2020-06-20 20:57
 **/
public class swordFinger_53 {
    public static void main(String[] args) {

        Solution solution = new Solution();
        int[] test = {0, 1, 2, 4, 5, 7, 6};
        System.out.println(solution.missingNumber(test));

    }
    /*static class Solution {
        public int missingNumber(int[] nums) {
            int sign = 0;
            for (int num : nums) {
                if(sign == num){
                    sign++;
                }

            }
            return sign;

        }
    }*/

    static class Solution {
        public int missingNumber(int[] nums) {
            int min = 0, max = nums.length;
            while (min < max) {
                int mid = (min + max) / 2;
                if (nums[mid] != mid) {
                    max = mid;
                } else {
                    min = mid + 1;
                }
            }
            return min == nums.length - 1 && nums[min] == min ? min + 1 : min;
        }
    }
}
