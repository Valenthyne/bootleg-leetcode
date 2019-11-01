int numJewelsInStones(char * J, char * S) {
    
    int jewels = 0;
    int j = 0;
    
    while (J[j] != '\0') {
        
        char * sPtr = &S[0];
        
        while (*sPtr != '\0') {
            
            if (*sPtr == J[j]) {
                jewels++;
            }
            
            sPtr++;
        }
        
        j++;
    }
    
    return jewels;

}
