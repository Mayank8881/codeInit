class Solution {
    public boolean isIsomorphic(String s, String t) {
        HashMap<Character,Integer> ss=new HashMap<>();
        HashMap<Character,Integer> tt=new HashMap<>();

        for(int i=0;i<s.length();i++){
            if(!ss.containsKey(s.charAt(i))){
                ss.put(s.charAt(i),i);
            }
            if(!tt.containsKey(t.charAt(i))){
                tt.put(t.charAt(i),i);
            }

            if(!ss.get(s.charAt(i)).equals(tt.get(t.charAt(i)))){
                return false;
            }
        }
        return true;

    }
}