class Solution {
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int m=obstacleGrid.length;
        int n=obstacleGrid[0].length;
        int dp[][]=new int[m][n];
        for(int i=0;i<m;i++){
            Arrays.fill(dp[i],-1);
        }
        return findPaths(obstacleGrid,m-1,n-1,dp);
    }

    int findPaths(int[][] arr,int m,int n,int[][] dp){
        
        if(arr[m][n]==1 )return 0;
        if(m==0 && n==0) return 1;

        if(dp[m][n]!=-1) return dp[m][n];

        int left=0;
        int top=0;

        if(n>0) top=findPaths(arr,m,n-1,dp);
        if(m>0) left=findPaths(arr,m-1,n,dp);

        dp[m][n]=top+left;
        return dp[m][n];
    }
}