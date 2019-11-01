class Solution {
    public int searchInsert(int[] nums, int target) {

        if (nums[0] >= target) {
            return 0;
        }
        
        for (int i = 0; i < nums.length - 1; i++) {
            int val = nums[i];
            
            if (val == target) {
                return i;
            } else if (target <= nums[i + 1]) {
                return i + 1;
            }
        }
        
        return nums.length;
    }
}
