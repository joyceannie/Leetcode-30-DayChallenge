class JumpGame {
    public boolean canJump(int[] nums) {
        int destination = nums.length-1;
        for (int i=nums.length-1; i>=0; i--) {
            if (i + nums[i]>=destination) {
                destination = i;
            }
        }
        return destination==0;
    }
}
