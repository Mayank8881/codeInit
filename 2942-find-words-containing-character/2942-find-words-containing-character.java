class Solution {
    public List<Integer> findWordsContaining(String[] words, char x) {
        List<Integer> list=new ArrayList<>();
        for(int i=0;i<words.length;i++){
            String str=String.valueOf(x);
            if(words[i].contains(str)){
                list.add(i);
            }
        }
        return list;
    }
}