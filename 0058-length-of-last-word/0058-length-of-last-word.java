class Solution {
    public int lengthOfLastWord(String s) {
        s=s.trim();
        int last=s.length()-1;
        int first=s.length()-1;

        while(s.charAt(first)!=' '){
            first--;
        }

        return last-first;
    }
}