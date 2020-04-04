public class MaximumSubarray {
	//Kadane's algorithm
    public int maxSubArray(int[] nums) {
        int sumSoFar = nums[0];
        int maxValue = nums[0];
        for (int i=1; i<nums.length; i++) {
            sumSoFar = Math.max(nums[i], sumSoFar+nums[i]);
            maxValue = Math.max(sumSoFar, maxValue);
        }
        return maxValue;
    }
}
