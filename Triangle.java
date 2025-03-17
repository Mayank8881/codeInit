class Solution {
    public int minimumTotal(List<List<Integer>> triangle) {
        int n=triangle.size();
        int dp[][]=new int[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                dp[i][j]=-1;
            }
        }
        return path(0,0,triangle,dp,n);
    }
    public int path(int i,int j,List<List<Integer>> triangle,int dp[][],int n){
        if(i==n-1) return triangle.get(i).get(j);
        if(dp[i][j]!=-1) return dp[i][j];

        int down=triangle.get(i).get(j)+path(i+1,j,triangle,dp,n);
        int diag=triangle.get(i).get(j)+path(i+1,j+1,triangle,dp,n);

        return dp[i][j]=Math.min(down,diag);
    }
}