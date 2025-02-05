class Solution {
    public boolean areAlmostEqual(String s1, String s2) {
        if(s1.equals(s2)){
            return true;
        }
        Map<Character,Integer> map1=new HashMap<>();
        Map<Character,Integer> map2=new HashMap<>();
        
        for(int i=0;i<s1.length();i++){
            map1.put(s1.charAt(i), map1.getOrDefault(s1.charAt(i), 0) + 1);
            map2.put(s2.charAt(i), map2.getOrDefault(s2.charAt(i), 0) + 1);
        }
        int diffCount=0;
        for (char key : map1.keySet()) {
            if (!map1.get(key).equals(map2.getOrDefault(key, 0))) {
                diffCount++;
            }
        }
        
        if(diffCount>2){
            return false;
        }
        return true;

    }
}