class Solution {
    public int beautySum(String s) {
        HashMap<Character,Integer> map=new HashMap<>();
        
        for(int i=0;i<s.length();i++){
            map.put(s.charAt(i),map.getOrDefault(s.charAt(i),0)+1);
        }
        int maxCount=Integer.MIN_VALUE;
        int minCount=Integer.MAX_VALUE;
        for(int i=0;i<s.length();i++){
            int count=map.get(s.charAt(i));
            minCount=Math.min(minCount,count);
            maxCount=Math.max(maxCount,count);
        }

        return max-min;
    }
}