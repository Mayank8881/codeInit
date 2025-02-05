class Solution {
    public boolean areAlmostEqual(String s1, String s2) {
        if(s1.equals(s2)){
            return true;
        }
        Map<Character,Integer> map1=new HashMap<>();
        Map<Character,Integer> map2=new HashMap<>();
        
        for(int i=0;i<s1.length();i++){
            map1.put(s1.charAt(i),i);
            map2.put(s2.charAt(i),i);
        }
        int diffCount=0;
        for (char key : map1.keySet()) {
            if (!map1.get(key).equals(map2.getOrDefault(key, 0))) {
                diffCount++;
            }
        }
        System.out.println(diffCount);
        
        if(diffCount>2){
            return false;
        }
        return true;

    }
}