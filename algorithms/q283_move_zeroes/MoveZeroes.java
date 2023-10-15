package q283_move_zeroes;

/**
 * Given an integer array nums, move all 0's to the end of it while maintaining the relative order of the non-zero
 * elements.
 * <p>
 * Note that you must do this in-place without making a copy of the array.
 */
public class MoveZeroes {
    public void moveZeroes(int[] nums) {
        int i = 0;
        int n = nums.length;

        for (int num : nums) {
            if (num != 0) {
                nums[i] = num;
                i++;
            }
        }

        while (i < n) {
            nums[i] = 0;
            i++;
        }
    }
}
