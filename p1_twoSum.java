class Solution {
    public int[] twoSum(int[] nums, int target) {
        
        // Create array to store results
        int[] res = new int[2];
        
        // Parse through the array one value at a time
        for (int i = 0; i < nums.length; i++) {
            // Parse through for the second value one at a time
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    res[0] = i;
                    res[1] = j;
                }
            }
        }
        
        return res;        
    }
}
