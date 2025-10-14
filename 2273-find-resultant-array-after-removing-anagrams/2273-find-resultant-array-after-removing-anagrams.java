class Solution {
    public List<String> removeAnagrams(String[] words) {
        List<String> ans = new ArrayList<>();
        List<Map<Character,Integer>> freq=new ArrayList<>();
        
        for(String w:words){
            Map<Character,Integer> map=new HashMap<>();
            for(char ch:w.toCharArray()){
                map.put(ch,map.getOrDefault(ch,0)+1);
            }

            freq.add(map);
        }

        ans.add(words[0]);
        for(int i=1;i<words.length;i++){
            if(!freq.get(i-1).equals(freq.get(i))){
                ans.add(words[i]);
            }
        }

        return ans;
    }
    
}