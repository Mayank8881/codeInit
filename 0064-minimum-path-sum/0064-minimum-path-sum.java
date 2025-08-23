class Solution {
    public int minPathSum(int[][] grid) {
        int m=grid.length;
        int n=grid[0].length;
        int dp[][]=new int[m][n];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                dp[i][j]=-1;
            }
        }
        return path(m-1,n-1,grid,dp);
    }

    public int path(int m,int n,int grid[][],int dp[][]){
        if(m==0 && n==0) return grid[m][n];
        if(m<0 || n<0 ) return Integer.MAX_VALUE;
        
        if(dp[m][n]!=-1) return dp[m][n];
        int up=path(m-1,n,grid,dp);
        int left=path(m,n-1,grid,dp);

        return dp[m][n]=grid[m][n]+Math.min(up,left);
    }
    
}