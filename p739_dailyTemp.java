class Solution {
    public int[] dailyTemperatures(int[] T) {
        
        int n = T.length;
        
        int[] res = new int[n];
        
        for (int i = 0; i < n; i++) {
            int cur = T[i];
            int wait = 0;
            res[i] = wait;
            
            for (int j = i + 1; j < n; j++) {
                int today = T[j];
                wait++;
                if (today > cur) {
                    res[i] = wait;
                    break;
                }
            }
        }
        
        return res;
    }
}
