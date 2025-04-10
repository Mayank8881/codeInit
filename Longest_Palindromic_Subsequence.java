class Solution {
    public int longestPalindromeSubseq(String s) {
        String str=new StringBuilder(s).reverse().toString();
        int dp[][]=new int[s.length()][str.length()];
        for(int i=0;i<s.length();i++){
            for(int j=0;j<str.length();j++){
                dp[i][j]=-1;
            }
        }
        return lcs(s,str,s.length()-1,str.length()-1,dp);
    }
    public int lcs(String s1,String s2,int n,int m,int dp[][]){
        if(m<0 || n<0) return 0;

        if(dp[n][m]!=-1) return dp[n][m];

        if(s1.charAt(n)==s2.charAt(m))  dp[n][m]=1+lcs(s1,s2,n-1,m-1,dp);
        else  dp[n][m]=0+Math.max(lcs(s1,s2,n-1,m,dp),lcs(s1,s2,n,m-1,dp));

        return dp[n][m];
    }
}
