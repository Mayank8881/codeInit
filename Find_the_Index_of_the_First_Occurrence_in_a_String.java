class Solution {
    public int strStr(String haystack, String needle) {
        int n=haystack.length();
        int m=needle.length();
        
        int lps[]=LPS(needle);
        
        int i=0;
        int j=0;
        
        while(i<n){
            if(haystack.charAt(i)==needle.charAt(j)){
                i++;
                j++;
            }
            
            else{
                if(j!=0){
                    j=lps[j-1];
                }else{
                    i++;
                }
            }
            if(j==m){
                return i-j;
            }
        
        }return -1;
    }
    public int[] LPS(String s){
        int n=s.length();
        int lps[]=new int[n];
        int l=0;
        int i=1;
        
        while(i<n){
            if(s.charAt(i)==s.charAt(l)){
                l++;
                lps[i]=l;
                i++;
            }
            else{
                if(l!=0){
                    l=lps[l-1];
                }
                else{
                    lps[i]=0;
                    i++;
                }
            }
        }
        return lps;
    }
}