class Solution {
    public int countPalindromicSubsequence(String s) {
        HashMap<Character,Integer> right=new HashMap<>();
        HashSet<Character> left=new HashSet<>();
        HashSet<String> uniquePalindromes = new HashSet<>();

        for(char ch:s.toCharArray()){
            right.put(ch, right.getOrDefault(ch, 0) + 1);
        }

        int count=0;

        for(int i=0;i<s.length();i++){
            char middleChar=s.charAt(i);
            right.put(middleChar, right.get(middleChar) - 1);
            if (right.get(middleChar) == 0) {
                right.remove(middleChar);
            }

            for (char leftChar : left) {
                if (right.containsKey(leftChar)) {
                    String palindrome = "" + leftChar + middleChar + leftChar;
                    uniquePalindromes.add(palindrome);
                    
                }
            }
            left.add(s.charAt(i));
        }
        return uniquePalindromes.size();
    }
}