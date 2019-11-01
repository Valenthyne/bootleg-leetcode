class Solution {
    public int[] sortArrayByParityII(int[] A) {
        int n = A.length;
        
        int[] odd = new int[n / 2];
        int[] even = new int[n / 2];
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
        
        x = 0;
        y = 0;
        
        for (int i = 0; i < n;) {
            unity[i++] = even[y++];
            unity[i++] = odd[x++];
        }
        
        return unity;        
    }
}
