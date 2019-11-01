class Solution {
    public String defangIPaddr(String address) {
        
        String[] num = {"", "", "", ""};
        int j = 0;
        
        for (int i = 0; i < address.length(); i++) {
            char ch = address.charAt(i);
            if (ch == '.') {
                j++;
            } else {
                num[j] += ch;
            }
        }
        
        return num[0] + "[.]" + num[1] + "[.]" + num[2] + "[.]" + num[3];
        
    }
}
