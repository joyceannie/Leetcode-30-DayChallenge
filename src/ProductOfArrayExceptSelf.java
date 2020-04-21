class ProductOfArrayExceptSelf {
    public int[] productExceptSelf(int[] nums) {
        int len =nums.length;
        int[] output = new int[len];
        output[0] = nums[0];
        for (int i=1; i<len; i++) {
            output[i] = output[i-1] * nums[i];
        }
        for (int i=len-2; i>=0;i--) {
            nums[i] = nums[i+1] * nums[i];
        }
        int temp = output[len-2];   
        for (int i=len-2; i>0; i--) {
            output[i] = output[i-1] * nums[i+1];
        }
        output[0] = nums[1];
        output[len-1] = temp;
        return output;
    }
}
