package q643_maximum_average_subarray;

public class MaximumAverageSubarrayI {
    public double findMaxAverage(int[] nums, int k) {
        int maxSum = 0;
        int currSum = 0;

        for (int i = 0; i < nums.length; i++) {
            if (i >= k) {
                currSum = currSum + nums[i] - nums[i - k];
                if (currSum > maxSum) maxSum = currSum;
            } else {
                currSum = currSum + nums[i];
                maxSum = currSum;
            }
        }

        return (double) maxSum /k;
    }
}
