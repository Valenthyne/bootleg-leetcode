class Solution {
    public boolean containsDuplicate(int[] nums) {
        
        HashSet<Integer> set = new HashSet<>();
        
        for (int i = 0; i < nums.length; i++) {
            int val = nums[i];
            if (set.contains(val)) {
                return true;
            } else {
                set.add(val);
            }
        }
        
        return false;
    }
}
