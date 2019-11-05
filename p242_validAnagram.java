class Solution {
    public boolean isAnagram(String s, String t) {
        
        int[] charS = new int[26];
        int[] charT = new int[26];
        
        if (s.length() != t.length()) {
            return false;   
        }
        
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            int val = ch;
            charS[((val % 32) - 1)]++;
            
            ch = t.charAt(i);
            val = ch;
            charT[((val % 32) - 1)]++;
        }
        
        for (int i = 0; i < 26; i++) {
            if (charS[i] != charT[i]) {
                return false;
            }
        }
        
        return true;
    }
}
