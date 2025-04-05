class Solution {
    public int beautySum(String s) {
        int ans=0;        
        for(int i=0;i<s.length();i++){
            HashMap<Character,Integer> map=new HashMap<>();
            
            for(int j=i;j<s.length();j++){
                map.put(s.charAt(j),map.getOrDefault(s.charAt(j),0)+1);
                int maxCount=Integer.MIN_VALUE;
                int minCount=Integer.MAX_VALUE;
                
                for (int freq : map.values()) {
                    minCount = Math.min(minCount, freq);
                    maxCount = Math.max(maxCount, freq);
                }
                ans+=maxCount-minCount;

            }
            
        }
        return ans;
    }
}