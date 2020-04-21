class SearchInRotatedSortedArray {
    public int search(int[] nums, int target) {
        if (nums==null || nums.length==0) {
            return -1;
        }
        int low = 0;
        int high = nums.length-1;
        while (low<high) {
            int mid = (low+high)/2;
            if (nums[mid]==target) {
                return mid;
            }
             if (nums[low]<=nums[mid]) {
                if (target>=nums[low] && target<nums[mid]) {
                    high = mid - 1;
                } else {
                    low = mid + 1;
                }
            } else {
                if (nums[mid]<target && target<=nums[high]) {
                    low = mid + 1;
                } else {
                    high = mid - 1;
                }
            }
        }
        return nums[low]==target? low: -1;
    }
}
