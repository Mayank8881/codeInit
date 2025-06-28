class Solution {
    public int uniquePaths(int m, int n) {
        int dp[][]=new int[m+1][n+1];
        for(int i=0;i<=m;i++){
            for(int j=0;j<=n;j++){
                dp[i][j]=-1;
            }
        }
        return minPath(m,n,dp);
    }

    public int minPath(int m,int n,int[][] dp){
        if(m==1 && n==1) return 1;
        if(dp[m][n]!=-1) return dp[m][n];

        int top=0;
        int left=0;
        if(m>0){
            top=minPath(m-1,n,dp);
        }
        if(n>0){
            left=minPath(m,n-1,dp);
        }
        dp[m][n]=top+left;
        return dp[m][n];
    }
}