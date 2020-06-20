/**
 * @ClassName RightLargest
 * @Description TODO
 * @Author ZH
 * @Date 2020-06-20 21:16
 * @Version 1.0
 **/

/**
 *给你一个数组 arr ，请你将每个元素用它右边最大的元素替换，如果是最后一个元素，用 -1 替换。
 *
 * 完成所有替换操作后，请你返回这个数组。
 *
 *  
 *
 * 示例：
 *
 * 输入：arr = [17,18,5,4,6,1]
 * 输出：[18,6,6,6,1,-1]
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/replace-elements-with-greatest-element-on-right-side
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 * @author
 * @create 2020-06-20 21:16
 * @version 1.0
 **/
public class RightLargest {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] test = {0, 1, 2, 4, 5, 7, 6};
        int[] later = solution.replaceElements(test);
        for (int i : later) {
            System.out.print(i+" ");

        }

    }
    //逆序循环依次放入右边最大值

    static class Solution {
        public int[] replaceElements(int[] arr) {
            int curMax = -1;
            for (int i = arr.length - 1; i >= 0; i--) {

                int curVal = arr[i];
                arr[i] = curMax;
                curMax = Math.max(curMax, curVal);
            }

            return arr;

        }
    }
}
