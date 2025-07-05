class Pair{
    int step;
    String word;
    Pair(String word,int step){
        this.step=step;
        this.word=word;
    }
}

class Solution {
    public int ladderLength(String beginWord, String endWord, List<String> wordList) {
        Queue<Pair> q=new LinkedList<>();
        Set<String> set=new HashSet<>();

        for(int i=0;i<wordList.size();i++){
            set.add(wordList.get(i));
        }

        q.add(new Pair(beginWord,1));
        set.remove(beginWord);

        while(!q.isEmpty()){
            int step=q.peek().step;
            String word=q.peek().word;

            q.remove();

            if(word.equals(endWord)) return step;

            for(int i=0;i<word.length();i++){
                char wordArray[]=word.toCharArray();
                for(char ch='a';ch<='z';ch++){
                    wordArray[i]=ch;
                    String newWord = new String(wordArray);
                    if(set.contains(newWord)){
                        q.add(new Pair(newWord,step+1));
                        set.remove(newWord);
                    }
                }
            }
        }
        return 0;

    }
}