/**
 * @ClassName MergeOrderedArray
 * @Description TODO
 * @Author ZH
 * @Date 2020-06-22 22:22
 * @Version 1.0
 **/

import java.util.Arrays;
/**
 *
 * @author
 * @create 2020-06-22 22:22
 * @version 1.0
 **/
public class MergeOrderedArray {
    public static void main(String[] args) {
        int[] a = new int[]{1, 2, 3, 0, 0, 0};
        int[] b = new int[]{2, 5, 7};


        System.out.println(solve(a, 3, b, 3));
    }

    private static void solve(int[] nums1, int m, int[] nums2, int n) {
        //投机取巧
        /*for (int i = 0; i < n; i++) {
            nums1[m]=nums2[i];
            m +=1;
        }
        Arrays.sort(nums1);
        return nums1;*/
        int i = m - 1, j = n - 1, index = m + n - 1;
        while (i >= 0 && j >= 0) {
            if (nums1[i] > nums2[j]) {
                nums1[index--] = nums1[i--];
            } else {
                nums1[index--] = nums2[j--];
            }
        }
        while (i >= 0) {
            nums1[index--] = nums1[i--];
        }
        while (j >= 0) {
            nums1[index--] = nums2[j--];
        }

    }
}

