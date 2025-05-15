class Solution {
    public List<String> getLongestSubsequence(String[] words, int[] groups) {
        List<String> list=new ArrayList<>();
        boolean isPick=true;
        list.add(words[0]);
        
        for(int i=1;i<groups.length;i++){
            if(groups[i]==groups[i-1]){
                isPick=!isPick;
            }
            if(isPick){
                list.add(words[i]);
            }
        }
        return list;
    }
}