class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashMap<Character,Integer> map=new HashMap<>();
        int n=s.length();
        int l=0,r=0,maxLen=0;

        while(r<n){
            char c=s.charAt(r);
            if(map.containsKey(c)){
                l = Math.max(l, map.get(c) + 1);
            }

            map.put(c,r);
            maxLen=Math.max(maxLen,r-l+1);


            r++;
        }
        return maxLen;
    }
}