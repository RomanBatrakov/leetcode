package q334_increasing_triplet_subsequence;

/**
 * Given an integer array nums, return true if there exists a triple of indices (i, j, k) such that i < j < k and
 * nums[i] < nums[j] < nums[k]. If no such indices exists, return false.
 */
public class IncreasingTripletSubsequence {
    public boolean increasingTriplet(int[] nums) {
        if (nums.length < 3) return false;

        int min = nums[0];
        int curr = nums[1];
        int max;

        for (int i = 1; i < nums.length - 1; i++) {
            max = nums[nums.length - 1];

            if (nums[i - 1] < min) {
                curr = nums[i];
                min = nums[i - 1];
            }

            if (nums[i + 1] > max) max = nums[i + 1];
            if ((curr > nums[i] && nums[i] > min) || curr == min) curr = nums[i];

            if (min < curr && curr < max) return true;
        }

        return false;
    }
}
