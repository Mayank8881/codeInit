import java.util.*;
class Solution {
    public void reverseString(char[] s) {
        int j=s.length-1;
            for(int i=0;i<s.length/2;i++){
            char t=s[i];
            s[i]=s[j];
            s[j]=t;
            j--;
        
        }
    }
}