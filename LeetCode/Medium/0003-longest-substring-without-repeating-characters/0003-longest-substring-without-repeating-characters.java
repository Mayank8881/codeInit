class Solution {
    public int lengthOfLongestSubstring(String s) {
  
        int maxCount=0;
        int count=0;
        int n=s.length();
        int l=0;
        int r=0;
        while(r<n){
            for(int i=l;i<r;i++){
                if(s.charAt(r)==s.charAt(i)){
                    l=i+1;
                    break;
                }
            }
            r++;
            count=r-l;
            maxCount=Math.max(maxCount,count);

        }
        return maxCount;
        }
    }