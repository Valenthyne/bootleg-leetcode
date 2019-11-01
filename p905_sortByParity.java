class Solution {
    public int[] sortArrayByParity(int[] A) {
        int n = A.length;
        
        int[] odd = new int[n];
        int[] even = new int[n];
        int[] unity = new int[n];
        
        int x = 0;
        int y = 0;
        
        for (int i = 0; i < n; i++) {
            int val = A[i];
            if (val % 2 == 0) {
                even[y++] = val;
            } else {
                odd[x++] = val;
            }
        }
        
        int in = 0;
        
        for (int i = 0; i < y; i++) {
            unity[in++] = even[i];
        }
        
        for (int i = 0; i < x; i++) {
            unity[in++] = odd[i];
        }
        
        return unity;
    }
}
