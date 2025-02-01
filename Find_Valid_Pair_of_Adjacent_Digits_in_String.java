class Solution {
    public String findValidPair(String s) {
        Map<Character,Integer> map=new HashMap<>();
        for(char c:s.toCharArray()){
            map.put(c,map.getOrDefault(c,0)+1);
        }
        // System.out.println(map);
        for(int i=0;i<s.length()-1;i++){
            char first=s.charAt(i);
            char second=s.charAt(i+1);
            // System.out.println(first);
            
            if(first!=second){
                int fcount=map.getOrDefault(first,0);
                int scount=map.getOrDefault(second,0);
                
                if(fcount==Character.getNumericValue(first) && scount==Character.getNumericValue(second)){
                    return ""+first+second;
                }
            }
        }
        return "";
    }
}