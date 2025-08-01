class Solution {
    public int minPathSum(int[][] grid) {
        int m=grid.length;
        int n=grid[0].length;
        int[][] dp=new int[m][n];
        for(int i=0;i<m;i++){
            Arrays.fill(dp[i],-1);
        }
        return findSum(grid,m-1,n-1,dp);
    }
    public int findSum(int[][] grid,int m,int n,int[][] dp){
        if(m==0 && n==0 ) return grid[0][0];
        if(dp[m][n]!=-1 )return dp[m][n];

        int top=Integer.MAX_VALUE;
        int left=Integer.MAX_VALUE;

        if(n>0) left=findSum(grid,m,n-1,dp);
        if(m>0) top=findSum(grid,m-1,n,dp);

        dp[m][n]=grid[m][n]+ Math.min(top,left);

        return dp[m][n];
    }
}