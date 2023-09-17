package q238_product_of_array_except_self;

/**
 * Given an integer array nums, return an array answer such that answer[i] is equal to the product of all the
 * elements of nums except nums[i].
 * <p>
 * The product of any prefix or suffix of nums is guaranteed to fit in a 32-bit integer.
 * <p>
 * You must write an algorithm that runs in O(n) time and without using the division operation.
 * <p>
 * <p>
 * <p>
 * Example 1:
 * <p>
 * Input: nums = [1,2,3,4]
 * Output: [24,12,8,6]
 * Example 2:
 * <p>
 * Input: nums = [-1,1,0,-3,3]
 * Output: [0,0,9,0,0]
 */
public class ProductOfArrayExceptSelf {
    public int[] productExceptSelf(int[] nums) {
        int N = nums.length;
        int[] outputArr = new int[N];

        outputArr[0] = 1;

        for (int i = 1; i < N; i++) {
            outputArr[i] = outputArr[i - 1] * nums[i - 1];
        }

        int R = 1;

        for (int i = N - 1; i >= 0; i--) {
            outputArr[i] = outputArr[i] * R;
            R = R * nums[i];
        }

        return outputArr;
    }
}
