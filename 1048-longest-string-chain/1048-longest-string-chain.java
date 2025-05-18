class Solution {
    public int longestStrChain(String[] words) {
        Arrays.sort(words, Comparator.comparingInt(String::length));
        int dp[]=new int[words.length];
        for(int i=0;i<words.length;i++){
            dp[i]=1;
        }

        int maxi=1;
        for(int i=0;i<words.length;i++){
            for(int prev=0;prev<i;prev++){
                if(compareStr(words[i],words[prev])){
                    dp[i]=Math.max(dp[i],(1+dp[prev]));
                }
            }
            maxi=Math.max(maxi,dp[i]);
        }
        return maxi;
    }
    public boolean compareStr(String s1,String s2){
        int i=0;
        int j=0;
        if(s1.length() !=s2.length()+1) return false;
        while(i<s1.length()){
            if(j<s2.length() && s1.charAt(i)==s2.charAt(j) ){
                i++;
                j++;
            }
            else{
                i++;
            }
        }
        if(i==s1.length() && j==s2.length()) return true;
        return false;
    }
}