class Solution {
    public int minDistance(String word1, String word2) {
        int dp[][]=new int[word1.length()][word2.length()];
        for(int i=0;i<word1.length();i++){
            for(int j=0;j<word2.length();j++){
                dp[i][j]=-1;
            }
        }
        int palindrom= lcs(word1,word2,word1.length()-1,word2.length()-1,dp);
        int ans=(word1.length()-palindrom)+(word2.length()-palindrom);
        return ans;
    }


    public int lcs(String s1,String s2,int n,int m,int dp[][]){
        if(m<0 || n<0) return 0;

        if(dp[n][m]!=-1) return dp[n][m];

        if(s1.charAt(n)==s2.charAt(m))  dp[n][m]=1+lcs(s1,s2,n-1,m-1,dp);
        else  dp[n][m]=0+Math.max(lcs(s1,s2,n-1,m,dp),lcs(s1,s2,n,m-1,dp));

        return dp[n][m];
    }
}